package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import base.CommonAPI;

public class CountryDropDown extends CommonAPI {
    @Test
    public void dropDownCountry(){
        clickByXpath("/html//main/div[11]/div/div//ul[@class='modules/FooterLinks--links modules/FooterLinks--topLinks']//a[@href='https://hbocareers.com/']");
        switchTabs(0,1);
        driver.findElement(By.xpath("/html/body/main/section[1]/div/div[2]/div/form/table/tbody/tr/td[1]/input")).sendKeys("SOFTWARE ENGINEER",Keys.ENTER);
        driver.manage().window().fullscreen();
        clickByXpath("//*[@id=\"location-selects\"]/button[1]");
        driver.manage().window().fullscreen();
        clickByXpath("/html/body/div[12]/ul/li[2]/label/span");
        clickByXpath("//*[@id=\"location-selects\"]/button[2]");


        //clickByXpath("/html/body/div[7]/div/ul/li[3]/a/span");
        clickByXpath("/html/body/div[11]/div/ul/li[2]/a");
        clickByXpath("/html/body/div[11]/ul/li[3]/label/span");
        clickByXpath("//*[@id=\"inputs-wrap\"]/div[3]/div[3]/button");
    }
}
