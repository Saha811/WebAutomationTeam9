package Base.TestBase;

import Base.Search;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class SearchTest extends Search {
    @Test
    public void searchMultipleIteams() {
        Search sc = PageFactory.initElements(driver, Search.class);
        sc.searchItems();
    }
    //@Test
    public void searchOneItem(){ searchItems();}
    @Test
    public void exTest() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        excelTest();
    }
}
