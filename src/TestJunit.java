import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by Joel on 3/11/2017.
 */
public class TestJunit {

    String message = "Hello World";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        assertEquals(message,messageUtil.printMessage());
    }
}
