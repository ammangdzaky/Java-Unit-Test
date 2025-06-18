package dzaky;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator kalkulator = new Calculator();

    @Test
    public void testAddSucces(){
        var result = kalkulator.add(100,100,20);
    }

    @Test
    public void testDivideSucces(){
        kalkulator.division(10,5);
    }

    @Test
    public void testDivideFailed(){
        kalkulator.division(10,0);
    }
}
