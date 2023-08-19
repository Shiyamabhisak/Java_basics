package designPatterns.structural.facade.audiofacade;

import designPatterns.structural.facade.components.Amplifier;
import designPatterns.structural.facade.components.CDPlayer;
import designPatterns.structural.facade.components.Speakers;

public class AudioSystemFacade {
    private Amplifier amplifier;
    private CDPlayer cdPlayer;
    private Speakers speakers;

    public AudioSystemFacade() {
        this.amplifier = new Amplifier();
        this.cdPlayer = new CDPlayer();
        this.speakers = new Speakers();
    }

    public void playAudio(String audio) {
        amplifier.on();
        cdPlayer.load(audio);
        cdPlayer.play();
        speakers.on();
        speakers.setVolume(10);
    }

    public void stopAudio() {
        cdPlayer.stop();
        cdPlayer.eject();
        amplifier.off();
        speakers.off();
    }
}
