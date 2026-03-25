package steps;

import base.BrowserInteraction;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    BrowserInteraction browserInteraction=new BrowserInteraction();
    @Before
    public void setup(){
        browserInteraction.startBrowser();
    }

    @After
    public void tearDown(){
        browserInteraction.closeBrowser();
    }
}
