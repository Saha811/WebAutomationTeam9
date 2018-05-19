package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import base.CommonAPI;

import java.util.ArrayList;
import java.util.List;

public class mainClass extends CommonAPI {

   public void searchItems() {
       clickByXpath("/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/div");
       List<String> itemsList = new ArrayList<String>();
       itemsList.add("West world");
       itemsList.add("Kong");
       itemsList.add("Fantastic Beast and Where TO Find Them");
       for (String loopstring : itemsList) {
           driver.findElement(By.xpath("/html//main[@class='wrapperMain']/div[1]/div/div//div[@class='components/Search--searchInputContainer']/input[@type='text']")).sendKeys(loopstring, Keys.ENTER);
           clickByXpath("/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/div");

       }
   }
}
