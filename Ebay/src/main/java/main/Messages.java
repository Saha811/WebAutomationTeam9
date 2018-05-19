package main;

import base.CommonAPI;
import org.openqa.selenium.By;

public class Messages extends CommonAPI {
    //go to my messages//
    public void myMessages(){
        Login login = new Login();
        login.login();
        mouseHoverNClickbyXC("//*[@id='gh-eb-My']/div/a[1]","Messages");
    }
    //add a folder inside messages
    public void folderInMessages(){
        myMessages();
        clickByXpath("//*[@id='adf']");
        driver.findElement(By.xpath("//*[@id='-1_inp_inp']")).clear();
        typeByXpath("//*[@id='-1_inp_inp']","folder1");
    }
}
