package Base;

import base.CommonAPI;

public class InsideOptionNews extends CommonAPI {
    public void economy(){
        mouseHoverNClickbyXC("//a[text()='News'][1]","ECONOMY");
        clickByXpath("//a[contains(text(),'World Economy')][1]");
        clickByXpath("//a[contains(text(),'US Economy')][1]");
        clickByXpath("//a[contains(text(),'The Fed')][1]");
        clickByXpath("//a[contains(text(),'Central Banks')][1]");
        clickByXpath("//a[contains(text(),'Jobs')][1]");
    }
    public void finance(){
        mouseHoverNClickbyXC("//a[text()='News'][1]","FINANCE");
        clickByXpath("//a[contains(text(),'Banks')][1]");
        clickByXpath("//a[contains(text(),'Investing')][1]");
        clickByXpath("//a[contains(text(),'Wall Street')][1]");
        clickByXpath("//a[contains(text(),'Hedge Funds')][1]");
        clickByXpath("//a[contains(text(),'M&A')][1]");
        clickByXpath("//a[contains(text(),'Insurance')][1]");
        clickByXpath("//a[contains(text(),'Venture Capital')][1]");
    }
    public void healthCare(){
        mouseHoverNClickbyXC("//a[text()='News'][1]","HEALTH CARE");
        clickByXpath("//a[contains(text(),'Hospital Insurance')][1]");
        clickByXpath("//a[contains(text(),'Pharma')][1]");
        clickByXpath("//a[contains(text(),'Hospitals')][1]");
        clickByXpath("//a[contains(text(),'Modern Medicine')][1]");
    }
    public void realEstate(){
        mouseHoverNClickbyXC("//a[text()='News'][1]","REAL ESTATE");
        clickByXpath("//a[contains(text(),'Housing')][1]");
        clickByXpath("//a[contains(text(),'Mortgages')][1]");
        clickByXpath("//a[contains(text(),'Construction')][1]");
        clickByXpath("//a[contains(text(),'Commercial Real Estate')][1]");
        clickByXpath("//a[contains(text(),'Reits')][1]");
    }
    public void wealth(){
        mouseHoverNClickbyXC("//a[text()='News'][1]","WEALTH");
        clickByXpath("//a[contains(text(),'Millionaires & Billionaires')][1]");
        clickByXpath("//a[contains(text(),'Luxury')][1]");
        clickByXpath("//a[contains(text(),'Philanthropy')][1]");
        clickByXpath("//a[contains(text(),'Millionaire Servey')][1]");
    }
    public void autos(){
        mouseHoverNClickbyXC("//a[text()='News'][1]","AUTOS");
        clickByXpath("//a[contains(text(),'Retail')][1]");
        clickByXpath("//a[contains(text(),'Consumer')][1]");
        clickByXpath("//a[contains(text(),'Food And Beverage')][1]");
        clickByXpath("//a[contains(text(),'Restaurants')][1]");
        clickByXpath("//a[contains(text(),'Fashion')][1]");
        clickByXpath("//a[contains(text(),'Goods')][1]");
        clickByXpath("//a[contains(text(),'Retail Report')][1]");
    }
    public void earnings(){
        mouseHoverNClickbyXC("//a[text()='News'][1]","EARNINGS");
        clickByXpath("//a[contains(text(),'Calendar')][1]");
        clickByXpath("//a[contains(text(),'highlights')][1]");
        clickByXpath("//a[contains(text(),'Ideas')][1]");
    }
    public void energy(){
        mouseHoverNClickbyXC("//a[text()='News'][1]","ENERGY");
        clickByXpath("//a[contains(text(),'Oil And Gas')][1]");
        clickByXpath("//a[contains(text(),'Utilites')][1]");
        clickByXpath("//a[contains(text(),'Renewable Energy')][1]");
    }
    public void life(){
        mouseHoverNClickbyXC("//a[text()='News'][1]","LIFE");
        clickByXpath("//a[contains(text(),'Travel')][1]");
        clickByXpath("//a[contains(text(),'Entertainment')][1]");
        clickByXpath("//a[contains(text(),'Sports')][1]");
        clickByXpath("//a[contains(text(),'Weather')][1]");
        clickByXpath("//a[contains(text(),'Crime')][1]");
        clickByXpath("//a[contains(text(),'Art & Culture')][1]");
        clickByXpath("//a[contains(text(),'Science')][1]");
    }
    public void politics(){
        mouseHoverNClickbyXC("//a[text()='News'][1]","POLITICS");
        clickByXpath("//a[contains(text(),'Elections')][1]");
        clickByXpath("//a[contains(text(),'White House')][1]");
        clickByXpath("//a[contains(text(),'Congress')][1]");
        clickByXpath("//a[contains(text(),'Law')][1]");
        clickByXpath("//a[contains(text(),'Texes')][1]");
    }
    public void retails(){
        mouseHoverNClickbyXC("//a[text()='News'][1]","RETAIL");
        clickByXpath("//a[contains(text(),'Consumer')][1]");
        clickByXpath("//a[contains(text(),'Autos')][1]");
        clickByXpath("//a[contains(text(),'Food And Beverage')][1]");
        clickByXpath("//a[contains(text(),'Restaurants')][1]");
        clickByXpath("//a[contains(text(),'Fashion')][1]");
        clickByXpath("//a[contains(text(),'Goods')][1]");
        clickByXpath("//a[contains(text(),'Retail Report')][1]");
    }
    public void asia(){
        mouseHoverNClickbyXC("//a[text()='News'][1]","ASIA");
        clickByXpath("//a[contains(text(),'China')][1]");
        clickByXpath("//a[contains(text(),'Japan')][1]");
        clickByXpath("//a[contains(text(),'Korea')][1]");
        clickByXpath("//a[contains(text(),'Australia')][1]");
        clickByXpath("//a[contains(text(),'India')][1]");
    }
    public void europe(){
        clickByXpath("//a[contains(text(),'United Kingdom')][1]");
        clickByXpath("//a[contains(text(),'Russia')][1]");
        clickByXpath("//a[contains(text(),'Germany')][1]");
        clickByXpath("//a[contains(text(),' France')][1]");
        clickByXpath("//a[contains(text(),'European Union')][1]");
    }
}
