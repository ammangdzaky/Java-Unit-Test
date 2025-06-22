package dzaky;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.Random.class)
public class OrderedTest {

    private int count = 0;

    @BeforeAll
    void beforeAll() {

    }

    @Test
    public void method1(){
        count++;
        System.out.println(count);
    }

    @Test
    public void method2(){
        count++;
        System.out.println(count);

    }

    @Test
    public void method3(){
        count++;
        System.out.println(count);

    }


    @AfterAll
    void afterAll() {

    }
}
