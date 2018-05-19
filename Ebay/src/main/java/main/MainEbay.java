package main;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pageFactory.Search;

import java.util.List;

public class MainEbay extends CommonAPI {
    //Mouse Hover By xpath
    public void mouseHoverByXpath(){
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","Vehicles");
    }
    //view multiple items
    public void viewMultipleByCSS(){
        List<WebElement> menu = getElementsByCSSforList("[aria-label='Select a category for search']");
        for (WebElement search : menu) {
            System.out.println(search.getText());
        }
    }
    //search
    public void xtendedSearches() throws InterruptedException {
        Search log = PageFactory.initElements(driver,Search.class);
        log.lookForALaptop();
        sleepFor(2);
        driver.findElement(By.xpath("//*[@id='productSearchToggle']/div/span[2]")).click();
    }
    //go to daily deals--spotlight deal
    public void searchProblems() throws InterruptedException {
        //xtendedSearches();
        clickByXpath("//*[@id='gh-p-1']/a");
        clickByXpath("//*[@id='s4-c0-c1-title']/a/span");
    }
    //search for a laptop and use different options
    public void searchWithDifferentRequirements(){
        typeByXpathNEnter("/html//input[@id='gh-ac']","Laptop");
        try{clickByXpath("//*[@id='productSearchToggle']/div/span[2]");}catch (Exception ex){
        //click acer
        clickByXpath("//*[@id='w3-w0-w1-multiselect[0]']/a/span[1]");}
        clickByCss("[id='w3-w0-w1-multiselect[0]'] .x-refine__multi-select-cbx");
        clickByXpath("//*[@id='w3-w0-singleselect[9]-w0-_valueOption']");
        clickByXpath("//*[@id='w3-w0-singleselect[9]-w0-_select']/option[6]");
    }
    //select categories and then select travel
    public void editCategories(){
        clickByCss("[aria-label='Select a category for search']");
        WebElement menu = driver.findElement(By.xpath("//*[@id='gh-cat']/option[34]"));
        System.out.println(menu.getText());
    }
    //handeling new tab
    public void newTab(){
        String newTabTest = Keys.chord(Keys.COMMAND,Keys.RETURN);
        driver.findElement(By.linkText("Contact us")).sendKeys(newTabTest);
        switchTabs(0,1);
    }
    //using TAB
    public void tabUse() throws InterruptedException {
        Actions act = new Actions(driver);
        act.sendKeys(Keys.TAB).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.TAB).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.TAB).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.TAB).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.TAB).perform();
    }
    //Check Ebay Motors Mousehover and click by linkText
    public void motors(){
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","Parts & Accessories");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","Cars & Truck Parts");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","Motorcycle Parts");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","Automotive Tools & Supplies");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","Sales & Events");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","Motors Deals");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","My Garage");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","Vehicles");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","Cars & Trucks");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","Motorcycles");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","Classics & Exotics");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","Powersports");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","RVs & Other Vehicles");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","Motors Blog");
    }
    //Check Ebay Fashion Mousehover and click by linkText
    public void fashion(){
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[4]/a","Women's Clothing");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[4]/a","Women's Shoes");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[4]/a","Men's Clothing");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[4]/a","Men's Shoes");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[4]/a","Handbags & Accessories");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[4]/a","Kids & Baby");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[4]/a","Jewelry");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[4]/a","Watches");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[4]/a","Beauty");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[4]/a","Health");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[4]/a","Fashion Deals");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[4]/a","Sales & Events");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[4]/a","Pre-owned Fashion");
    }
    //Check Ebay Electronics Mousehover and click by linkText
    public void electronics(){
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[5]/a","Computers, Tablets & More");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[5]/a","Cell Phones, Smart Watches & Accessories");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[5]/a","TV, Video & Home Audio");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[5]/a","Video Games & Consoles");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[5]/a","Cameras & Photo");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[5]/a","Portable Audio & Headphones");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[5]/a","Smart Home");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[5]/a","iPhone");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[5]/a","Laptops");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[5]/a","PC Gaming");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[5]/a","Camera Drones");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[5]/a","Car Audio, Video & GPS");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[5]/a","Computer Graphics Cards");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[5]/a","Sell Your Phone");
    }
    //Check Ebay Collectiables & art Mousehover and click by linkText
    public void collectiablesNart(){
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[6]/a","Coins & Paper Money");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[6]/a","Collectibles");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[6]/a","Comics");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[6]/a","Entertainment Memorabilia");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[6]/a","Sports Cards, Memorabilia & Apparel");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[6]/a","Stamps");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[6]/a","Bullion Center");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[6]/a","Art");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[6]/a","Antiques");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[6]/a","Pottery & Glass");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[6]/a","eBay Collective");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[6]/a","Live Auctions");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[6]/a","Sotheby's on eBay");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[6]/a","Consignment Center");

    }
    //Check Ebay Home & Garden Mousehover and click by linkText
    public void homeNgarden(){
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[7]/a","Yard & Garden");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[7]/a","Outdoor Power Equipment");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[7]/a","Lawn Mowers");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[7]/a","Patio Furniture");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[7]/a","Tools");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[7]/a","Home Improvement");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[7]/a","Pets");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[7]/a","Kitchen & Dining");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[7]/a","Housekeeping & Organization");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[7]/a","Furniture");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[7]/a","Home Décor");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[7]/a","Baby");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[7]/a","Bedding");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[7]/a","Wine");


    }
    //Check Ebay Sporting Goods Mousehover and click by linkText
    public void sportingGoods(){
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[8]/a","Golf");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[8]/a","Cycling");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[8]/a","Fishing");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[8]/a","Hunting");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[8]/a","Team Sports");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[8]/a","Fitness & Running");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[8]/a","Sales & Events");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[8]/a","Camping Equipment");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[8]/a","Baseball & Softball");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[8]/a","Golf Clothing, Shoes & Accessories");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[8]/a","Archery");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[8]/a","Fitness Equipment");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[8]/a","Water Sports");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[8]/a","Pre-owned Sports Gear");

    }
    //Check Ebay Toys Mousehover and click by linkText
    public void toys(){
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[9]/a","Action Figures");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[9]/a","Building Toys & LEGOs");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[9]/a","Board & Traditional Games");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[9]/a","Collectible Card Games");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[9]/a","Dart Guns, Ride-Ons & Outdoor Structures");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[9]/a","Dolls & Bears");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[9]/a","Preschool & Pretend Play");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[9]/a","Diecast & Toy Vehicles");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[9]/a","Drones & RC Vehicles");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[9]/a","Model Railroads & Trains");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[9]/a","STEM & Educational Toys");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[9]/a","Toy Models & Kits");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[9]/a","Toy Deals");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[9]/a","Toy Sales & Events");

    }
    //Check Ebay Business & Industrial Mousehover and click by linkText
    public void businessNindustrial(){
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[10]/a","Healthcare Lab & Life Science");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[10]/a","Laboratory Equipment and Supplies");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[10]/a","Heavy Equipment");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[10]/a","Construction Jobsite");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[10]/a","Manufacturing and Metalworking");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[10]/a","Electrical & Test Equipment");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[10]/a","Restaurant & Catering");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[10]/a","Office");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[10]/a","Retail & Services");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[10]/a","Packing and Shipping");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[10]/a","Light Equipment & Tools");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[10]/a","Heavy Equipment Attachments");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[10]/a","Heavy Equipment Parts & Accessories");
    }
    //Check Ebay Music Mousehover and click by linkText
    public void music(){
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[11]/a","Guitars");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[11]/a","Pro-Audio");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[11]/a","Vinyl, CDs, & More");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[11]/a","Orchestra & Band");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[11]/a","Drums");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[11]/a","DJ");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[11]/a","Concert Tickets");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[11]/a","Electric Guitars");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[11]/a","Acoustic Guitars");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[11]/a","Bass");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[11]/a","Amps");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[11]/a","Effects & Pedals");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[11]/a","Guitar Parts");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[11]/a","Pre-owned Musical Instruments");
    }
    //Check Ebay Deals Mousehover and click by linkText
    public void deals(){
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[12]/a","Daily Deals");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[12]/a","Electronic Deals");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[12]/a","Fashion Deals");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[12]/a","H&G Deals");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[12]/a","Gift Card Deals");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[12]/a","Collectibles & Art");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[12]/a","Toy Deals");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[12]/a","Sporting Goods Deals");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[12]/a","Motors Deals");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[11]/a","Travel Deals");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[11]/a","Musical Instrument Deals");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[11]/a","Shop All Deals");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[11]/a","Pre-owned Picks");
    }
    //Check Ebay Under $10 Mousehover and click by linkText
    public void under$10(){
        clickByXpath("//*[@id='s0-container']/li[13]/a");
    }




}