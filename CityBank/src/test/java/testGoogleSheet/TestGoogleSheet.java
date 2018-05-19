package testGoogleSheet;

import googleSheet.GoogleSHeetPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestGoogleSheet extends GoogleSHeetPage {
    @Test
    public  void test1() throws IOException, InterruptedException {
        loginUsers();
    }
}
