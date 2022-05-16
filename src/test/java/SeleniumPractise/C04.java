package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04 {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //    //// Navigate to  https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        //    //// Click on  Calculate under Micro Apps
        driver.findElement(By.xpath("//a[@id='calculatetest']")).click();
        //    ////    Type any number in the first input
        driver.findElement(By.xpath("//input[@id='number1']")).sendKeys("20");
        //    ////    Type any number in the second input
        driver.findElement(By.xpath("//input[@id='number2']")).sendKeys("30");
        //    //// Click on Calculate
        driver.findElement(By.xpath("//input[@id='calculate']")).click();
        //    //// Get the result

        //    //// Print the result
        System.out.println(driver.findElement(By.xpath("//span[@id='answer']")).getText());
    }
}
