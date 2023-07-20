import org.example.Main;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;
public class LeapYearTest {
    @Test
    public void testLeapYear(){
        Assertions.assertEquals("Leap Year", Main.isLeap(2000));
        Assertions.assertEquals("Leap Year", Main.isLeap(1996));
        Assertions.assertEquals("Not a Leap Year", Main.isLeap(2010));
        Assertions.assertEquals("Not a Leap Year", Main.isLeap(2014));
    }

}
