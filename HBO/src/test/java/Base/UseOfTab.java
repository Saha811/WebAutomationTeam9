package Base;

import TestBase.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class UseOfTab extends CommonAPI {
   @Test
    public void tabUse() throws InterruptedException {
        Actions act = new Actions(driver);
        act.sendKeys(Keys.TAB).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.TAB).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.TAB).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.TAB).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.TAB).perform();


    }
}
