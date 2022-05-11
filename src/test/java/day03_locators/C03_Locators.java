package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_Locators {
    public static void main(String[] args) {

        /*
        Main method oluşturun ve aşağıdaki görevi tamamlayın.
    a. http://a.testaddressbook.com adresine gidiniz.
    b. Sign in butonuna basin
    c. email textbox,password textbox, and signin button elementlerini locate ediniz..
    d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        i. Username : testtechproed@gmail.com
        ii. Password : Test1234!
    e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
    f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
    3. Sayfada kac tane link oldugunu bulun.
         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       // a. https://a.testaddressbook.com adresine gidiniz.
        driver.get("//a.testaddressbook.com");
        //b. Sign in butonuna basin
        WebElement signInLinki=driver.findElement(By.linkText("Sign in"));
        //c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTextBox=driver.findElement(By.id("session_email "));
        WebElement passwordTextBox=driver.findElement(By.id("session[password]"));
        WebElement signInButonu=driver.findElement(By.name("commit"));
        //d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //        i. Username : testtechproed@gmail.com
        //        ii. Password : Test1234!
        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signInButonu.click();

        //e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement actualKullaniciAdiElementi=driver.findElement(By.className("navbar-text"));
        System.out.println(actualKullaniciAdiElementi);
        String expectedUserMail="testtechproed@gmail.com";

        if (expectedUserMail.equals(actualKullaniciAdiElementi)){
            System.out.println("Expectred kullanıcı testi PASSED");
        }   else {
            System.out.println("Expected kullanıcı testi FAİLED");
        }

        // bir webelementin üzerinde ne yazdığını görmek istersek WebElementIsmi.gettext() kullanırız


        //f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).

        WebElement adresses=driver.findElement(By.linkText("Addresses"));
        WebElement signOutElementi=driver.findElement(By.linkText("Sign out"));
        if (adresses.isDisplayed()){
            System.out.println("adresses testi PASSED");
        }else {
            System.out.println("adresses testi FAİLED");
        }
        //3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> linklerListesi=driver.findElements(By.tagName("a"));
        System.out.println("sayfada link sayısı: "+linklerListesi.size());

        //Linleri yazdıralım.
        //Listenmiz webwlwmntlerden oluştuğu için, direk yazdırırsak refaransları yazdırır
        //onun yerine for-each loop yapıp her bir link webelementinin üzerindeki yazıyı yazdrmalıyız
        for (WebElement each:linklerListesi
             ) {
            System.out.println(each.getText());
        }
        driver.close();
    }
}
