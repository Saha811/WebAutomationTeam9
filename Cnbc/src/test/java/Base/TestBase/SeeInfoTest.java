package Base.TestBase;

import Base.SeeInfo;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class SeeInfoTest extends SeeInfo {
    @Test
    public void viewInfo(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        //seeInfo();
        }
}
