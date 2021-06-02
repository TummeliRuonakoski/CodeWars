public class Solution {
  public static int century(int number) {
  double century = (double)number / 100; 
  century = Math.ceil(century);
  return (int)century;
  }
}

public class Solution {
  public static int century(int number) {
     return (number + 99) / 100;
  }
}



import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
public class Tests {
    @Test
    public void FixedTests() {
        assertEquals(18, Solution.century(1705));
        assertEquals(19, Solution.century(1900));
        assertEquals(17, Solution.century(1601));
        assertEquals(20, Solution.century(2000));
        assertEquals(1,  Solution.century(89));
    }
}
