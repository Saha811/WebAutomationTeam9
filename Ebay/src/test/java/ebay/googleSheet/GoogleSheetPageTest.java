package ebay.googleSheet;

import googleSheet.GoogleSHeetPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class GoogleSheetPageTest extends GoogleSHeetPage {
    //@Test
    public void testGoogleSheet() throws IOException, InterruptedException {
        searchItemsByName();
    }
    @Test
    public void SearchForSpecificItem() throws IOException, InterruptedException {

        searchForSpecificItem();
    }
}
