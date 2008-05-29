package to.currie.easyweb;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMangler {

    @Test
    public void testMangle() {
        Mangler m = new Mangler();
        String s = m.mangle("hi there");
        assertEquals("Hi There", s);
    }
}
