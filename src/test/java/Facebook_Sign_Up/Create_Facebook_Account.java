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
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys("Gulcan");
        driver.findElement(By.name("lastname")).sendKeys("Ozturk");
        driver.findElement(By.name("reg_email__")).sendKeys("gulcangokhan02@gmail.com");

        driver.findElement(By.name("reg_passwd__")).sendKeys("Delete1990!");
        driver.findElement(By.name("birthday_month")).sendKeys("July");
        driver.findElement(By.name("birthday_day")).sendKeys("20");
        driver.findElement(By.name("birthday_year")).sendKeys("1992");
        driver.findElement(By.className("_58mt")).click();
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(8000);

        driver.quit();
    }
}
