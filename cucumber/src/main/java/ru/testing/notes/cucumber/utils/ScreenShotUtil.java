package ru.testing.notes.cucumber.utils;

import com.codeborne.selenide.Screenshots;

import java.io.File;

/**
 * Created by Sidelnikov Mikhail on 30.07.15.
 * Util class for taking screenshots.
 */
public class ScreenShotUtil {

    /**
     * Method for taking ScreenShot. You should use {@link Screenshots} class for this.
     */
    public static void takeScreenShot() {
//        You could do something like this and save file as you want :
        File screenShotFile = Screenshots.getLastScreenshot();
        System.out.println("ScreenShot method called");

    }
}