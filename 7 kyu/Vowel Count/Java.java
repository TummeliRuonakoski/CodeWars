public class Vowels {

  public static int getCount(String str) {
    int count = 0;
    for(int i = 0; i < str.length(); i++) {
         if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
            count++;
         }
      }
    
    return count;
  }

}



public class Vowels {

  public static int getCount(String str) {
    return (int) str.chars().filter(i -> "aeiou".indexOf(i) >= 0).count();
  }

}




import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class VowelsTest {
    @Test
    public void testCase1() {
      assertEquals("Nope!", 5, Vowels.getCount("abracadabra"));
    }
    
}
