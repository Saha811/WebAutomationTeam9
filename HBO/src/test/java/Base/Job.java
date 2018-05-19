package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import base.CommonAPI;

public class Job extends CommonAPI {
    @Test
    public void lookForJob(){
        clickByXpath("/html/body/main/div[12]/div/div/footer/div[2]/div/ul[1]/li[4]/a");
        switchTabs(0,1);
        driver.findElement(By.xpath("/html/body/main/section[1]/div/div[2]/div/form/table/tbody/tr/td[1]/input")).sendKeys("SOFTWARE ENGINEER",Keys.ENTER);
        driver.manage().window().fullscreen();
        clickByXpath("//button[@class='ui-multiselect ui-widget ui-state-default ui-corner-all ui-state-active']");
        clickByXpath("/html/body/div[7]/div/ul/li[1]/a/span[1]");

    }

}
