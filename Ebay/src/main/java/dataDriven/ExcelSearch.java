package dataDriven;

import base.CommonAPI;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ExcelSearch extends CommonAPI {

    public void testExcel() throws IOException {
        ArrayList<String> searchAbleItems = dataFromExcel("/Users/zann/IdeaProjects/WebAutomationTeam9/Ebay/data/Book1.xls","Sheet1",1);
        for (int i = 0; i < searchAbleItems.size(); i++) {
            driver.findElement(By.xpath("fgerdvdf")).sendKeys(searchAbleItems.get(i));
            driver.findElement(By.xpath("fgerdvdf")).clear();

            typeByXpathNEnter("//input[@id='gh-ac']", searchAbleItems.get(i));
            clearInputByXpath("//input[@id='gh-ac']");
        }
    }

    public void multipleLoginExcel() throws IOException {
        clickByXpath("//*[@id='gh-ug']/a");
        ArrayList<String> searchAbleUsers = dataFromExcel("/Users/zann/IdeaProjects/WebAutomationTeam9/Ebay/data/Book1.xls", "Sheet1", 0);
        ArrayList<String> searchAblePass = dataFromExcel("/Users/zann/IdeaProjects/WebAutomationTeam9/Ebay/data/Book1.xls", "Sheet1", 1);
        for (int i = 1; i < searchAbleUsers.size(); i++) {
            typeByCss("#pri_signin div:nth-of-type(3) [size]", searchAbleUsers.get(i));
            typeByCss("#pri_signin .m12 [size]", searchAblePass.get(i));
            clickByXpath("/html//input[@id='sgnBt']");

            clearInputByCSS("#pri_signin div:nth-of-type(3) [size]");
            clearInputByCSS("#pri_signin .m12 [size]");
        }
    }

    public static void main(String[] args) throws IOException {
        String excelValues= String.valueOf(dataFromExcel("/Users/zann/IdeaProjects/WebAutomationTeam9/Ebay/data/Book1.xls","Sheet1",0));
        System.out.println(excelValues);
    }

    public void printExcelSpecificColumn(String sheetName,int columnNo,String path) throws IOException {
        String excelValues= String.valueOf(dataFromExcel(path,sheetName,columnNo));
        System.out.println(excelValues);
    }






}
