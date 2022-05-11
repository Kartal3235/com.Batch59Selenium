package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazın'a gidip nutella aratalım

        driver.get("https://www.amazon.com");
        /*
        findElement(By....locator)==> istediğimiz web elementini bize döndürür
        bizde o web elementini kullanmak için bir objeye assign ederiz
         */
       // WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        /*
        WebElement aramaKutusu=driver.findElement(By.className("nav-search-field "));
        Bu locators çalışmadı
        Locator alıken gözümüzden kaçan detaylar olabilir
        aldığımız bir locator çalışmazsa alternatif locato'lar denemeliyiz
         */

        WebElement aramaKutusu=driver.findElement(By.name("field-keywords"));

        // herhangi bir webelementine istediğimiz yazıyı yollamak istersek
        aramaKutusu.sendKeys("nutella"+ Keys.ENTER);





    }
}
