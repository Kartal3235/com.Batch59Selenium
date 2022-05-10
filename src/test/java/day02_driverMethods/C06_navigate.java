package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_navigate {
    public static void main(String[] args) throws InterruptedException {

        /*
        Eğer testimiz sırasımda birden fazla sayfa arasında ileri geri hareket edeceksek
        driver.get() yerine driver.navigate.to() methodu nu kullanırız
        ve sonrasında forward(),back() veya refresh() method'larını kullanabiliriz
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);

        // Amazona geri dönelim
        driver.navigate().back();
        Thread.sleep(2000);

        // yeniden facebok'a gidelim
        driver.navigate().forward();
        Thread.sleep(2000);

        // sayfayı refresh yapalım
        driver.navigate().refresh();
        Thread.sleep(2000);

        // sayfayı kapatalım
        driver.close();
    }
}
