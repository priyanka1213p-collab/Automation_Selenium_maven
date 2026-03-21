package TestNg_Programs;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testparameter {

    @Test
    @Parameters({"name","password"})
    public void login(String name, String password) {

        System.out.println("Username: " + name);
        System.out.println("Password: " + password);
    }
}