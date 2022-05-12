package day04_xpath_CssLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_AmazonSearch {
    public static void main(String[] args) {
        /*
       Main method oluşturun ve aşağıdaki görevi tamamlayın.

         */
    System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //a.Amazon web sayfasına gidin. https://www. amazon.com/
        driver.get("https://www.amazon.com/");
        //       b. Search(ara) “city bike”
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike"+ Keys.ENTER);

        //       c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> istenenElementListesi=driver.findElements(By.className("sg-col-inner"));
        WebElement sonucYazısıElementi=istenenElementListesi.get(0);
        System.out.println(sonucYazısıElementi.getText());

        //       e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        List<WebElement>urunResimleriList=driver.findElements(By.className("s-image"));
        WebElement ilkurunResmi=urunResimleriList.get(6);
        ilkurunResmi.click();

    }
}
