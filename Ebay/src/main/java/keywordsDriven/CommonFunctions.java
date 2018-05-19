package keywordsDriven;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonFunctions extends CommonAPI {
    public static String click_element(WebDriver driver, String locatorType,String locatorValue){
        switch (locatorType){
            case "id" :
                driver.findElement(By.id(locatorValue)).click();
                break;
            case "xpath" :
                driver.findElement(By.xpath(locatorValue)).click();
                break;
            case "cssSelector" :
                driver.findElement(By.cssSelector(locatorValue)).click();
                break;
        }
        return null;
    }
}
