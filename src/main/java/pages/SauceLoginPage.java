package pages;

import base.BrowserInteraction;

public class SauceLoginPage extends BrowserInteraction {

    private String userLoc="[placeholder='Email']";
    public static void navigateTo(String url){
        navigate(url);
    }

    public void userNameEnter(String uname) {
        enterUsername(uname,userLoc);
    }
}
