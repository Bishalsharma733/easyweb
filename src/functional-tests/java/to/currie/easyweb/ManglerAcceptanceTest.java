package to.currie.easyweb;

import static org.junit.Assert.*;

import org.junit.Test;

import com.meterware.httpunit.WebConversation;
import com.meterware.httpunit.WebResponse;

public class ManglerAcceptanceTest {

    @Test
    public void testIndex() throws Exception {
        WebConversation wc = new WebConversation();
        WebResponse wr = wc.getResponse("http://localhost:8080/easyweb");
        assertEquals("Test Mangler", wr.getTitle());
    }
}
