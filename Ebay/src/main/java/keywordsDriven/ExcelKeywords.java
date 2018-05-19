package keywordsDriven;

import base.CommonAPI;

import java.io.IOException;

public class ExcelKeywords extends CommonAPI {
    CommonFunctions cf = new CommonFunctions();

   public String[][] read() throws IOException {
       String[][] a = ExcelReader.FetchDataFromExcel("/Users/zann/IdeaProjects/WebAutomationTeam9/Ebay/data/Book1.xls");
       System.out.println(a[1][1]);
       return a;
   }

   public void test1() throws IOException {
       String[][] a = ExcelReader.FetchDataFromExcel("/Users/zann/IdeaProjects/WebAutomationTeam9/Ebay/data/BookKeyWord.xls");
       clickByCss(a[1][2]);

   }








}
