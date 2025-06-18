package dzaky;

import static org.junit.jupiter.api.Assertions.*;

import dzaky.generator.SimpleDisplayName;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;

//@DisplayNameGeneration(value = SimpleDisplayName.class)
@DisplayName("Test untuk class Calculator Test")
public class CalculatorTest {

    private Calculator kalkulator = new Calculator();

    @Test
    @DisplayName("Method : add sukses")
    public void testAddSucces(){
        var result = kalkulator.add(50,50);
        assertEquals(100, result);
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
    }

    @Test
    @DisplayName("Method : pembagian ilegal")
    public void testDivideFailed(){
        assertThrows(IllegalArgumentException.class, () -> {
            kalkulator.division(10,0);
        });
    }
}
