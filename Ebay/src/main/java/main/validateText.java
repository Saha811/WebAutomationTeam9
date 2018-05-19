package main;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class validateText extends CommonAPI {

    public void validation (){
        String expected = "We're committed to providing a secure and fair marketplace for our buyers and sellers. To support this commitment, we've put in place rules and policies that govern our expectations of buyers and sellers, the actions we'll take to keep you safe, and how we'll protect you if something goes wrong.";

        clickByLinkedText("Policies");
        List<WebElement> actual = driver.findElements(By.cssSelector(".article_desc p"));
        for (int i=0;i<actual.size();i++){
            System.out.println(actual.get(i).getText());
            //Assert.assertEquals(actual,expected);
        }
    }
}
