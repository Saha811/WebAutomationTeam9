package googleSheet;

import base.CommonAPI;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import org.testng.Assert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static utility.GoogleSheetReader.getSheetsService;

public class GoogleSHeetPage extends CommonAPI {
    public List<List<Object>> getSpreadSheetRecords(String spreadSheetID, String range) throws IOException{
        //build a authorize api client service
        Sheets service = getSheetsService();
       ValueRange response = service.spreadsheets().values().get(spreadSheetID,range).execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.size() == 0){
            return null;
        }else{
            return values;
        }
    }

    public List<String> searchItemsByName() throws IOException, InterruptedException {
        List<List<Object>> values = getSpreadSheetRecords("1nHi8IV_-AUZq8-9ejFZblhZ6Fq7ea4jFGEPKBOrtGA8","Sheet1!A2:B");
        List<String> actual = new ArrayList<>();

        for(List row : values){
            sleepFor(2);
            typeByXpathNEnter("//input[@id='gh-ac']",row.get(1).toString());
            sleepFor(2);
            actual.add(getCurrentPageUrl());
            clearInputByXpath("//input[@id='gh-ac']");
            sleepFor(2);
        }return actual;
    }

    public List<String> searchForSpecificItem() throws IOException, InterruptedException {
        List<List<Object>> values = getSpreadSheetRecords("1YAmBLvt6uXiabmoHXNNHxeBVEhEycfmtX7MVR7aKPJc","Sheet1!A2:B");
        List<String> actual = new ArrayList<>();
        List<String> expected = new ArrayList<>();

        for(List row : values){
            sleepFor(2);
            typeByXpathNEnter("//input[@id='gh-ac']",row.get(0).toString());
            sleepFor(2);
            expected.add(row.get(1).toString());
            actual.add(getTextByXpath("//*[text()='"+row.get(1).toString()+"']"));
            clearInputByXpath("//input[@id='gh-ac']");
            sleepFor(2);
            System.out.println(row.get(1));
            Assert.assertEquals(actual,expected);
        }return actual;
}

}
