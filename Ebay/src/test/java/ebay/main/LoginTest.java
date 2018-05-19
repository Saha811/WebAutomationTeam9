package ebay.main;

import main.Login;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class LoginTest extends Login {
    //******positive testing
    //login to ebay
    @Test(priority = 1)
    public void Login(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        login();
    }

    //*****negative testing
    //login with fake email
    @Test(priority = 2)
    public void FakeEmailLoginTry(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        fakeEmailLoginTry();
    }
    //login with fake password
    @Test(priority = 3)
    public void FakePassLoginTry(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       fakePassLoginTry();
    }
    //login with fake email,fake pass
    @Test(priority = 4)
    public void FakePassEmailLoginTry(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        fakePassEmailLoginTry();
    }
    //log in with no email
    @Test(priority = 5)
    public void NoEmailLoginTry(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        noEmailLoginTry();
    }
    //log in with no password
    @Test(priority = 6)
    public void NoPassLoginTry(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        noPassLoginTry();
    }
    //log in with no password, no email
    @Test(priority = 7)
    public void NoPassEmailLoginTry(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        noPassEmailLoginTry();
    }
}
