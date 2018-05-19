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

    public List<String> loginUsers() throws IOException, InterruptedException {
        List<List<Object>> values = getSpreadSheetRecords("17Dg6poq2NG9r48Z3zu8hdAw1XSRXq91H-soD4pUcj64","Sheet1!A2:B");
        List<String> actual = new ArrayList<>();
        List<String> expected = new ArrayList<>();

        for(List row : values){
            wait(4) ;
            clickByXpath("//*[@id='username']");
            typeByXpath("//*[@id='username']", row.get(1).toString());
            typeByXpath("/html//input[@id='password']", row.get(1).toString());
            clickByXpath("/html//input[@id='signInBtn']");
            wait(5);
            actual.add(getCurrentPageUrl());
            expected.add(row.get(1).toString());
            navigateBack();
            System.out.println(row.get(1));
            Assert.assertEquals(actual,expected);
        }return actual;
    }
}
