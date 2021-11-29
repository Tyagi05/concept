package com.headfirst;
import javax.sound.midi. *;
public class Musictest1 {
public void play(){
    try {
        Sequencer sequencer = MidiSystem.getSequencer();
        System.out.println("successfully got a sequencer");
    } catch(MidiUnavailableException ex){
        System.out.println("Bummer");

    }
}

public static void main(String[] args) {
    Musictest1 mt = new Musictest1();
    mt.play();
}


}