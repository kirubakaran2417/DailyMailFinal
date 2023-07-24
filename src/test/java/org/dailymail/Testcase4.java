package org.dailymail;

import io.appium.java_client.android.AndroidDriver;
import org.dailymail.base.BaseUI;
import org.dailymail.pages.Video;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(org.dailymail.utils.ListenerUtils.class)

public class Testcase4 extends BaseUI {
    private AndroidDriver driver;
    @BeforeClass
    public void setUp(){
        driver = invokeBrowser();
        openBrowser("websiteURL2");
    }
    @Test(priority = 0)
    public void searchlink(){
        Video video = new Video(logger,driver);
        video.searchClick();
    }
    @Test(priority = 1)
    public void TypeSearchText(){
        Video video = new Video(logger,driver);
        video.searchText("putin");
    }
    @Test(priority = 2)
    public void clickSearchButton(){
        Video video = new Video(logger,driver);
        video.searchButton();
    }

    @Test(priority = 3)
    public void close(){
        Video video = new Video(logger,driver);
        video.oldestButton();
    }
}
