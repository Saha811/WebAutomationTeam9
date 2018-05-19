package Clicks;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class careers extends CommonAPI {
@Test
    public void clickcareers(){
        driver.findElement(By.xpath("/html/body/main/div[12]/div/div/footer/div[2]/div/ul[1]/li[4]/a")).click();
    }

}
