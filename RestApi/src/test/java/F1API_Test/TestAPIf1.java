package F1API_Test;

import F1API.APIf1;
import org.testng.annotations.Test;

public class TestAPIf1 extends APIf1 {
    //

    @Test
    public void f1APItest(){
        f1API();
    }
    @Test
    public void f1APITestBadCall(){
        f1APIBadCall();
    }
    @Test
    public void f1APIserverError(){
        f1APIserverErrors();
    }
}
