import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.List;



//Assignment 2 -
//
//        1. Download the "Assignment.html" file attached in the mail.
//
//        2. Launch the file.
//
//        2. Read the table and find the unique rows from the table.





public class table1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ar.mishra\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "C:\\Users\\ar.mishra\\Downloads\\Assignment.html";
        driver.get(baseUrl);
        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
        Integer rowNum = rows.size();
        List<WebElement> cols = driver.findElements(By.xpath("//table/tbody/tr[2]/td"));
        Integer colNum = cols.size();
        System.out.println(rowNum + "  " + colNum);

        List<String> rowNo = new ArrayList<>();
        List<String> name = new ArrayList<>();
        List<String> age = new ArrayList<>();

        for (int row = 2; row <= rowNum; row++) {
            for (int col = 1; col <= colNum; col++) {
//                System.out.println(driver.findElement(By.xpath("//table/tbody/tr["+(row)+"]/td["+(col)+"]")).getText()+ "  ");
                if (!rowNo.contains(driver.findElement(By.xpath("//table/tbody/tr[" + (row) + "]/td[" + (1) + "]")).getText())) {
                    rowNo.add(driver.findElement(By.xpath("//table/tbody/tr[" + (row) + "]/td[" + (1) + "]")).getText());
                }
                if(!name.contains(driver.findElement(By.xpath("//table/tbody/tr[" + (row) + "]/td[" + (2) + "]")).getText())){
                    name.add(driver.findElement(By.xpath("//table/tbody/tr[" + (row) + "]/td[" + (2) + "]")).getText());
                }
                if(!age.contains(driver.findElement(By.xpath("//table/tbody/tr[" + (row) + "]/td[" + (3) + "]")).getText())){
                    age.add(driver.findElement(By.xpath("//table/tbody/tr[" + (row) + "]/td[" + (3) + "]")).getText());
                }
            }
        }

//        int i = rowNo.size();
//        int j =
            int i,j,k;
        System.out.println("Unique Rows are:  ");
        for(i = 0,j=0,k=0;i<rowNo.size() && j<name.size() && k< age.size(); i++,j++,k++){
            System.out.println(rowNo.get(i)+" "+name.get(j)+" "+age.get(k));
        }


    }
}
