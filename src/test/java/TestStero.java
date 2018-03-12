import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestStero {
    private Stero myStero;

    @Before
    public void before() {
        myStero = new Stero("BIG STACK");
    }

    @Test
    public void steroHasName() {
        assertEquals("BIG STACK", myStero.getName());
    }




}
