package thePackage;

import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.fail;

public class TestClassTest {




    @Test
    public void testTest(){}

    @Test
    public void testWillAlwaysFail() {
	fail("An error message");
    }

}
