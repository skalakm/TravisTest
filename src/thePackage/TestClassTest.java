package thePackage;

import org.junit.Test;

import static org.junit.Assert.fail;

public class TestClassTest {

    @Test
    public void testNothing() {
    }

    @Test
    public void testWillAlwaysFail() {
        fail("An error message");
    }

}
