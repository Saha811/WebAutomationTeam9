package testDatadriven;

import dataDriven.ExcelSearch;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestExcelSearch extends ExcelSearch {
    @Test
    public void test1() throws IOException, InterruptedException {
        multipleLoginExcel();
    }

}
