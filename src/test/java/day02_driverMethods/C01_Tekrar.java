package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Tekrar {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();//Webdriver interface olduğundan dolayı biz ondan obje oluşturmadık
                                              // onun yerine Chromedriver dan oluştruduk

        driver.get("http://www.trendyol.com");
    }
}
