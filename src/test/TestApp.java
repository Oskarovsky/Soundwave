package test;

import com.oskarro.soundwave.fingerprint.FingerprintSimilarity;
import com.oskarro.soundwave.wave.Wave;

import java.util.logging.Logger;

public class TestApp {

    private static final Logger LOGGER = Logger.getLogger(TestApp.class.getName());

    public static void main(String[] args) {

        String firstPath = "/home/oskarro/Music/WESTBAM.wav";
        String secondPath = "/home/oskarro/Music/YOMANDA.wav";

        Wave wave1 = new Wave(firstPath);
        Wave wave2 = new Wave(secondPath);

        FingerprintSimilarity fingerprintSimilarity = wave1.getFingerprintSimilarity(wave2);
        float result = fingerprintSimilarity.getSimilarity();

        LOGGER.info(String.format("Result [fingerprint similarity] -- %s", result));
    }
}
