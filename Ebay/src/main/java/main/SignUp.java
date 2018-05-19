package main;

import base.CommonAPI;

public class SignUp extends CommonAPI {
    String beforeURL;
    String afterURL;
    //******positive testing
    //REGISTER to ebay
    public void validRegister() throws InterruptedException {
        clickByLinkedText("register");
        typeByCss("#firstname_r [v]","naim");
        typeByCss("#lastname_r [v]","siam");
        typeByXpath("/html//input[@id='email']","zan.sheum@gmail.com");
        typeByXpath("/html//input[@id='PASSWORD']","testMySelenium123#@");
        Thread.sleep(1000);
        clickByXpath("/html//input[@id='ppaFormSbtBtn']");
    }
    //*****negative testing
    //register with no email
    public void noEmailRegisterTry() throws InterruptedException {
        clickByLinkedText("register");
        typeByCss("#firstname_r [v]","naim");
        typeByCss("#lastname_r [v]","siam");
        typeByXpath("/html//input[@id='PASSWORD']","testMySelenium123#@");
        Thread.sleep(1000);
        clickByXpath("/html//input[@id='ppaFormSbtBtn']");
    }
    //register with no password
    public void noPassRegisterTry() throws InterruptedException {
        clickByLinkedText("register");
        typeByCss("#firstname_r [v]","naim");
        typeByCss("#lastname_r [v]","siam");
        typeByXpath("/html//input[@id='email']","zan.sheum@gmail.com");
        Thread.sleep(1000);
        clickByXpath("/html//input[@id='ppaFormSbtBtn']");
    }
    //register with no password, no email
    public void  noPassEmailRegisterTry() throws InterruptedException {
        clickByLinkedText("register");
        typeByCss("#firstname_r [v]","naim");
        typeByCss("#lastname_r [v]","siam");
        Thread.sleep(1000);
        clickByXpath("/html//input[@id='ppaFormSbtBtn']");
    }
    //register with no first name
    public void noFirstNameRegisterTry() throws InterruptedException {
        clickByLinkedText("register");
        typeByCss("#lastname_r [v]","siam");
        typeByXpath("/html//input[@id='email']","zan.sheum@gmail.com");
        typeByXpath("/html//input[@id='PASSWORD']","testMySelenium123#@");
        Thread.sleep(1000);
        clickByXpath("/html//input[@id='ppaFormSbtBtn']");

    }
    //register with no last name
    public void noLastNameRegisterTry() throws InterruptedException {
        clickByLinkedText("register");
        typeByCss("#firstname_r [v]","naim");
        typeByXpath("/html//input[@id='email']","zan.sheum@gmail.com");
        typeByXpath("/html//input[@id='PASSWORD']","testMySelenium123#@");
        Thread.sleep(1000);
        clickByXpath("/html//input[@id='ppaFormSbtBtn']");

    }
    //register with no first name,last name
    public void  noFirstLastNameRegisterTry() throws InterruptedException {
        clickByLinkedText("register");
        typeByXpath("/html//input[@id='email']","zan.sheum@gmail.com");
        typeByXpath("/html//input[@id='PASSWORD']","testMySelenium123#@");
        Thread.sleep(1000);
        clickByXpath("/html//input[@id='ppaFormSbtBtn']");
    }
    //register with no email,first name
    public void noEmailFirstNameRegisterTry() throws InterruptedException {
        clickByLinkedText("register");
        typeByCss("#lastname_r [v]","siam");
        typeByXpath("/html//input[@id='PASSWORD']","testMySelenium123#@");
        Thread.sleep(1000);
        clickByXpath("/html//input[@id='ppaFormSbtBtn']");
    }
    //register with no password, first name
    public void noPassFirstNameRegisterTry() throws InterruptedException {
        clickByLinkedText("register");
        typeByCss("#lastname_r [v]","siam");
        typeByXpath("/html//input[@id='email']","zan.sheum@gmail.com");
        Thread.sleep(1000);
        clickByXpath("/html//input[@id='ppaFormSbtBtn']");
    }
    //register with no password, no email,first name
    public void  noPassEmailFirstNameRegisterTry() throws InterruptedException {
        clickByLinkedText("register");
        typeByCss("#lastname_r [v]","siam");
        Thread.sleep(1000);
        clickByXpath("/html//input[@id='ppaFormSbtBtn']");
    }
    //register with no email,last name
    public void noEmailLastNameRegisterTry() throws InterruptedException {
        clickByLinkedText("register");
        typeByCss("#firstname_r [v]","naim");
        typeByXpath("/html//input[@id='PASSWORD']","testMySelenium123#@");
        Thread.sleep(1000);
        clickByXpath("/html//input[@id='ppaFormSbtBtn']");
    }
    //register with no password,last name
    public void noPassLastNameRegisterTry() throws InterruptedException {
        clickByLinkedText("register");
        typeByCss("#firstname_r [v]","naim");
        typeByXpath("/html//input[@id='email']","zan.sheum@gmail.com");
        Thread.sleep(1000);
        clickByXpath("/html//input[@id='ppaFormSbtBtn']");
    }
    //register with no password, no email,no last name
    public void  noPassEmailLastNameRegisterTry() throws InterruptedException {
        clickByLinkedText("register");
        typeByCss("#firstname_r [v]","naim");
        typeByCss("#lastname_r [v]","siam");
        Thread.sleep(1000);
        clickByXpath("/html//input[@id='ppaFormSbtBtn']");
    }
    //register with no input
    public void  noInput() {
        clickByLinkedText("register");
        clickByXpath("/html//input[@id='ppaFormSbtBtn']");
    }

}
