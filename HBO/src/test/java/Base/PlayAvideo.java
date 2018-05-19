package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import base.CommonAPI;

public class PlayAvideo extends CommonAPI {

    @Test
    public void playVideo() throws InterruptedException {
        clickByXpath("/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/div");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='text' and @class='components/Search--searchInput']")).sendKeys("game of thrones",Keys.ENTER);
        Thread.sleep(3000);
        clickByXpath("/html/body/main/div[2]/div/div/div/div[1]/div[2]/div/div[2]/div[2]/div[4]/a/span/span[1]");
        Thread.sleep(3000);
        clickByXpath("//div[@class='__player-placeholder-play-button'][1]");
        Thread.sleep(3000);
        clickByXpath("//div[@class='components/HeroVideo--wrapper']//button[@class='__player-overlay-button-close']/i");
        Thread.sleep(3000);
        clickByXpath("/html/body/main/div[7]/div/div/div[1]/div/div/div[1]/div/div/div/div[2]/div[2]/div/div[2]/div[2]");

    }
}

