public class DnaStrand {
  public static String makeComplement(String dna) {
    
    StringBuilder sb = new StringBuilder();
    for(int i = 0 ; i < dna.length() ; i++){
        if(dna.charAt(i) == 'T'){
            sb.append('A');
        }
        if(dna.charAt(i) == 'A'){
            sb.append('T');
        }
        if(dna.charAt(i) == 'C'){
            sb.append('G');
        }
        if(dna.charAt(i) == 'G'){
            sb.append('C');
        }   
    }
    return sb.toString();
  }
}




public class DnaStrand {
  public static String makeComplement(String dna) {
    String s = "";
     
     for(char c : dna.toCharArray()){
       switch(c){
         case 'A':
           s += 'T';
           break;
         case 'T':
           s += 'A';
           break;
         case 'G':
           s += 'C';
           break;
         case 'C':
           s += 'G';
           break;
       }
     }
     return s;
  }
}



public class DnaStrand {
  public static String makeComplement(String dna) {
     return dna.replaceAll("A", "t").replaceAll("T","a").replaceAll("G","c").replaceAll("C","g").toUpperCase();
  }
}





import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class DnaStrandTest {
    @Test
    public void test01() {
       assertEquals("TTTT", DnaStrand.makeComplement("AAAA"));
    }
    @Test
    public void test02() {
       assertEquals("TAACG", DnaStrand.makeComplement("ATTGC"));
    }
    @Test
    public void test03() {
       assertEquals("CATA", DnaStrand.makeComplement("GTAT"));
    }    
}
