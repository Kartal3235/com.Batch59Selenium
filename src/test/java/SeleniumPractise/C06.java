package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //// ...Exercise6...
        //    1.  https://id.heroku.com/login sayfasina gidin
        driver.get("https://id.heroku.com/login");
        //    2.  Bir mail adersi giriniz
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcd@hotmail.com");
        //    3.  Bir password giriniz
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        //    4.  Login butonuna tiklayiniz
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block']")).click();
        //    5.  "There was a problem with your login." texti gorunur ise
        WebElement sonucTest=driver.findElement(By.xpath("//*[text()='There was a problem with your login.']"));

        //    6.  "kayit yapilamadi" yazdiriniz
        if(sonucTest.isDisplayed()) System.out.println("kayıt yapılamadı");
        else System.out.println("kayıt yapıldı");

        //    8.  eger yazi gorunur degilse "kayit yapildi" yazdiriniz

        //    9.  Tum sayfalari kapatiniz
        driver.close();
    }
}
