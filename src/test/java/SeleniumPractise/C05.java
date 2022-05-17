package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // ...Exercise5...
        // Navigate to website  https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        // Under the  ORIGINAL CONTENTS
        // click on Alerts
        driver.findElement(By.xpath("//*[text()='Alert']")).click();
        // print the URL
         String sonPrınt=driver.getCurrentUrl();
        System.out.println(sonPrınt);
        // navigate back
        driver.navigate().back();
        // print the URL
        String sonUrl=driver.getCurrentUrl();
        System.out.println(sonUrl);
        // Click on Basic Ajax
        driver.findElement(By.xpath("//*[text()='Basic Ajax']")).click();
        // print the URL
        String basıcAjaxUrl=driver.getCurrentUrl();
        System.out.println(basıcAjaxUrl);
        // enter value-> 20 and Enter
        driver.findElement(By.xpath("//input[@id='lteq30']")).sendKeys("20"+ Keys.ENTER);
        // and then verify Submitted Values is displayed open page


        // close driver

    }
}
