package main;

import base.CommonAPI;

public class Login extends CommonAPI {
    //******positive testing
    //login to cityBank
    public void login(){
        typeByXpath("/html//input[@id='username']", "zan.sheum@gmail.com");
        typeByXpath("/html//input[@id='password']", "testMySelenium123#@");
        clickByXpath("/html//input[@id='signInBtn']");
    }

    //*****negative testing
    //login with fake email
    public void fakeEmailLoginTry(){
        typeByXpath("/html//input[@id='username']", "fake.zan.sheum@gmail.com");
        typeByXpath("/html//input[@id='password']", "testMySelenium123#@");
        clickByXpath("/html//input[@id='signInBtn']");
    }
    //login with fake password
    public void fakePassLoginTry(){
        typeByXpath("/html//input[@id='username']", "zan.sheum@gmail.com");
        typeByXpath("/html//input[@id='password']", "fake.testMySelenium123#@");
        clickByXpath("/html//input[@id='signInBtn']");
    }
    //login with fake email,fake pass
    public void fakePassEmailLoginTry(){
        typeByXpath("/html//input[@id='username']", "fake.zan.sheum@gmail.com");
        typeByXpath("/html//input[@id='password']", "fake.testMySelenium123#@");
        clickByXpath("/html//input[@id='signInBtn']");
    }
    //log in with no email
    public void noEmailLoginTry(){
        typeByXpath("/html//input[@id='password']", "testMySelenium123#@");
        clickByXpath("/html//input[@id='signInBtn']");
    }
    //log in with no password
    public void noPassLoginTry(){
        typeByXpath("/html//input[@id='username']", "zan.sheum@gmail.com");
        clickByXpath("/html//input[@id='signInBtn']");
    }
    //log in with no password, no email
    public void noPassEmailLoginTry(){
        clickByXpath("/html//input[@id='signInBtn']");
    }
}
