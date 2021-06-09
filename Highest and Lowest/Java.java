

import java.util.*;
public class Kata {
  public static String highAndLow(String numbers) {
   int min = Arrays.stream(numbers.split(" "))
                    .mapToInt(i -> Integer.parseInt(i))
                    .min()
                    .getAsInt();

    int max = Arrays.stream(numbers.split(" "))
                    .mapToInt(i -> Integer.parseInt(i))
                    .max()
                    .getAsInt();

    return String.format("%d %d", max, min); }
}




import static junit.framework.TestCase.fail;
import static org.junit.Assert.*;

public class KataTest {
  @Test
  public void test1() {
    assertEquals("42 -9", Kata.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
  }
}
