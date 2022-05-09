package day01_seleniumProje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_İlkClass {

    public static void main(String[] args) throws InterruptedException {

        /* En ilkel haliyle bir otomasyon yapmak için
        Classımıza otomasyon için gerekli olan webdriver'in yerini göstermemiz gerekir
        bunun için Java kutuphanesinden System.setProperty() methodu kullanırız.
        method 2 parametre istemektedir.
        ilki kullanacağımız driver: webdriver.chrome.driver
        ikincisi ise bu driverin fiziki yolu:
         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.trendyol.com");
        Thread.sleep(2000);
        driver.get("https://www.hepsiburada.com");
        driver.close();
    }
}
