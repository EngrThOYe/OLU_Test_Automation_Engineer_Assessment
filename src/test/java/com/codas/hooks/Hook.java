package com.codas.hooks;

import com.codas.commons.BrowserManager;
import io.cucumber.java.Before;

public class Hook extends BrowserManager {
    @Before
    public void setup() {
        launchBrowser("Chrome");
    }

    //@After
    public void tearDown() {
        closeBrowser();
    }
}
