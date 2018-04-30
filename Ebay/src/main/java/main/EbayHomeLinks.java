package main;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class EbayHomeLinks extends CommonAPI {
    //Buy
    public void Buy(){
        clickByLinkedText("Registration");
        navigateBack();
        clickByLinkedText("eBay Money Back Guarantee");
        navigateBack();
        clickByLinkedText("Bidding & buying help");
        navigateBack();
        clickByLinkedText("Stores");
    }
    //Sell
    public void Sell(){
        clickByLinkedText("Start selling");
        navigateBack();
        clickByLinkedText("Learn to sell");
        navigateBack();
        clickByLinkedText("Business sellers");
        navigateBack();
        clickByLinkedText("Affiliates");
        navigateBack();
    }
    //Tools & apps
    public void TnA(){
        clickByLinkedText("Mobile apps");
        navigateBack();
        clickByLinkedText("Developers");
        navigateBack();
        clickByLinkedText("Security center");
        navigateBack();
        clickByLinkedText("eBay official time");
        navigateBack();
        clickByLinkedText("Site map");
        navigateBack();
    }
    //eBay companies
    public void companies(){
        clickByLinkedText("eBay Classifieds");
        navigateBack();
        clickByLinkedText("StubHub");
        navigateBack();
        clickByLinkedText("See all companies");
        navigateBack();
    }
    //about ebay

}