package dzaky;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import java.util.Properties;

public class ConditionTest {

    // OS
    @Test
    @EnabledOnOs({OS.WINDOWS})
    public void testOsEnabled(){

    }

    @Test
    @DisabledOnOs({OS.WINDOWS})
    public void testOsDisabled(){

    }

    // JAVA VERSION
    @Test
    @EnabledOnJre({JRE.JAVA_21})
    public void testJavaVerEnable(){

    }

    @Test
    @DisabledOnJre({JRE.JAVA_21})
    public void testJavaVerDisabled(){

    }

    //SYSTEM PROPERTY
    @Test
    @EnabledIfSystemProperty(named = "java.vm.vendor", matches = "Oracle Corporation")
    public void testSystemPropertyEnabled(){

    }

    @Test
    @DisabledIfSystemProperty(named = "java.vm.vendor", matches = "Oracle Corporation")
    public void testSystemPropertyDisabled(){

    }
    @Test
    public void getProperty(){
        Properties properties = System.getProperties();
        properties.forEach((key, value) -> System.out.println(key + " = " + value));
    }


    // ENVIRONMENT VARIABLE
    @Test
    @EnabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    public void testEnvironmentVariableEnabled(){

    }

    @Test
    @DisabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    public void testEnvironmentVariableDisabled(){

    }
}
