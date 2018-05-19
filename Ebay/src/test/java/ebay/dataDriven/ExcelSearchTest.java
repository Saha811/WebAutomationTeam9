package ebay.dataDriven;

import dataDriven.ExcelSearch;
import org.testng.annotations.Test;

import java.io.IOException;

public class ExcelSearchTest extends ExcelSearch {
    @Test
    public void TestExcel() throws IOException {
        testExcel();
    }
    @Test
    public void TestMultipleUsersExcel() throws IOException {
        multipleLoginExcel();
    }
}
