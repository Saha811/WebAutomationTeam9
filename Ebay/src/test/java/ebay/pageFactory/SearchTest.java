package ebay.pageFactory;

import base.CommonAPI;
import pageFactory.Search;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class SearchTest extends CommonAPI {
    //search for a laptop
    @Test
    public void searchLaptop(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Search search = PageFactory.initElements(driver, Search.class);
        search.lookForALaptop();
    }
    //search for a laptop  and define group apple
    @Test
    public void group(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Search search = PageFactory.initElements(driver, Search.class);
        search.group();
    }
    //SearchMultipleItems
    @Test
    public void SearchMultipleItems() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Search search = PageFactory.initElements(driver, Search.class);
        search.searchItems();
    }
}
