package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodları {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();// maximize();browserı tam sayfa yapıyor.

        driver.get("https://www.amazon.com");
        System.out.println("actual title: "+driver.getTitle());
        System.out.println("actual url: "+driver.getCurrentUrl());
        driver.close();
    }
}
