package Base;

import base.CommonAPI;

public class mainClass extends CommonAPI {
    public void CheckCreditCard(){
        clickByLinkedText("Credit Cards");
        clickByXpath("//*[@id='cA-DD-taskbarMenu']/div[1]/div[1]/div/a");
    }

    public void compareCreditCards() throws InterruptedException {
        CheckCreditCard();
        clickByCss(".citi-prestige-card .cA-DD-result-chkbox");
        clickByXpath("//*[@id='compareWidget']/div[2]/div[1]/a[1]");

    }

}
