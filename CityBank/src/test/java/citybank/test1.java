package citybank;

import Base.mainClass;
import org.testng.annotations.Test;

public class test1 extends mainClass {
    //check top bar
   // @Test
    public void testCheckBar(){
        CheckCreditCard();
    }

    //compare credit cards
    @Test
    public void Compare() throws InterruptedException {
        compareCreditCards();
    }
}


