package ebay.main;
import main.SignUp;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class SignUpTest extends SignUp {
    //*****positive testing
    //REGISTER to ebay
    @Test(priority = 1)
    public void ValidRegister() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        validRegister();
    }

    //*****negative testing
    //register with no email
    @Test(priority = 5)
    public void NoEmailRegisterTry() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        noEmailRegisterTry();
    }
    //register with no password
    @Test(priority = 6)
    public void NoPassRegisterTry() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        noPassRegisterTry();
    }
    //register with no password, no email
    @Test(priority = 7)
    public void NoPassEmailRegisterTry() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        noPassEmailRegisterTry();
    }
    //register with no first name
    @Test
    public void NoFirstNameRegisterTry() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        noFirstNameRegisterTry();
    }
    //register with no last name
    @Test
    public void NoLastNameRegisterTry() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        noLastNameRegisterTry();
    }
    //register with no first name,last name
    @Test
    public void  NoFirstLastNameRegisterTry() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        noFirstLastNameRegisterTry();
    }
    //register with no email,first name
    @Test
    public void NoEmailFirstNameRegisterTry() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        noEmailFirstNameRegisterTry();
    }
    //register with no password, first name
    @Test
    public void NoPassFirstNameRegisterTry() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        noPassFirstNameRegisterTry();
    }
    //register with no password, no email,first name
    @Test
    public void  NoPassEmailFirstNameRegisterTry() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        noPassEmailFirstNameRegisterTry();
    }
    //register with no email,last name
    @Test
    public void NoEmailLastNameRegisterTry() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        noEmailLastNameRegisterTry();
    }
    //register with no password,last name
    @Test
    public void NoPassLastNameRegisterTry() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        noPassLastNameRegisterTry();
    }
    //register with no password, no email,no last name
    @Test
    public void  NoPassEmailLastNameRegisterTry() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        noPassEmailLastNameRegisterTry();
    }
    //register with no input
    @Test
    public void  NoInput() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        noInput();
    }

}
