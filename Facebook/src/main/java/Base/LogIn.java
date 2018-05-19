package Base;

import base.CommonAPI;

public class LogIn extends CommonAPI {
    public void login() {
        typeByXpath("//input[@name='email']","testuserabcd13@gmail.com");
        typeByXpath("//input[@name='pass']","testabcd1234");
        clickByXpath("//input[@value='Log In']");
    }
    public void loginEnter() {
        typeByXpath("//input[@name='email']","testuserabcd13@gmail.com");
        typeByXpathNEnter("//input[@name='pass']","testabcd1234");
    }
    public void loginPartEmail() {
        typeByXpath("//input[@name='email']", "testuserabcd13");
        typeByXpath("//input[@name='pass']","testabcd1234");
        clickByXpath("//input[@value='Log In']");
    }
    public void loginPartEmailEnter() {
        typeByXpath("//input[@name='email']","testuserabcd13@gmail.com");
        typeByXpathNEnter("//input[@name='pass']","testabcd1234");
    }
    public void loginUserId() {
        typeByXpath("//input[@name='email']","redn.black.315");
        typeByXpath("//input[@name='pass']","testabcd1234");
        clickByXpath("//input[@value='Log In']");
    }
    public void loginUserIdEnter() {
        typeByXpath("//input[@name='email']","redn.black.315");
        typeByXpathNEnter("//input[@name='pass']","testabcd1234");
    }
    //Negative Testing
    public void loginWithOutEmail() {
        typeByXpath("//input[@name='pass']", "testabcd1234");
        clickByXpath("//input[@value='Log In']");
    }
    public void loginWithOutpass() {
        typeByXpath("//input[@name='email']", "testuserabcd13@gmail.com");
        clickByXpath("//input[@value='Log In']");
    }
    public void loginWithWrongPass() {
        typeByXpath("//input[@name='email']", "testuserabcd13@gmail.com");
        typeByXpath("//input[@name='pass']","wrongpass");
        clickByXpath("//input[@value='Log In']");
    }
    public void loginWithWrongEmail() {
        typeByXpath("//input[@name='email']", "wrong@gmail");
        typeByXpath("//input[@name='pass']","testabcd1234");
        clickByXpath("//input[@value='Log In']");
    }
}
