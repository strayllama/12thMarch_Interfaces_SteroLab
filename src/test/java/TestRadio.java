import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRadio {
    private Radio radio;

    @Before
    public void before() {
        this.radio = new Radio("FM/AM Master");
    }

    @Test
    public void hasName() {
        assertEquals("FM/AM Master", radio.getName());
    }

    @Test
    public void startsUntuned() {
        assertEquals(null, radio.getCurrentStation());
    }

    @Test
    public void canSkipUpStation() {
        assertEquals("Skipped to next station", radio.next());
    }

    @Test
    public void canSkipDownStation() {
        assertEquals("Skipped back a station", radio.previous());
    }

    @Test
    public void canManuallyTuneUp() {
        assertEquals("Tuning up a bit", radio.manualForward());
    }

    @Test
    public void canManuallyTuneDown() {
        assertEquals("Tuning down a bit", radio.manualBackward());
    }


}