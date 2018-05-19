package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import base.CommonAPI;

import java.util.List;

public class SeeInfo extends CommonAPI {
    public void seeInfoNews(){
        mouseHoverByXpath("//a[text()='News'][1]");

        List<WebElement> list =driver.findElements(By.xpath("//*[@id='nav']/li[2]/ul/li/a"));
        System.out.println(list.size());
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i).getText());
        }
    }
    public void seeInfoMarket(){
        mouseHoverByXpath("//a[text()='Markets'][1]");

        List<WebElement> list =driver.findElements(By.xpath("//*[@id='nav']/li[3]/ul/li/a"));
        System.out.println(list.size());
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i).getText());
        }
    }
    public void seeInfoInvesting(){
        mouseHoverByXpath("//a[text()='Investing'][1]");

        List<WebElement> list =driver.findElements(By.xpath("//*[@id='nav']/li[4]/ul//li//a"));
        System.out.println(list.size());
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i).getText());
        }
    }
    public void seeInfoTest(){
        mouseHoverByXpath("//a[text()='Tech'][1]");

        List<WebElement> list =driver.findElements(By.xpath("//*[@id='nav']/li[5]/ul//li//a"));
        System.out.println(list.size());
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i).getText());
        }
    }
    public void seeInfoMakeIt(){
        mouseHoverByXpath("//a[text()='Make It'][1]");

        List<WebElement> list =driver.findElements(By.xpath("//*[@id='nav']/li[6]/ul//li//a"));
        System.out.println(list.size());
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i).getText());
        }
    }
    public void seeInfoVideo(){
        mouseHoverByXpath("//a[text()='Video'][1]");

        List<WebElement> list =driver.findElements(By.xpath("//*[@id='nav']/li[7]/ul//li//a"));
        System.out.println(list.size());
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i).getText());
        }
    }
    public void seeInfoShows(){
        mouseHoverByXpath("//a[text()='Shows'][1]");

        List<WebElement> list =driver.findElements(By.xpath("//*[@id='nav']/li[8]/ul//li//a"));
        System.out.println(list.size());
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i).getText());
        }
    }
    public void seeInfoPro(){
        mouseHoverByXpath("//a[text()='Pro'][1]");

        List<WebElement> list =driver.findElements(By.xpath("//*[@id='featured-menu-container']/ul/li[2]/ul/li[1]"));
        System.out.println(list.size());
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i).getText());
        }
    }
    public void seeInfoLiveTv(){
        mouseHoverByXpath("//a[text()='Live Tv'][1]");

        List<WebElement> list =driver.findElements(By.xpath("//*[@id='featured-menu-container']/ul/li[3]/ul/li[1]"));
        System.out.println(list.size());
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i).getText());
        }
    }

}
