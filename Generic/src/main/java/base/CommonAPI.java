package base;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.testng.annotations.Optional;
import reporting.ExtentManager;
import reporting.ExtentTestManager;

import java.io.*;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public WebDriver driver ;

    private String saucelabs_username = "NaimKhanSiam";
    private String saucelabs_accesskey = "eba49d53-2951-4bc6-9f4c-eb73a341142f";
    private String browserstack_username = "syedhussain12";
    private String browserstack_accesskey = "kirtwUx9PdV6JvQEnAKs";

    //Extent Report Setup
    public static ExtentReports extent;
    @BeforeSuite
    public void extentSetup(ITestContext context) {
        ExtentManager.setOutputDirectory(context);
        extent = ExtentManager.getInstance();
    }

    @BeforeMethod
    public void startExtent(Method method) {
        String className = method.getDeclaringClass().getSimpleName();
        String methodName = method.getName().toLowerCase();
        ExtentTestManager.startTest(method.getName());
        ExtentTestManager.getTest().assignCategory(className);
    }

    protected String getStackTrace(Throwable t) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        return sw.toString();
    }

    @AfterMethod
    public void afterEachTestMethod(ITestResult result) {
        ExtentTestManager.getTest().getTest().setStartedTime(getTime(result.getStartMillis()));
        ExtentTestManager.getTest().getTest().setEndedTime(getTime(result.getEndMillis()));
        for (String group : result.getMethod().getGroups()) {
            ExtentTestManager.getTest().assignCategory(group);
        }

        if (result.getStatus() == 1) {
            ExtentTestManager.getTest().log(LogStatus.PASS, "Test Passed");
        } else if (result.getStatus() == 2) {
            ExtentTestManager.getTest().log(LogStatus.FAIL, getStackTrace(result.getThrowable()));
        } else if (result.getStatus() == 3) {
            ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");
        }

        ExtentTestManager.endTest();
        extent.flush();
        if (result.getStatus() == ITestResult.FAILURE) {
            captureScreenshot(driver, result.getName());
        }
    }

    @AfterSuite
    public void generateReport() {
        extent.close();
    }



    @Parameters({"useCloudEnv","cloudEnvName","os","os_version","browserName","browserVersion","url"})
    @BeforeMethod
    public void setUp(@Optional("false") boolean useCloudEnv, @Optional("false")String cloudEnvName,
                      @Optional("OS X") String os,@Optional("10") String os_version, @Optional("firefox") String browserName, @Optional("34")
                              String browserVersion, String url)throws IOException {
        System.setProperty("webdriver.chrome.driver", "/Users/peoplentech/eclipse-workspace-March2018/SeleniumProject1/driver/chromedriver");
        if(useCloudEnv==true){
            if(cloudEnvName.equalsIgnoreCase("browserstack")) {
                getCloudDriver(cloudEnvName,browserstack_username,browserstack_accesskey,os,os_version, browserName, browserVersion);
            }else if (cloudEnvName.equalsIgnoreCase("saucelabs")){
                getCloudDriver(cloudEnvName,saucelabs_username, saucelabs_accesskey,os,os_version, browserName, browserVersion);
            }
        }else{
            getLocalDriver(os, browserName);
        }
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.get(url);
        //driver.manage().window().maximize();
    }
    public WebDriver getLocalDriver(@Optional("mac") String OS, String browserName){
        if(browserName.equalsIgnoreCase("chrome")){
            if(OS.equalsIgnoreCase("OS X")){
                System.setProperty("webdriver.chrome.driver", "../Generic/driver/chromedriver");
            }else if(OS.equalsIgnoreCase("Windows")){
                System.setProperty("webdriver.chrome.driver", "../Generic/driver/chromedriver.exe");
            }
            driver = new ChromeDriver();
        }else if(browserName.equalsIgnoreCase("firefox")){
            if(OS.equalsIgnoreCase("OS X")){
                System.setProperty("webdriver.gecko.driver", "../Generic/driver/geckodriver");
            }else if(OS.equalsIgnoreCase("Windows")) {
                System.setProperty("webdriver.gecko.driver", "../Generic/driver/geckodriver.exe");
            }
            driver = new FirefoxDriver();

        } else if(browserName.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", "../driver/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        return driver;

    }

    public WebDriver getCloudDriver(String envName, String envUsername, String envAccessKey, String os,
                                    String os_version, String browser_name, String browser_version)
            throws IOException {

        DesiredCapabilities cap = new DesiredCapabilities();
        //sets the os and browser info for the cloud
        cap.setCapability("browser", browser_name);
        cap.setCapability("browser_version", browser_version);
        cap.setCapability("os", os);
        cap.setCapability("os_version", os_version);
        if (envName.equalsIgnoreCase("Saucelabs")) {
            //sets up the url and the remote driver
            driver = new RemoteWebDriver(new URL("http://" + envUsername + ":" + envAccessKey +
                    "@ondemand.saucelabs.com:80/wd/hub"), cap);
        } else if (envName.equalsIgnoreCase("Browserstack")) {
            cap.setCapability("resolution", "1024x768");
            driver = new RemoteWebDriver(new URL("http://" + envUsername + ":" + envAccessKey +
                    "@hub-cloud.browserstack.com/wd/hub"), cap);
        }
        return driver;
    }
    @AfterMethod
    public void quit() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }


    //clicks
    public void clickByCss(String locator) {
        driver.findElement(By.cssSelector(locator)).click();
    }
    public void clickByXpath(String locator) {
        driver.findElement(By.xpath(locator)).click();
    }
    public void clickByLinkedText(String locator) {
        driver.findElement(By.linkText(locator)).click();
    }

    public void clickByElement(String locator){
        try {
            driver.findElement(By.name(locator)).click();
        }catch(Exception ex1){
            try {
                driver.findElement(By.className(locator)).click();
            }catch(Exception ex2){
                driver.findElement(By.id(locator)).click();
            }
        }
    }
    //click n clear
    public void clickNClearbyXpath(String xpath){
        driver.findElement(By.xpath(xpath)).clear();
    }
    //typeNenter
     public void typeByCssNEnter(String locator, String value) {
        driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
    }
    public void typeByXpathNEnter(String locator, String value) {
        driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
    }
    public void typeOnInputFieldNEnter(String locator, String value){
        try {
            driver.findElement(By.className(locator)).sendKeys(value,Keys.ENTER);
        }catch (Exception ex){
            driver.findElement(By.id(locator)).sendKeys(value,Keys.ENTER);
        }
    }
    //type
    public void typeByCss(String locator, String value) {
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }
    public void typeByXpath(String locator, String value) {
        driver.findElement(By.xpath(locator)).sendKeys(value);
    }
    public void typeOnInputField(String locator, String value){
        try {
            driver.findElement(By.className(locator));
        }catch (Exception ex){
            driver.findElement(By.id(locator));
        }
    }
    //clear
    public void clearInputFieldbyCSS(String locator) {
        driver.findElement(By.cssSelector(locator)).clear();
    }
    //get text
    public String getTextByCss(String locator) {
        String st = driver.findElement(By.cssSelector(locator)).getText();
        return st;
    }
    public String getTextByXpath(String locator) {
        String st = driver.findElement(By.xpath(locator)).getText();
        return st;
    }
    public String getTextByIDorName(String locator){
        try {
            String st = driver.findElement(By.id(locator)).getText();
            return st;
        }catch (Exception ex){
            String st = driver.findElement(By.name(locator)).getText();
            return st;
        }
    }
    //navigate
    public void navigateBack() {
        driver.navigate().back();
    }
    public void navigateForward() {
        driver.navigate().forward();
    }
    //sleep
    public void sleepFor(int sec) throws InterruptedException {
        Thread.sleep(sec * 1000);
    }

    //webElements
    public List<String> getTextFromWebElements(String type, String locator) {
        List<WebElement> element;
        List<String> text = new ArrayList<String>();
        element = getElementList(type, locator);
        for (WebElement we : element) {
            text.add(we.getText());
        }
        return text;
    }
    //new tab
    public void openNewTab(String urlLink)
    {   String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
        driver.findElement(By.linkText(urlLink)).sendKeys(selectLinkOpeninNewTab);
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));

    }
    public List<WebElement> getElementsByXpathforList(String Xpath){
        List<WebElement> value = driver.findElements(By.xpath(Xpath));
        return value;
    }


    public List<WebElement> getElementsByCSSforList(String CSS){
        List<WebElement> value = driver.findElements(By.cssSelector(CSS));
        return value;
    }
    public List<WebElement> getElementList(String type, String locator) {
        type = type.toLowerCase();
        List<WebElement> elementList = new ArrayList<WebElement>();
        if (type.equals("id")) {
            elementList = driver.findElements(By.id(locator));
        } else if (type.equals("name")) {
            elementList = driver.findElements(By.name(locator));
        } else if (type.equals("xpath")) {
            elementList = driver.findElements(By.xpath(locator));
        } else if (type.equals("css")) {
            elementList = driver.findElements(By.cssSelector(locator));
        } else if (type.equals("classname")) {
            elementList = driver.findElements(By.className(locator));
        } else if (type.equals("tagname")) {
            elementList = driver.findElements(By.tagName(locator));
        } else if (type.equals("linktext")) {
            elementList = driver.findElements(By.linkText(locator));
        } else if (type.equals("partiallinktext")) {
            elementList = driver.findElements(By.partialLinkText(locator));
        } else {
            System.out.println("Locator type not supported");
        }
        if (elementList.isEmpty()) {
            System.out.println("Element not found with " + type + ": " + locator);

        } else {
            System.out.println(elementList);
        }
        return elementList;
    }
    //mouseHOver
     public void mouseHoverNClickbyXC(String locator,String linkText) {
        try{Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.cssSelector(locator))).build().perform();
        Thread.sleep(3000);
        driver.findElement(By.linkText(linkText)).click();}
        catch (Exception ex) {
            System.out.println("First attempt has been done, This is second try");
             Actions action = new Actions(driver);
            action.moveToElement(driver.findElement(By.xpath(locator))).build().perform();
            driver.findElement(By.linkText(linkText)).click();
        }
    }
    //switch tabs
    public void switchTabs(Integer toClose, Integer toKeep){
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(toClose));
        driver.close();
        driver.switchTo().window(tabs.get(toKeep));

    }
    //implicity_wait
    public void implicityWait(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    //get url
    public String  getCurrentPageUrl(){
        String url = driver.getCurrentUrl();
        return url;
    }
    //handling Alert
    public void okAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void cancelAlert() {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }
    //iframe Handle --window for popup window, frame for iframe,default content for going back to home window
    public void iframeHandle(WebElement element) {
        driver.switchTo().frame(element);
    }

    //go back to home
    public void goBackToHomeWindow() {
        driver.switchTo().defaultContent();
    }

    //get Links
    public void getLinks(String locator){
        driver.findElement(By.linkText(locator)).findElement(By.tagName("a")).getText();
    }
    //screenshot
    public static void captureScreenshot(WebDriver driver, String screenshotName) {

        DateFormat df = new SimpleDateFormat("(MM.dd.yyyy-HH:mma)");
        Date date = new Date();
        df.format(date);

        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File(System.getProperty("user.dir") + "/screenshots/" + screenshotName + " " + df.format(date) + ".png"));
            System.out.println("Screenshot captured");
        } catch (Exception e) {
            System.out.println("Exception while taking screenshot " + e.getMessage());
            ;
        }

    }
    //Taking Screen shots
    public void takeScreenShot()throws IOException {
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("screenShots.png"));
    }
    //upload files
    public void upLoadFile(String locator,String path){
        driver.findElement(By.cssSelector(locator)).sendKeys(path);
        /* path example to upload a file/image
           path= "C:\\Users\\rrt\\Pictures\\ds1.png";
         */
    }//clear Input
    public void clearInputByCSS(String locator){
        driver.findElement(By.cssSelector(locator)).clear();
    }
    //clear Input
    public void clearInputByXpath(String locator){
        driver.findElement(By.xpath(locator)).clear();
    }
    //keys Input
    public void keysInput(String locator){
        driver.findElement(By.cssSelector(locator)).sendKeys(Keys.ENTER);
    }//convert to string
    public String convertToString(String st){
        String splitString ;
        splitString = StringUtils.join(StringUtils.splitByCharacterTypeCamelCase(st), ' ');
        return splitString;
    }
    //get time

    private Date getTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();
    }
    //mouse hover
    public void mouseHoverByXpath(String locator){
        try {
            WebElement element = driver.findElement(By.xpath(locator));
            Actions action = new Actions(driver);
            Actions hover = action.moveToElement(element);
        }catch(Exception ex){
            System.out.println("First attempt has been done, This is second try");
            WebElement element = driver.findElement(By.cssSelector(locator));
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();

        }

    }


    //Synchronization
    public void waitUntilClickAble(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    public void waitUntilVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public void waitUntilSelectable(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        boolean element = wait.until(ExpectedConditions.elementToBeSelected(locator));
    }
    public void clickWhenReady(By locator, int timeout) {
        try {
            WebElement element = null;
            System.out.println("Waiting for a max: " + timeout + " seconds for element to be clickable.");
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            element = wait.until(ExpectedConditions.elementToBeClickable(locator));
            element.click();
            System.out.println("Element clicked on web page");
        } catch (Exception e) {
            System.err.println("Element not found on web page.");
        }
    }
    public WebElement waitForElement(By locator, int timeout) {
        WebElement element = null;
        try {
            System.out.println("Waiting for a max: " + timeout + " seconds for element to be available.");
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            System.out.println("Element found on web page");
        } catch (Exception e) {
            System.err.println("Element not found on web page.");
        }
        return element;
    }

    public boolean isElementPresent(String type, String locator) {
        List<WebElement> elementList = getElementList(type, locator);
        int size = elementList.size();
        if (size > 0) {
            return true;
        } else {
            return false;
        }
    }

    public List<WebElement> clickableLinks() {
        List<WebElement> linksToClick = new ArrayList<WebElement>();
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        elements.addAll(driver.findElements(By.tagName("img")));

        for (WebElement we : elements) {
            if (we.getAttribute("href") != null) {
                linksToClick.add(we);
            }
        }
        return linksToClick;
    }

    public String getLinkStatus(URL url) {
        try {
            HttpURLConnection http = (HttpURLConnection) url.openConnection();
            http.connect();
            String responseMessage = http.getResponseMessage();
            http.disconnect();
            return responseMessage;
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public void selectOptionByVisibleText(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }

    public static boolean isPopUpWindowDisplayed(WebDriver driver1, String locator){
        boolean value = driver1.findElement(By.cssSelector(locator)).isDisplayed();
        return value;
    }


    public static ArrayList<String> dataFromExcel(String path, String sheetName, int columnNo) throws IOException {
        FileInputStream fis = new FileInputStream(path);
        HSSFWorkbook wb = new HSSFWorkbook(fis);
        HSSFSheet s = wb.getSheet(sheetName);
        Iterator<Row> rowIT = s.iterator();
        ArrayList<String> list = new ArrayList<String>();
        while (rowIT.hasNext()) {
            list.add(rowIT.next().getCell(columnNo).getStringCellValue());
        }
        return list;
    }

    public void printExcelSpecificColumn(String sheetName,int columnNo,String path) throws IOException {
        String excelValues= String.valueOf(dataFromExcel(path,sheetName,columnNo));
        System.out.println(excelValues);
    }

}
