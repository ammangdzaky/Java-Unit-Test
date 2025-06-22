package dzaky;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class MockitoTest {

    @Test
    public void testMock(){

        List<String> list = Mockito.mock(List.class);

        Mockito.when(list.get(0)).thenReturn("Dzaky");
        Mockito.when(list.get(100)).thenReturn("Asep");

        System.out.println(list.get(0));
        System.out.println(list.get(10));
        System.out.println(list.get(100));

//        Assertions.assertEquals("Dzaky", list.get(0));
//        Assertions.assertEquals("Asep", list.get(100));
//        Assertions.assertEquals(null, list.get(10));

        Mockito.verify(list, Mockito.times(1)).get(0);
        Mockito.verify(list, Mockito.times(1)).get(100);
        Mockito.verify(list, Mockito.times(1)).get(10);
    }
}
