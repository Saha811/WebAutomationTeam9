package citybank;

import base.CommonAPI;
import org.testng.annotations.Test;


public class login extends CommonAPI{

    @Test
    public void inputuserid() {
        typeByCssNEnter("#UserNameGoesHereBro","YoungShuvon@citibank.com");
    }

    //@Test
    public void inputpassword(){
        //searchByCSS("#password" ,"12345");
    }
    //@Test
    public void clickSignin(){
        //clickbuttonbyCSS("#signInBtn");
    }
}
