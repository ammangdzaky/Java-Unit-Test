package dzaky;

import org.junit.jupiter.api.*;

@DisplayName("class informnation test")
public class InformationTest {

    @Test
    @DisplayName("Method information")
    @Tags({
            @Tag("coll"),
            @Tag("one")
    })
    public void test(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName());
        System.out.println(testInfo.getTags());
        System.out.println(testInfo.getTestClass());
        System.out.println(testInfo.getTestMethod());
    }
}
