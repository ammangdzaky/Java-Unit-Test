package dzaky;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator kalkulator = new Calculator();

    @Test
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
    public void testDivideSuccess(){
        var result = kalkulator.division(10,5);
        assertEquals(2, result);
    }

    @Test
    public void testDivideFailed(){
        assertThrows(IllegalArgumentException.class, () -> {
            kalkulator.division(10,0);
        });
    }
}
