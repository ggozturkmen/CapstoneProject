package Chrome_Get_Facebook_Title;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Get_Facebook_Title {
    public static void main(String[] args) throws InterruptedException {
// instance of chromeDriver
        WebDriver driver =new ChromeDriver();

//        Step1 : open the Chrome browser
//        Step2 : navigate to url of Facebook
        driver.get("https://www.facebook.com/");

//        Step3 : maximize the window
        driver.manage().window().maximize();


//        Step4: get the title of the webpage
        String title = driver.getTitle();
        System.out.println("The title of the Facebook webpage is "+title);

        Thread.sleep(1000);



        driver.quit();

    }
}
