package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import base.CommonAPI;


public class newWindows extends CommonAPI {


    @Test
    public void newwindow(){
        clickByXpath("/html//main/div[11]/div/div//ul[@class='modules/FooterLinks--links modules/FooterLinks--topLinks']//a[@href='https://hbocareers.com/']");
        switchTabs(0,1);
        driver.findElement(By.xpath("/html/body/main/section[1]/div/div[2]/div/form/table/tbody/tr/td[1]/input")).sendKeys("SOFTWARE ENGINEER",Keys.ENTER);
    }

}

