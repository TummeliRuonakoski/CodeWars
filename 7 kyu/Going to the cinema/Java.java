public class Movie {
    
    public static int movie(int card, int ticket, double perc) {
    
    double a = 0.0;
    double b = 0.0;
    int count = 0;

    while (Math.ceil(b + card) >= a){
      a += ticket;
      b = (b + ticket) * perc;
      count += 1;
    }
        

    return count;
      
    }
}



import static org.junit.Assert.*;
import org.junit.Test;


public class MovieTest {
    private static void testing(long actual, long expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        System.out.println("Fixed Tests: movie");    
        testing(Movie.movie(500, 15, 0.9), 43);
        testing(Movie.movie(100, 10, 0.95), 24);
    }
}

