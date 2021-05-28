public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
    String[] s = name.split(" ");
    return (s[0].charAt(0) + "." + s[1].charAt(0)).toUpperCase();
  }
}


public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
    for (int i = 1; i < name.length() - 1; i++)
            if (name.charAt(i) == ' '){
                 name = Character.toUpperCase(name.charAt(0)) + "." + Character.toUpperCase(name.charAt(i + 1));
            }
               
    return name;
  }
}

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {

    @Test
    public void testFixed() {
        assertEquals("S.H", AbbreviateTwoWords.abbrevName("Sam Harris"));
        assertEquals("P.F", AbbreviateTwoWords.abbrevName("Patrick Feenan"));
        assertEquals("E.C", AbbreviateTwoWords.abbrevName("Evan Cole"));
        assertEquals("P.F", AbbreviateTwoWords.abbrevName("P Favuzzi"));
        assertEquals("D.M", AbbreviateTwoWords.abbrevName("David Mendieta"));
    }
}
