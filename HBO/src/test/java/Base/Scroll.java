package Base;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Scroll extends CommonAPI {
    @Test
    public void scroolupanddown() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("scroll(0,2000)");
       /* try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ((JavascriptExecutor) driver).executeScript("scroll(50,0)");
*/
    }
}