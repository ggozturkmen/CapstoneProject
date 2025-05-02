package Facebook_Sign_Up;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;
import java.io.File;

/*
goto fb.com
send your name and last name
send your email and password
click on Sign up
 */
public class Create_Facebook_Account {
    public static void main(String[] args) throws InterruptedException {
        // Create chromeDriver instance to open new browser
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
//    open the facebook homepage
        driver.get("https://www.facebook.com");
        //click create new account. I located the create new account link by its text and clicked on it
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(10000);
        //Fill out the form fields like first name, last name,  email, password, and birthday
        //by finding each element using their names.
        driver.findElement(By.name("firstname")).sendKeys("Gulcan");
        driver.findElement(By.name("lastname")).sendKeys("Ozturk");
        driver.findElement(By.name("reg_email__")).sendKeys("gulcangokhan02@gmail.com");

        driver.findElement(By.name("reg_passwd__")).sendKeys("Delete1990!");
        driver.findElement(By.name("birthday_month")).sendKeys("July");
        driver.findElement(By.name("birthday_day")).sendKeys("20");
        driver.findElement(By.name("birthday_year")).sendKeys("1992");
        //select the gender and click on signup botton.
        driver.findElement(By.className("_58mt")).click();
        driver.findElement(By.name("websubmit")).click();
        //added waits to give the page enough time to load between actions.
        Thread.sleep(8000);

        driver.quit();
    }
}
