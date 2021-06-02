import java.util.*;
public class School{

 	public static int getAverage(int[] marks){
	return (int)Arrays.stream(marks).average().getAsDouble();
	}

}


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class SolutionTest {
  	@Test
	public void simpleTest() {
		assertEquals(2,School.getAverage(new int[] {2,2,2,2}));
		assertEquals(3,School.getAverage(new int[] {1,2,3,4,5}));
		assertEquals(1,School.getAverage(new int[] {1,1,1,1,1,1,1,2}));
	}

}
