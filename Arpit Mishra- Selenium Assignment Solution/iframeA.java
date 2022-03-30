/*
Selenium assigment 2
17/2/2022
QUESTION A. - Code
1.Launch website: www.geminisolutions.com on different browsers - chrome, firefox, internet explorer.
2.Validate if website has launched successfully on all browsers.
3.Compare times taken on different browsers for the above activity and display in ascending order.
5.Validate titles displayed on differet browsers are correct.


*/

import com.google.common.base.Stopwatch;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;




public class iframeA {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\ar.mishra\\Downloads\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","C:\\Users\\ar.mishra\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
        System.setProperty("webdriver.ie.driver","C:\\Users\\ar.mishra\\Downloads\\IEDriverServer_x64_2.48.0\\IEDriverServer.exe");
//        System.setProperty("webdriver.edge.driver"," C:\\Users\\ar.mishra\\Downloads\\edgedriver_win64\\EdgeDriver.exe");


        long start = System.nanoTime();
        WebDriver ff_driver = new FirefoxDriver();
        ff_driver.navigate().to("https://geminisolutions.com");
        long end = System.nanoTime();
        long total_ff_time = end-start;


        long start_c = System.nanoTime();
        WebDriver c_driver = new ChromeDriver();
        c_driver.navigate().to("https://geminisolutions.com");
        long end_c = System.nanoTime();
        long total_c_time = end-start;


        long start_ie = System.nanoTime();
        WebDriver ie_driver = new  InternetExplorerDriver();
        ie_driver.navigate().to("https://geminisolutions.com/");
        long end_ie = System.nanoTime();
        long total_ie_time = (end-start);
        //validation url
        System.out.println(ff_driver.getCurrentUrl());
        System.out.println(c_driver.getCurrentUrl());
        System.out.println(ie_driver.getCurrentUrl());

        //validating page title
        System.out.println(ff_driver.getTitle());
        System.out.println(c_driver.getTitle());
        System.out.println(ie_driver.getTitle());



        System.out.println("Time Taken in Chrome: "+total_c_time+" nS.");
        System.out.println("Time Taken in Chrome: "+total_ff_time+" nS.");
        System.out.println("Time Taken in IE: "+total_ie_time+" nS.");

    }
}
