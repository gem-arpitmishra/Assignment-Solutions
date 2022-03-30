import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;


public class iFrameB {
    public static void main(String[] a){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ar.mishra\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //navigating to the url
        driver.navigate().to("https://techtuts.in");
//        Thread.sleep(10000);
        //counting total number of iframes
        Integer frameCount = driver.findElements(By.tagName("iframe")).size();
        //displaying total frameCount
        System.out.println("Total Number of frames = "+frameCount);

        //looping through each frames
        for(int i =0;i<frameCount;i++){
            try{


                driver.switchTo().frame(i);
                System.out.println("switched to frame "+i);



                driver.switchTo().parentFrame();
                System.out.println("switched back to parent frame");

            }catch (NoSuchFrameException e){
                System.out.println(e.getMessage());
            }
        }
        driver.switchTo().defaultContent();
        // clicking on the frame with name google_esf
        System.out.println("\n\n\n");
        System.out.println("Frame with name google_esf");

        try{
            driver.switchTo().frame("google_esf");
            driver.findElement(By.xpath("//*[@id='google_esf']")).click();
//            driver.findElement(By.xpath("/html/iframe[@name='google_esf']")).click(); exception element not reachable
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        //for the last frame
        try{
           driver.switchTo().frame(frameCount-1);
           driver.findElement(By.xpath("/html/body/img")).click();


        }catch (Exception e){

            System.out.println(e.getMessage());
        }



    }
}
