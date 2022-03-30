//Assignment 1 selenium
/*
following code snippet is for opening amazon.com
•	Click on search --> Type books --> and click on search icon
•	verify books
•	get the name of first book after search
 */


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;





public class TestChrome {

    public static  void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ar.mishra\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://amazon.in");
        WebElement element = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        element.sendKeys("books");
        WebElement button = driver.findElement(By.xpath("//*[@id='nav-search-submit-button']"));
        button.click();
        System.out.print("Name of the first book:  ");
        WebElement books = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        System.out.println(books.getText());


    }
}
