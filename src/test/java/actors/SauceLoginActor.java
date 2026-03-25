package actors;

import pages.SauceLoginPage;

public class SauceLoginActor {
    static SauceLoginPage sauceLoginPage=new SauceLoginPage();

    public static void navigate(String url){
        sauceLoginPage.navigateTo(url);
    }
    public void enterUsername(String uname){
        sauceLoginPage.userNameEnter(uname);
    }

}
