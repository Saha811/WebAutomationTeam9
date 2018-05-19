package main;

import base.CommonAPI;

public class Login extends CommonAPI {
    //******positive testing
    //login to ebay
    public void login(){
        clickByXpath("//*[@id='gh-ug']/a");
        typeByCss("#pri_signin div:nth-of-type(3) [size]","zan.sheum@gmail.com");
        typeByCss("#pri_signin .m12 [size]","testMySelenium123#@");
        clickByXpath("/html//input[@id='sgnBt']");
    }

    //*****negative testing
    //login with fake email
    public void fakeEmailLoginTry(){
        clickByXpath("//*[@id='gh-ug']/a");
        typeByCss("#pri_signin div:nth-of-type(3) [size]","fake_email@gmail.com");
        typeByCss("#pri_signin .m12 [size]","testMySelenium123#@");
        clickByXpath("/html//input[@id='sgnBt']");
    }
    //login with fake password
    public void fakePassLoginTry(){
        clickByXpath("//*[@id='gh-ug']/a");
        typeByCss("#pri_signin div:nth-of-type(3) [size]","zan.sheum@gmail.com");
        typeByCss("#pri_signin .m12 [size]","fake_pass");
        clickByXpath("/html//input[@id='sgnBt']");
    }
    //login with fake email,fake pass
    public void fakePassEmailLoginTry(){
        clickByXpath("//*[@id='gh-ug']/a");
        typeByCss("#pri_signin div:nth-of-type(3) [size]","fake_email@gmail.com");
        typeByCss("#pri_signin .m12 [size]","fake_pass");
        clickByXpath("/html//input[@id='sgnBt']");
    }
    //log in with no email
    public void noEmailLoginTry(){
        clickByXpath("//*[@id='gh-ug']/a");
        typeByCss("#pri_signin .m12 [size]","fake_pass");
        clickByXpath("/html//input[@id='sgnBt']");
    }
    //log in with no password
    public void noPassLoginTry(){
        clickByXpath("//*[@id='gh-ug']/a");
        typeByCss("#pri_signin div:nth-of-type(3) [size]","fake_email@gmail.com");
        clickByXpath("/html//input[@id='sgnBt']");
    }
    //log in with no password, no email
    public void noPassEmailLoginTry(){
        clickByXpath("//*[@id='gh-ug']/a");
        clickByXpath("/html//input[@id='sgnBt']");
    }
}
