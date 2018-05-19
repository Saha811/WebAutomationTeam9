package Base;

import base.CommonAPI;
import database.ConnectDB;

import java.util.ArrayList;
import java.util.List;

public class DataBaseWork extends CommonAPI {
    public static List<String> searchList () {
        List<String> listItem = new ArrayList<String>();
        listItem.add("Game Of Thornes");
        listItem.add("Flash");
        listItem.add("Arrow");
        listItem.add("Bangladesh Cricket");
        return listItem;
    }
   /* public static void main(String[] args) {
        ConnectDB connectDB = new ConnectDB();
        connectDB.insertDataFromArrayListToMySql(getItemValue(),"TestTwo","search");
    }*/
    public void infoDatabase() throws Exception {
        ConnectDB connectDB = new ConnectDB();
        List<String> items = connectDB.readDataBase("TestEbay","search");
        for (int i = 0; i < items.size(); i++) {
            typeByXpathNEnter("//input[@id='gh-ac']", items.get(i));
            clearInputByXpath("//input[@id='gh-ac']");
        }
    }
}
