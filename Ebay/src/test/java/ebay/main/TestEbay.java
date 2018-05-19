package ebay.main;

import main.MainEbay;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestEbay extends MainEbay {
    @Test
    public void mouse(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       mouseHoverByXpath();
    }
    //view multiple items
    @Test
    public void view(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        viewMultipleByCSS();
    }
    //extended search
    @Test
    public void ExtendedSearch() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        xtendedSearches();
    }
    //search problems
    @Test
    public void Problems() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchProblems();
    }
    //search different parameters
    @Test
    public void searcfDifferent(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchWithDifferentRequirements();
    }
    //edit categories
    @Test
    public void editcategoriess(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        editCategories();
    }
    //test tab
    @Test
    public void testNewTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        newTab();
    }
    //use TAB
    @Test
    public void testTabButton() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        tabUse();
    }
    //using scrolling
    @Test
    public void scroolupanddown() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ((JavascriptExecutor) driver).executeScript("scroll(0,2000)");
       Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("scroll(50,0)");
    }

    //Check Ebay Motors Mousehover and click by linkText
    @Test
    public void testMotors(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motors();
    }
    //Check Ebay Fashion Mousehover and click by linkText
    @Test
    public void testFashion(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        fashion();
    }
    //Check Ebay Electronics Mousehover and click by linkText
    @Test
    public void testElectronics(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        electronics();
    }
    //Check Ebay Collectiables & art Mousehover and click by linkText
    @Test
    public void testCollectiablesNart(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        collectiablesNart();
    }
    //Check Ebay Home & Garden Mousehover and click by linkText
    @Test
    public void testHomeNgarden(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeNgarden();
    }
    //Check Ebay Sporting Goods Mousehover and click by linkText
    @Test
    public void testSportingGoods(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sportingGoods();
    }
    //Check Ebay Toys Mousehover and click by linkText
    @Test
    public void testToys(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        toys();
    }
    //Check Ebay Business & Industrial Mousehover and click by linkText
    @Test
    public void testBusinessNindustrial(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        businessNindustrial();
    }
    //Check Ebay Music Mousehover and click by linkText
    @Test
    public void testMusic(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        music();
    }
    //Check Ebay Deals Mousehover and click by linkText
    @Test
    public void testDeals(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        deals();
    }
    //Check Ebay Under $10 Mousehover and click by linkText
    @Test
    public void testUnder$10(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        under$10();
    }
}
