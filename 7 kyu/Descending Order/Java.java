import java.util.*;
public class DescendingOrder {

  public static int sortDesc(final int num) {
    String [] i = (Integer.toString(num)).split("");
    Arrays.sort(i);
    String r = "";
 
    for(String s : i){
    r = s + r;
    }
   return Integer.parseInt(r);
  
  }
}

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class DescendingOrderTest {

    @Test
    public void test_01() {
        assertEquals(0, DescendingOrder.sortDesc(0));
    }    

    @Test
    public void test_02() {
        assertEquals(51, DescendingOrder.sortDesc(15));
    }
    

    @Test
    public void test_03() {
        assertEquals(987654321, DescendingOrder.sortDesc(123456789));
    }
}
