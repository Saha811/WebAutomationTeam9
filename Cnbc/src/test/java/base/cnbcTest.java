package base;

import TestBase.mainClass;
import org.testng.annotations.Test;

public class cnbcTest extends mainClass {
    @Test
    public void homeTest(){homeUs();}
    @Test
    public void marketTest(){markets();}
    @Test
    public void investingTest(){ investing();}
    @Test
    public void techTest(){tech(); }
    @Test
    public void makeItTest(){ makeIt();}
    @Test
    public void videoTest(){ video();}
    @Test
    public void showsTest(){ shows();}
    @Test
    public void subscribeTest(){ subscribe();}
    @Test
    public void proTest(){ pro();}
    @Test
    public void liveTvTest(){liveTv();}
    @Test
    public void watchList(){ watchList();}

}