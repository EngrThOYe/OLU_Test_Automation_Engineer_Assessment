package com.codas.pages;

import com.codas.commons.DriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class BasePage extends DriverManager {

    public String BASE_URL = "https://www.codas.com/";

    public void NavigateToHomePage() {
        driver.navigate().to(BASE_URL);
    }

    private Select select;

    public void selectByText(WebElement element, String text) {
        select = new Select(element);
        select.selectByVisibleText(text);
    }

    public void selectByValue(WebElement element, String value) {
        select = new Select(element);
        select.selectByValue(value);
    }

    public void selectByIndex(WebElement element, int index) {
        select = new Select(element);
        select.selectByIndex(index);
    }

    public static void takeScreenshot(String stepName) throws IOException {

        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File scrFile = screenshot.getScreenshotAs(OutputType.FILE);
        String TCName = "GDS_Test_001";
        String dir = System.getProperty("user.dir");
        String timestamp = String.valueOf(System.currentTimeMillis());
        String path = dir + "/src/test/java/com/codas/Screenshot_images/" + TCName + "/screenshot_" + stepName + "" + timestamp + ".jpeg";
        File destFile = new File(path);
        FileUtils.copyFile(scrFile, destFile);

    }

    public void switchWindows() {
        String mainHandle = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        for (String handle : handles) {
            if (!handle.equals(mainHandle)) {
                driver.switchTo().window(handle);
            }
        }
    }


}
