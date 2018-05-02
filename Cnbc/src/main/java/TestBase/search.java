package TestBase;

import base.CommonAPI;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class search extends CommonAPI {
    //search single iteam
    public void itemSearch(){
        typeByXpathNEnter("//*[@placeholder='Search Quotes, News & Video']","gaming");
        //driver.findElement(By.xpath("//*[@placeholder='Search Quotes, News & Video']")).sendKeys("VERIZON",Keys.ENTER);
    }
    //SearchMultipleItems
    @FindBy(xpath = "//*[@placeholder='Search Quotes, News & Video']")
    public WebElement searchElements;
    public void searchItems() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("gaming");
        itemsList.add("social media");
        itemsList.add("mobile");
        for (String st : itemsList) {
            searchElements.sendKeys(st, Keys.ENTER);
            //driver.findElement(By.xpath("//*[@class='fa fa-search fa-2']")).click();
            searchElements.clear();
        }
    }
    public ArrayList<String> dataFromExcel(int colNo) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/sreejon/IdeaProjects/WebAutomationTeam9/Cnbc/cnbcData/CnbcBook-1.xls");
        HSSFWorkbook wb = new HSSFWorkbook(fis);
        HSSFSheet s = wb.getSheet("CnbcBook");
        Iterator<Row> rowIT =s.iterator();
        ArrayList<String> list = new ArrayList<>();
        while(rowIT.hasNext()){
            list.add(rowIT.next().getCell(colNo).getStringCellValue());
        }
        return list;
    }
    public void excelTest() throws IOException {
        ArrayList<String> searchAbleItems = dataFromExcel(0);
        for (int i = 0; i < searchAbleItems.size(); i++) {
            typeByXpathNEnter("//*[@placeholder='Search Quotes, News & Video']", searchAbleItems.get(i));
            clearInputByXpath("//*[@placeholder='Search Quotes, News & Video']");
        }
    }
    public void work(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//i[@class='fa fa-user fa-2']"))).build().perform();
        driver.findElement(By.xpath("//*[@id='unreg-user']/li/ul/li[1]")).click();
    }



}