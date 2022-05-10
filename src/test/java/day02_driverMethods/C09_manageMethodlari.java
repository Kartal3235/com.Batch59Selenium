package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_manageMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //implicitlyWait==> açılana kadar bekleme süresi

        driver.get("https://amazon.com");

        /*
        ileride wait konusunu daha genis olarak ele alacagiz
        bir sayfa acilirken ilk basta sayfanin icerisinde bulunan elementlere gore bir yuklenme
        suresine ihtiyac vardir

        veya bir webElementinin kullanılabilmesi için zamana ihtiyaç olabilir
        **-implicitlywait-** bize sayfanın yuklenmesi ve sayfadaki elementlere ulaşım için beklenecek
        MAXİMUM süreyi belirleme olanagı tanır.

         */
        Thread.sleep(15000);
        driver.close();
    }
}
