public class Kata
{
  public static String greet(String name){
    return "Hello, " +  name + " how are you doing today?";
  }
}

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void testSomething() {
        assertEquals("Hello, Ryan how are you doing today?", Kata.greet("Ryan"));
    }
}
