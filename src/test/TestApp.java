package test;

import com.oskarro.soundwave.fingerprint.FingerprintSimilarity;
import com.oskarro.soundwave.wave.Wave;

import java.util.logging.Logger;

public class TestApp {

    private static final Logger LOGGER = Logger.getLogger(TestApp.class.getName());

    public static void main(String[] args) {

        String firstPath = "/Users/oskarro/Downloads/WESTBAM.wav";
        String secondPath = "/Users/oskarro/Downloads/YOMANDA.wav";

        Wave wave1 = new Wave(firstPath);
        Wave wave2 = new Wave(secondPath);

        FingerprintSimilarity fingerprintSimilarity = wave1.getFingerprintSimilarity(wave2);
        float result = fingerprintSimilarity.getSimilarity();

        LOGGER.info(String.format("Result [fingerprint similarity] -- %s", result));

        /*
        * JAVE LIB (for converting files)
        * https://www.sauronsoftware.it/projects/jave/manual.php#1
        *
        * JAVA WAV FILE IO
        * http://www.labbookpages.co.uk/audio/javaWavFiles.html#reading
        *
        * MUSICG
        * https://code.google.com/archive/p/musicg/
        * https://sites.google.com/site/musicgapi/technical-documents/wav-file-format
        * https://github.com/madyx/musicg
        * https://github.com/loisaidasam/musicg
        *
        * HTK
        * https://htk.eng.cam.ac.uk/
        *
        * ALGORITHM
        * https://www.ee.columbia.edu/~dpwe/papers/Wang03-shazam.pdf
        *
        * */
    }
}
