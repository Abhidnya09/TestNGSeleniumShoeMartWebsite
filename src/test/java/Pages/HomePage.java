package Pages;

import org.openqa.selenium.By;


import static Tests.SeleniumTests.driver;


public class HomePage {
    //Locate the Hamburger icon and Online Products Link
    public static String hamburger_menu_xpath = "//*[@id=\"menuToggle\"]/input";
    public static String onlineProducts_link_xpath = "//*[@id=\"menu\"]/a[3]/li";

    //Click the hamburger icon
    public static void click_hamburger_menu(){
        driver.findElement(By.xpath(hamburger_menu_xpath)).click();
    }

    //Click the order Products link
    public static void click_orderProducts_link() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(onlineProducts_link_xpath)).click();
    }

}