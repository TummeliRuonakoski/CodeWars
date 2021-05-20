public class Calculate {
  public static String bmi(double weight, double height) {
    double bmi = weight / Math.pow(height, 2.0);
    if(bmi <= 18.5){
      return "Underweight";
    }
    else if(bmi > 18.5 && bmi <= 25.00){
      return "Normal";
    }
    else if(bmi > 25.00 && bmi <= 30.00){
      return "Overweight";
    }else{
      return "Obese";
    }
  }
}

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void testBMI() {
        assertEquals("Normal", Calculate.bmi(80, 1.80));
    }
}
