import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.ArrayList;
import java.util.List;


//Assignment 1 -
//
//        1.Launch https://codepen.io/abdulmlik/pen/dJOJov
//
//        2.Select date 05-05-2005 from the dropdown and validate the same.
//
//        3. Fetch the year from the dropdown and validate the year is in Ascending Order.



public class dropdown1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ar.mishra\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://codepen.io/abdulmalik/pen/dJOJov");
        driver.switchTo().frame("result");

        Select drpYear = new Select(driver.findElement(By.id("year")));
        int YearSize =  drpYear.getOptions().size();
        drpYear.selectByValue("2005");
        Select drpMonth = new Select(driver.findElement(By.id("month")));
        drpMonth.selectByValue("5");
        Select drpDay = new Select(driver.findElement(By.id("day")));
        drpDay.selectByValue("5");
        System.out.printf("Selected Date is: %s-%s-%s %n",drpDay.getFirstSelectedOption().getText(),drpMonth.getFirstSelectedOption().getText(),drpYear.getFirstSelectedOption().getText());

        List <Integer> yearArray = new ArrayList<Integer>(YearSize);
        for (int i = 1; i <= 5 ; i++) {
            drpYear.selectByIndex(i);
            String str = drpYear.getFirstSelectedOption().getText();
            yearArray.add(Integer.parseInt(str));
        }
        boolean isAscending = true;
        int i;
        for ( i = 0; i < 4; i++) {
            if(yearArray.get(i)>yearArray.get(i+1))
                isAscending = false;
        }

        if (isAscending){
            System.out.println("Years are in Ascending Order");
        }else{
            System.out.println("Years are not in Ascending Order");
        }

    }
}
