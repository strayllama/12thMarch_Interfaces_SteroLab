import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMP3Player {
    private MP3Player mp3Player;
    private Stero stero;

    @Before
    public void before() {
        stero = new Stero("Black Boom Box");
        mp3Player = new MP3Player();
    }

    @Test
    public void MP3CanConnect() {
        assertEquals("Connected to Black Boom Box", mp3Player.connect(stero));
    }

}