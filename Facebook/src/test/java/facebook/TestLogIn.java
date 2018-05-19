package facebook;

import Base.LogIn;
import org.testng.annotations.Test;

public class TestLogIn extends LogIn {
    @Test
    public void test1() {login();}
    @Test
    public void test2() {loginEnter();}
    @Test
    public void test3() {loginPartEmail();}
    @Test
    public void test4() {loginPartEmailEnter();}
    @Test
    public void test5() {loginUserId();}
    @Test
    public void test6() {loginUserIdEnter();}
    @Test
    public void test7() {loginWithOutEmail();}
    @Test
    public void test8() {loginWithOutpass();}
    @Test
    public void test9() {loginWithWrongEmail();}
    @Test
    public void test10() {loginWithWrongPass();}
  
}