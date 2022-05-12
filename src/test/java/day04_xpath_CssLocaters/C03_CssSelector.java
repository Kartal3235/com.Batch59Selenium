package day04_xpath_CssLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_CssSelector {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1 ) Bir class oluşturun : Locators_css
        //2 ) Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //    a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in,
        driver.get("http://a.testaddressbook.com/sign_in");
        //    b. Locate email textbox
        //WebElement emailTextBox=driver.findElement(By.xpath("//input[@id='session_email']"));
        WebElement emailTextBox=driver.findElement(By.cssSelector("#session_email"));
        //    c. Locate password textbox ve
       //WebElement passwordTextBox=driver.findElement(By.xpath("//input[@id='session_password']"));
        WebElement passwordTextBox=driver.findElement(By.cssSelector("#session_password"));
        //    d. Locate signin button
        //WebElement sigInButton=driver.findElement(By.xpath("//input[@data-disable-with='Sign in']"));
        WebElement sigInButton=driver.findElement(By.cssSelector("input[value='Sign in']"));
        //    e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        //        i. Username : testtechproed@gmail.com
        //        ii. Password : Test1234!

        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        sigInButton.click();
        driver.close();

    }
}
