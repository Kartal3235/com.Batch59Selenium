package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElementMethodlari {
    public static void main(String[] args) {
        /*
        1-Amazon.com'a gidip arama kutusunu locate edin
        2-Arama kutusunun tagname'inin input olduğunu test edin
        3-Arama kutusunun name attribute'nun değerinin....olduğunu test edin
         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1-Amazon.com'a gidip arama kutusunu locate edin
        driver.get("https://www.amazon.com");
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));

        //2-Arama kutusunun tagname'inin input olduğunu test edin
        String expectedTagName="input";
        String actualTagName=aramaKutusu.getTagName();

        if(expectedTagName.equals(actualTagName)){
            System.out.println("Tagname testi passed");
        }else {
            System.out.println("Tagname testi failed");
        }
        //3-Arama kutusunun name attribute'nun değerinin....olduğunu test edin

        String expectedNameDeğeri="field-keywords";
        String actualNameDeğeri=aramaKutusu.getAttribute("name");
        if(expectedNameDeğeri.equals(actualNameDeğeri)){
            System.out.println("name attribute testi passed");
        }else {
            System.out.println("name attribute testi failed");
        }
        driver.close();

        /*
        <input type="text" id="twotabsearchtextbox" value="nutella"
        name="field-keywords" autocomplete="off" placeholder=""
        class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search">

        webElementIsmi.getTagName() --> daha once locate ettigimiz bir webelemtin tagname'ni dondurur
        webElementIsmi.getAttribute(attributeIsmi) --> daha once locate ettigimiz bir webelemtin
                                                      istedigim attribute'unun degerini dondurur
         */
    }
}
