import java.util.*;
public class Codewars {
  public static String oddOrEven (int[] array) {
  if(Arrays.stream(array).sum() % 2 == 0){
    return "even";
  }else{
    return "odd";
  }
  }
}


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void exampleTest() {
        assertEquals("odd", Codewars.oddOrEven(new int[] {2, 5, 34, 6}));
    }
}
