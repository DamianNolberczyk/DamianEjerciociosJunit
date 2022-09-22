package vowelconsonant;
 
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
 
public class VowelTest {
    
    public VowelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    // Si el carácter es un carácter vocal, devuelve vocal
    @Test
    public void VowelTest1(){
    VowelConsonant v = new VowelConsonant();
    String expResult = "vowel";
    String result = v.check("o");
    assertEquals(expResult,result);
    }
         // Devuelve consonante si la letra es consonante
        @Test
    public void VowelTest2(){
    VowelConsonant v = new VowelConsonant();
    String expResult = "consonant";
    String result = v.check("f");
    assertEquals(expResult,result);
    }
}