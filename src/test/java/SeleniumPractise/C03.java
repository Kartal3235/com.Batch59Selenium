package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03 {
    //// ...Exercise3...
    //// go to url : https://www.techlistic.com/p/selenium-practice-form.html
    ////fill the firstname
    ////fill the firstname
    ////check the gender
    ////check the experience
    ////fill the date
    ////choose your profession -> Automation Tester
    ////choose your tool -> Selenium Webdriver
    ////choose your continent -> Antartica
    ////choose your command  -> Browser Commands
    ////click submit button
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //// go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        driver.manage().deleteAllCookies();
        driver.findElement(By.xpath("//a[@id ='cookieChoiceDismiss']")).click(); //cerezleri kabul ettim..
        ////fill the firstname
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("firstname");
        ////fill the firstname
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("koramaz");
        ////check the gender
        driver.findElement(By.xpath("//input[@id='sex-0']")).click();
        ////check the experience
        driver.findElement(By.xpath("//input[@id='exp-2']")).click();
        ////fill the date
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("14.05.2022");
        ////choose your profession -> Automation Tester
        driver.findElement(By.xpath("//input[@id='profession-1']")).click();
        ////choose your tool -> Selenium Webdriver
        driver.findElement(By.xpath("//input[@id='tool-2']")).click();
        //////choose your continent -> Antartica
        driver.findElement(By.xpath("//option[.='Antartica']")).click();
        ////choose your command  -> Browser Commands
        driver.findElement(By.xpath("//option[text()='Browser Commands']")).click();
        ////click submit button
        driver.findElement(By.xpath("//button[text()='Button']")).click();


    }
}
