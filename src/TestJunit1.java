import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by Joel on 3/11/2017.
 */
public class TestJunit1 {
    @Test
    public void testAdd() {
        //test data
        int num = 5;
        String temp = null;
        String str = "Junit is working fine";

        //check for equality
        assertEquals("Junit is working fine", str);

        //check for false condition
        assertFalse(false);

        //check for not null value
        assertNotNull(str);
    }
}

