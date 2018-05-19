package Base.TestBase;

import base.CommonAPI;

public class walmartMainClass extends CommonAPI {
    //search
    public void search(){
        typeByXpathNEnter("//input[@class='GlobalHeaderSearchbar-input header-GlobalSearch-input']","fishing rod");
    }
    //signIn
    public void signIn(){
        //Actions action=new Actions(driver);
        //action.moveToElement(driver.findElement(By.xpath("//html//button[1]/div[1]/span[1]"))).build().perform();
        clickByXpath("//span[@class='elc-icon elc-icon-user-nav BubbleButton-icon']");
        clickByXpath(" //div[text()='Sign In']");




    }


}
