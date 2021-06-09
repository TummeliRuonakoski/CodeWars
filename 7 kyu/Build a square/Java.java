public class Kata {
    public static final String generateShape(int n) {
      return ("+".repeat(n) + "\n").repeat(n).trim();
    }
}


public class KataTest {
    @Test
    public void exampleTests() {
        assertEquals("+++\n+++\n+++", Kata.generateShape(3));
        assertEquals("+++++\n+++++\n+++++\n+++++\n+++++", Kata.generateShape(5));
        assertEquals("++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++", Kata.generateShape(8));
    }
}
