class Arge {
    
  public static int nbYear(int p0, double percent, int aug, int p) {
    int i = 0;
    while (p0 < p){
      i++;
      p0 = p0 + (int) (p0 * (percent / 100 )) + aug;
      }
    return i;
    }
}



import static org.junit.Assert.*;

import org.junit.Test;

public class ArgeTest {

    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        System.out.println("Fixed Tests: nbYear");    
        testing(Arge.nbYear(1500, 5, 100, 5000),15);
        testing(Arge.nbYear(1500000, 2.5, 10000, 2000000), 10);
        testing(Arge.nbYear(1500000, 0.25, 1000, 2000000), 94);
    }
}
