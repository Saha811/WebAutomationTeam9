package citybank;

import main.CityHomeLinks;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class CityHomeLinksTest extends CityHomeLinks {

    @Test
    public void whyCiti(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WhyCiti();
    }

    @Test
    public void RelBanking(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        relBanking();
    }

    @Test
    public void BusinessBanking(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        businessBanking();
    }

    @Test
    public void Rates(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        rates();
    }

    @Test
    public void citiEasy() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CitiEasy();
    }
    @Test
    public void citiPrivate(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CitiPrivate();
    }

    @Test
    public void citiPrivateBank() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CitiPrivateBank();
    }
}
