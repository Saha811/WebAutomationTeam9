package Base.TestBase;

import Base.SignUp;
import org.testng.annotations.Test;

public class SignUpTest extends SignUp {
    @Test
    public void registerTest() throws InterruptedException {
        try {
            register();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
