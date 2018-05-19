package Base;

import base.CommonAPI;

public class mainClass extends CommonAPI {
    public void plans(){
        clickNClearbyXpath("/html//input[@id='zip']");
        typeByCssNEnter("#js-hero-zip #zip","11377");
       //mvn <go clickByCss("#kt-ads--typ-prom .js-ads-item:nth-of-type(1) [rel] span:nth-of-type(2)");

    }

}
