package designPatterns.structural.facade;

import designPatterns.structural.facade.audiofacade.AudioSystemFacade;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        AudioSystemFacade audioSystem = new AudioSystemFacade();
        audioSystem.playAudio("Some audio track");
        Thread.sleep(10000);
        // ... Other operations
        audioSystem.stopAudio();
    }
}
