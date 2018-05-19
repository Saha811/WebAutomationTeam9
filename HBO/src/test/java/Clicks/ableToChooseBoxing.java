package Clicks;

import base.CommonAPI;
import org.testng.annotations.Test;

public class ableToChooseBoxing extends CommonAPI {
    @Test
    public void AbleToclickonboxing(){
        clickByXpath("//a[@href='/boxing'][1]");
        clickByXpath("/html/body/main/div[1]/div/div/header/div[1]/div[3]/div/div/div/ul/li[2]/div/a");
        clickByXpath("/html/body/main/div[1]/div/div/header/div[1]/div[3]/div/div/div/ul/li[2]/div[2]/ul/li[1]/a");

    }
}
