import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;


//1. Launch https://chercher.tech/practice/practice-pop-ups-selenium-webdriver
//        2. Click on Alert and accept it
//        3. Click on confirmation box and get the text and cancel it
//        4. Click on prompt and enter text and accept it
//        5. Upload any sample file
//        6. Double click on Double click me and get the text from alert
//        7. Move mouse to Sub menu and click on it
//        8. Press tab key and select google and click on it


public class popup_event_alert {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/ar.mishra/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        /*
        Xpaths for all the alerts
        //input[@name='alert']
        //input[@name='confirmation']
        //input[@name = 'prompt']
         */
        driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

        //finding alert and handling it
        driver.findElement(By.xpath("//input[@name='alert']")).click();
        Alert alert = driver.switchTo().alert();
        String alertMessage = alert.getText();
        System.out.println("Counter the alert having message: "+alertMessage);
        Thread.sleep(2000);
        alert.accept();

        //finding confirmation box and handling it
        //accepting
        driver.findElement(By.xpath("//input[@name ='confirmation']")).click();
        Alert confirmation_ok = driver.switchTo().alert();
        String confirmationBoxMessage = confirmation_ok.getText();
        Thread.sleep(2000);
        confirmation_ok.accept();
        System.out.println("Confirmation popup message: "+confirmationBoxMessage+" Accepted");


        //dismissing
        driver.findElement(By.xpath("//input[@name ='confirmation']")).click();
        Alert confirmation_cancel = driver.switchTo().alert();
        Thread.sleep(2000);
        confirmation_cancel.dismiss();
        System.out.println("Confirmation popup message: "+confirmationBoxMessage+" Rejected");


        driver.findElement(By.xpath("//input[@name='prompt']")).click();
        Alert prompt_accepted = driver.switchTo().alert();
        String keysForPrompt = "Hey prompt!";
        prompt_accepted.sendKeys("hello");
        String promptMessage = prompt_accepted.getText();
        Thread.sleep(2000);
        prompt_accepted.accept();
        System.out.println("prompt with text "+promptMessage+" got handled with keys: "+keysForPrompt );

        //Upload a sample file
        WebElement uploadElem = driver.findElement(By.xpath("//input[@name = 'upload']"));
        uploadElem.sendKeys("C://Users/ar.mishra/Desktop/sample.txt");


       // for double click
        Actions doubleClickAct = new Actions(driver);
        WebElement doubleClickElem = driver.findElement(By.xpath("//input[@id= 'double-click']"));
        doubleClickAct.doubleClick(doubleClickElem).perform();
        Alert doubleClickAlert = driver.switchTo().alert();
        Thread.sleep(1000);
        System.out.println("Double click alert is having text : "+ doubleClickAlert.getText());
        doubleClickAlert.accept();

        //for hover and google opening
        Actions hoverOver = new Actions(driver);
        WebElement hoverOverElem = driver.findElement(By.xpath("//button[@id='sub-menu']"));
        hoverOver.moveToElement(hoverOverElem);
        hoverOver.click().perform();
        WebElement googleLink = driver.findElement(By.xpath("//a[@id='link2']"));
        googleLink.click();
        Thread.sleep(2000);
        driver.close();


    }
}
