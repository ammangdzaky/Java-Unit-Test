package dzaky;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import dzaky.generator.SimpleDisplayName;
import org.junit.jupiter.api.*;
import org.opentest4j.TestAbortedException;

//@DisplayNameGeneration(value = SimpleDisplayName.class)
@DisplayName("Test untuk class Calculator Test")
public class CalculatorTest {

    private Calculator kalkulator = new Calculator();


    // before and after
    @BeforeAll
    public static void beforeAll(){
        System.out.println("BEFORE ALL");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("AFTER ALL");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("BEFORE EACH");
    }
    @AfterEach
    public void afterEach(){
        System.out.println("AFTER EACH");
    }


    @Test
    @DisplayName("Method : add sukses")
    public void testAddSucces(){
        var result = kalkulator.add(50,50);
        assertEquals(100, result);
        System.out.println("result " + result);
    }

//    @Test
//    public void addAddFailed(){
//        // misal saya mau test harusnya hasil yang benar itu 100
//        var result = kalkulator.add(100,100);
//        //manual
////        if(result != 100){
////            throw new RuntimeException("Hasil salah");
////        }
//
//        assertEquals(100, kalkulator.add(100,20));
//    }

    @Test
    @DisplayName("Method : pembagian sukses")
    public void testDivideSuccess(){
        var result = kalkulator.division(10,5);
        assertEquals(2, result);
        System.out.println("result " + result);
    }


    @Test
    @DisplayName("Method : pembagian ilegal")
    public void testDivideFailed(){
        assertThrows(IllegalArgumentException.class, () -> {
            var result = kalkulator.division(10,0);
            System.out.println("result " + result);
        });
    }


    @Test
    @DisplayName("Method : coming soon")
    @Disabled
    public void comingSoon(){
    }


    // 09 - membatalkan test
    @Test
    public void testAborted(){
        var profile = System.getenv("PROFILE");
        if(!"DEV".equals(profile)){
        throw new TestAbortedException("test dibatalkan karena bukan DEV");
        }

        // unit test untuk dev
    }

    // 10 - menggunaklan assumptions
    @Test
    public void testAssumption(){
            assumeTrue("DEV".equals(System.getenv("PROFILE")));

        // unit test untuk dev
    }
}
