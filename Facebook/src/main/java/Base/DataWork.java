package Base;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import base.CommonAPI;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class DataWork extends CommonAPI {
    public void testExcel() throws IOException {
        ArrayList <String> userName= dataFromExcel(0);
        ArrayList<String> password =dataFromExcel(1);
        for(int i=0;i<userName.size();i++){
            driver.findElement(By.xpath("//input[@name='email']")).sendKeys(userName.get(i));
            driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password.get(i));
            clearInputByXpath("//input[@name='email']");
            clearInputByXpath("//input[@name='pass']");
        }
    }
    public ArrayList<String> dataFromExcel(int colNo) throws IOException {
        FileInputStream filein = new FileInputStream("/Users/sreejon/IdeaProjects/WebAutomationTeam9/Facebook/DataInput/myfblogin.xls");
        HSSFWorkbook hss = new HSSFWorkbook(filein);
        HSSFSheet siter = hss.getSheet("Sheet1");
        Iterator<Row> rowIT =siter.iterator();
        ArrayList<String> list = new ArrayList<>();
        while(rowIT.hasNext()){
            list.add(rowIT.next().getCell(colNo).getStringCellValue());
        }
        return list;
    }
}
