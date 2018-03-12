import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestCD {
    private CDPlayer cdPlayer;

    @Before
    public void before() {
        cdPlayer = new CDPlayer("Sony BetaII");
    }

    @Test
    public void currentMediaEmpty() {
        assertEquals("empty", cdPlayer.getCurrentMedia());
    }

    @Test
    public void hasName(){
        assertEquals("Sony BetaII", cdPlayer.getName());
    }

    @Test
    public void canLoadMedia() {
        cdPlayer.load("Britney's Greatest");
        assertEquals("Britney's Greatest", cdPlayer.getCurrentMedia());
    }

    @Test
    public void canUnload() {
        cdPlayer.load("Britney's Greatest");
        cdPlayer.unload();
        assertEquals("empty", cdPlayer.getCurrentMedia());
    }

    @Test
    public void canPlayMedia() {
        cdPlayer.load("Sting's worst");
        assertEquals("Sting's worst is playing", cdPlayer.play());
        assertTrue(cdPlayer.isPlaying());
    }


    @Test
    public void canStop() {
        cdPlayer.load("Some tunes");
        cdPlayer.play();
        cdPlayer.stop();
        assertFalse(cdPlayer.isPlaying());

    }

    @Test
    public void canPause() {
        cdPlayer.load("Sting's worst");
        cdPlayer.play();
        cdPlayer.pause();
        assertEquals(false, cdPlayer.isPlaying());
        assertEquals("Paused", cdPlayer.pause());
    }

    @Test
    public void canSkipForwards() {
        cdPlayer.load("Sting's worst");
        assertEquals("Skipping to next track", cdPlayer.next());
    }

    @Test
    public void cantSkipForwardsWhenNotLoaded() {
        assertEquals("Not loaded", cdPlayer.next());
    }

    @Test
    public void canSkipBackward() {
        cdPlayer.load("Sting's worst");
        assertEquals("Skipping to previous track", cdPlayer.previous());
    }

    @Test
    public void canSkipForwardsManually() {
        cdPlayer.load("Sting's worst");
        cdPlayer.play();
        assertEquals("Fast forwarding cd....", cdPlayer.manualForward());
    }

    @Test
    public void cantSkipForwardsManuallyNotPlaying() {
        assertEquals("Can't fast forward", cdPlayer.manualForward());
    }

    @Test
    public void canSkipBackwardsManually() {
        cdPlayer.load("Sting's worst");
        cdPlayer.play();
        assertEquals("Fast rewinding cd....", cdPlayer.manualBackward());
    }

    @Test
    public void cantSkipBackwardsManually() {
        assertEquals("Can't fast rewind", cdPlayer.manualBackward());
    }

}
