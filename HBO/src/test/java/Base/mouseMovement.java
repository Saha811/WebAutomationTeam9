package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import base.CommonAPI;

import java.util.concurrent.TimeUnit;

public class mouseMovement extends CommonAPI {
@Test
    public void movemouse() throws InterruptedException {
        clickByXpath("/html/body/main/div[1]/div/div/header/div[1]/div/div[3]/ul/li[2]/div/a");
        clickByXpath("/html/body/main/div[2]/div/div/div[1]/div/div[1]/ul/li[10]/span[1]");
   driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    Actions action = new Actions(driver);
    action.moveToElement(driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div/ul/span/li[1]/ul/li[15]"))).build().perform();
    Thread.sleep(2000);
    action.moveToElement(driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div/ul/span/li[2]/ul/li[14]/div[2]"))).build().perform();
    Thread.sleep(2000);
    action.moveToElement(driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div/ul/span/li[2]/ul/li[13]"))).build().perform();
    Thread.sleep(2000);
    action.moveToElement(driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div/ul/span/li[1]/ul/li[12]"))).build().perform();
    Thread.sleep(2000);
    action.moveToElement(driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div/ul/span/li[1]/ul/li[11]"))).build().perform();

}

}
