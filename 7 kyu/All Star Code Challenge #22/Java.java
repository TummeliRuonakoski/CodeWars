public class timeConverter{
  public static String toTime(int seconds){
   
  return seconds / 3600 + " hour(s) and " + seconds / 60  % 60 + " minute(s)";
   
  }
}



import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class timeConverterTest {
  
    @Test
    public void fixedTests() {
        assertEquals("1 hour(s) and 0 minute(s)", timeConverter.toTime(3600));
        assertEquals("1 hour(s) and 0 minute(s)", timeConverter.toTime(3601));  
        assertEquals("0 hour(s) and 58 minute(s)", timeConverter.toTime(3500));
        assertEquals("89 hour(s) and 51 minute(s)", timeConverter.toTime(323500));
        assertEquals("0 hour(s) and 0 minute(s)", timeConverter.toTime(0));
    }
}
