package main;

import base.CommonAPI;

public class CityHomeLinks extends CommonAPI {
    //Why Citi
    public void WhyCiti(){
        clickByLinkedText("Our Story");
        navigateBack();
        clickByLinkedText("Careers");
        navigateBack();
        clickByLinkedText("Benefits and Services");
        navigateBack();
        clickByLinkedText("Rewards");
        navigateBack();
        clickByLinkedText("Special Offers");
        navigateBack();
    }
    //Relationship Banking
    public void relBanking(){
        clickByLinkedText("Citi Priority");
        navigateBack();
        clickByLinkedText("Citigold®");
        navigateBack();
        clickByLinkedText("Citi Global Banking");
        navigateBack();
    }
    //Business Banking
    public void businessBanking(){
        clickByLinkedText("Small Business Accounts");
        navigateBack();
        clickByLinkedText("Commercial Accounts");
        navigateBack();
    }

    //Rates
    public void rates(){
        clickByLinkedText("Personal Banking");
        navigateBack();
        clickByLinkedText("Credit Cards");
        navigateBack();
        clickByLinkedText("Mortgage");
        navigateBack();
        clickByLinkedText("Home Equity");
        navigateBack();
    }
    //Citi Easy
    public void CitiEasy(){
        clickByLinkedText("Citi Easy DealsSMs");

    }
    //Citi® Private Pass®
    public void CitiPrivate(){
        clickByLinkedText("Citi® Private Pass®");

    }
    //Citi® Private Pass®
    public void CitiPrivateBank(){
        clickByLinkedText("Citi Private Bank");
    }

}
