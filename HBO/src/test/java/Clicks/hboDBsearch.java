package Clicks;

import base.CommonAPI;
import database.ConnectDB;

import java.util.ArrayList;
import java.util.List;

public class hboDBsearch extends CommonAPI {

    //insert data to db
    public static List<String> getItemValue() {
        List<String> moviesList = new ArrayList<String>();
        moviesList.add("Inception");
        moviesList.add("GOT");
        moviesList.add("Godzilla");
        moviesList.add("Titanic");
        moviesList.add("Photograph");
        return moviesList;
    }
    //put Data to DB-Mysql
    /*public static void main(String[] args) {
        ConnectDB connectDB = new ConnectDB();
        connectDB.insertDataFromArrayListToMySql(getItemValue(),"TestHBO","search");
    }*/

    //bring data from db and search using them
    public void searchByDB() throws Exception {
        ConnectDB connectDB = new ConnectDB();
        List<String> items = connectDB.readDataBase("TestHBO","search");
        for (int i = 0; i < items.size(); i++) {
            typeByXpathNEnter("//input[@id='gh-ac']", items.get(i));
            clearInputByXpath("//input[@id='gh-ac']");
        }
    }
}
