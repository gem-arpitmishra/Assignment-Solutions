import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

//        1. Navigate to url: https://www.techlistic.com/p/demo-selenium-practice.html
//        2. Print the values of the table column-wise. (Google-Meta-Microsoft and so on)
//        3. Print the values of the table row-wise. (Google - Maria Anders - Germany)
//        4. Verify that Roland Mendel works in Microsoft and lives in Austria.



public class dynamic_web_table_and_waits {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://Users//ar.mishra//Downloads//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.navigate().to("https://www.techlistic.com/p/demo-selenium-practice.html");
        int row = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
        int col = driver.findElements(By.xpath("//table[@id='customers']//tr//th")).size();


        WebDriverWait wait = new WebDriverWait(driver,3);

        System.out.println("\n************************** Column Wise Output **************************");
        for(int i =1;i<=col;i++){
           for(int j = 1;j<=row;j++){
               if(j==1){
                   System.out.println("Column: "+driver.findElement(By.xpath("//table[@id='customers']//tr["+j+"]//th["+i+"]")).getText());

               } else {
                   System.out.println(driver.findElement(By.xpath("//table[@id='customers']//tr["+j+"]//td["+i+"]")).getText());
               }

           }
           System.out.println("\n");
       }

        System.out.println("\n************************** Row Wise Output **************************");
       for(int i=1;i<=row;i++){
           for(int j = 1;j<=col;j++){
               String str;
               if(i==1) {
                   System.out.print(driver.findElement(By.xpath("//table[@id='customers']//tr[" + i + "]//th[" + j + "]")).getText()+"    ");

               }else{
                   System.out.print(driver.findElement(By.xpath("//table[@id='customers']//tr[" + i + "]//td[" + j + "]")).getText()+"    ");
               }
           }
           System.out.println("\n");
       }

       for(int i = 2;i<=row;i++){
           for(int j = 1;j<=col;j++){
               if((driver.findElement(By.xpath("//table[@id='customers']//tr[" + i + "]//td[" + j + "]")).getText()).equals("Microsoft")){
                   j++;
                   if((driver.findElement(By.xpath("//table[@id='customers']//tr[" + i + "]//td[" + j + "]")).getText()).equals("Roland Mendel")){
                     j++;
                       if((driver.findElement(By.xpath("//table[@id='customers']//tr[" + i + "]//td[" + j + "]")).getText()).equals("Austria")){
                           System.out.println("************************** Verification **************************");
                           System.out.println("************************** Roland Mendel Works in Microsoft and Lives in Austria **************************");
                           break;
                       }
                   }
               }
           }
       }
    }
}
