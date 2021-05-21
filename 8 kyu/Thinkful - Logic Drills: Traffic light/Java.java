public class TrafficLights {

  public static String updateLight(String current) {
  
     return (current.equals("red") ? "green" : current.equals("yellow") ? "red" : "yellow");
  }
  
}


public class TrafficLights {

  public static String updateLight(String current) {
  
    String s = "";
   if (current == "red"){
     s = "green";
   }
    if (current == "green"){
     s = "yellow";
   }
    if (current == "yellow"){
      s =  "red";
    }
    return s;
    
  }
  
}

public class SolutionTest {
    @Test
    public void update_light() {
        assertEquals("green", TrafficLights.updateLight("red"));
        assertEquals("yellow", TrafficLights.updateLight("green"));
        assertEquals("red", TrafficLights.updateLight("yellow"));
    }
}
