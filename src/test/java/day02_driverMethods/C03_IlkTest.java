package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTest {
    public static void main(String[] args) {

        /*
        1-https://www.amazon.com url'ine gidin
        2-Baslığın Amazon kelimesi içerdiğini test edin
        3-Url'nin "https://www.amazon.com" a esit olduğunu test edin
        4-Sayfayı kapatın.
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //1-https://www.amazon.com url'ine gidin
        driver.get("https://www.amazon.com");

        //2-Baslığın Amazon kelimesi içerdiğini test edin
        String actualTitle=driver.getTitle();
        String arananKelime="Amazon";
        if(actualTitle.contains(arananKelime)){
            System.out.println("Title testi PASSED");
        }else {
            System.out.println("Title"+arananKelime+"'yi içermiyor,title testi FAİLED");
        }
        //3-Url'nin "https://www.amazon.com" a esit olduğunu test edin
        String actualUrl =driver.getCurrentUrl();
        String expectedUrl ="https://www.amazon.com/";
        if(actualUrl.contains("expectedUrl")){
            System.out.println("Url testi PASSED");
        }else{
            System.out.println("Url testi FAİLED");
        }
    }
}
