package Base;

import base.CommonAPI;

public class SignUp extends CommonAPI {
    public void register() throws InterruptedException {
        typeByXpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='firstname']","test");
        typeByXpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='lastname']","user");
        typeByXpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='reg_email__']","testuserabcd13@gmail.com");
        Thread.sleep(2000);
        typeByXpath("//*[@id='u_0_l']","testuserabcd13@gmail.com");
        typeByXpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='reg_passwd__']","testabcd1234");
        clickByXpath("//select[@name='birthday_month']");
        clickByXpath("//*[@id='month']/option[10]");
        clickByXpath("//select[@name='birthday_day']");
        clickByXpath("//*[@id='day']/option[17]");
        clickByXpath("//select[@name='birthday_year']");
        clickByXpath("//*[@id='year']/option[40]");
        clickByXpath("//*[@id='u_0_b']");



        //driver.findElement(By.name("websubmit")).click();
    }
}
