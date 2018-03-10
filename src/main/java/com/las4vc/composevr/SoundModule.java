package com.las4vc.composevr;

import com.bitwig.extension.api.opensoundcontrol.OscMessage;
import com.bitwig.extension.controller.api.*;
import com.las4vc.composevr.protocol.*;
import com.google.protobuf.ByteString;
import com.sun.org.apache.bcel.internal.generic.VariableLengthInstruction;
import com.sun.org.apache.xpath.internal.operations.Mod;

/**
 * A SoundModule contains a reference to a track, an instrument, and a number of device modules
 *
 * @author Lane Spangler
 */

public class SoundModule extends RemoteEventHandler {

    private Track track;
    private String id;

    public SoundModule(DAWModel model, Module.CreateSoundModule creationEvent){
        super(model);
        this.id = creationEvent.getSenderId();

        //Create a track at the beginning of the root level list of tracks
        model.app.createInstrumentTrack(0);

        //Scroll to the first track
        model.mainTrackBank.scrollToChannel(0);

        //Get the track
        this.track = model.mainTrackBank.getChannel(0);


        //Name the track
        try{
            this.track.setName(id);

            model.router.addReceiver(this, id);

            //Confirm sound module creation with client
            RemoteEventEmitter.OnSoundModuleCreated(model, id);

        }catch(NullPointerException e){
            model.host.println("Sound module could not create new track");
        }
    }

    /**
     * Requests for browser to open on the track for this sound module
     */
    public void OpenBrowser(Protocol.Event e){
        model.host.println("Opening browser");
        model.browser.openBrowser(this.track, e.getModuleEvent().getOpenBrowserEvent().getDeviceType());
        this.track.arm().set(true);
    }

    public void handleOSC(OscMessage msg){
        String[] splitPath = msg.getAddressPattern().split("/");

        int MIDI = msg.getInt(0);
        int Note = MIDI & 0xFF;
        int Velocity = MIDI >> 16;

        if(splitPath[splitPath.length - 1].equals("on")){
            this.track.startNote(Note, Velocity);
        }else{
            this.track.stopNote(Note, Velocity);
        }

    }

    public void PlayMIDINote(Protocol.Event e){
        ByteString MIDIData = e.getModuleEvent().getMidiNoteEvent().getMIDI();

        if(MIDIData.byteAt(0) == -112){
            this.track.startNote(MIDIData.byteAt(1), MIDIData.byteAt(2));
        }else{
            this.track.stopNote(MIDIData.byteAt(1), MIDIData.byteAt(2));
        }
    }

}
