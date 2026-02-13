package Pages;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.IOException;

import static Tests.SeleniumTests.*;

public class ProductsPages {
    //Locate Shoes Title
    public static String formalShoes_xpath = "/html/body/div[2]/center/h2";
    public static String sportsShoes_xpath = "/html/body/div[3]/center/h2";
    public static String sneakers_xpath = "/html/body/div[4]/center/h2";

    //Locate Shoes Dropdown
    public static String formalShoesdrpdown_xpath = "/html/body/div[2]/center/div/i[1]";
    public static String sportsShoesdrpdown_xpath = "/html/body/div[3]/center/div/i[1]";
    public static String sneakerdrpdown_xpath = "/html/body/div[4]/center/div/i[1]";

    //Locate first shoes name from the list
    public static String formalShoes_firstshoename = "/html/body/div[2]/table/tbody/tr[1]/td[1]";
    public static String sportsShoes_firstshoename = "/html/body/div[3]/table/tbody/tr[1]/td[1]";
    public static String sneakerShoes_firstdhoename="/html/body/div[4]/table/tbody/tr[1]/td[1]";

    public static void formal_shoes_verifyTitle() throws IOException {
    String expected_title_formalshoes= "Formal Shoes";
    String actual_title_formalshoes = driver.findElement(By.xpath("/html/body/div[2]/center/h2")).getText();
    Assert.assertEquals(expected_title_formalshoes,actual_title_formalshoes);
        if (expected_title_formalshoes.equals(actual_title_formalshoes)){
            test.log(Status.PASS, "Test Passed for title verification of Formal Shoes");
            test.log(Status.PASS,test.addScreenCaptureFromPath(capture(driver))+ "Test Passed");
        } else if (false) {
            test.fail(MediaEntityBuilder.createScreenCaptureFromBase64String("base64").build());
        }
    }

    public static void sports_shoes_verifyTitle() throws IOException {
        String expected_title_sportsshoes= "Sports Shoes";
        String actual_title_sportsshoes = driver.findElement(By.xpath("/html/body/div[3]/center/h2")).getText();
        Assert.assertEquals(expected_title_sportsshoes,actual_title_sportsshoes);
        if (expected_title_sportsshoes.equals(actual_title_sportsshoes)){
            test.log(Status.PASS, "Test Passed for title verification of Sports Shoes");
            test.log(Status.PASS,test.addScreenCaptureFromPath(capture(driver))+ "Test Passed");
        } else if (false) {
            test.fail(MediaEntityBuilder.createScreenCaptureFromBase64String("base64").build());
        }
    }

    public static void sneakers_verifyTitle() throws IOException {
        String expected_title_sneaker= "Sneakers";
        String actual_title_sneakers = driver.findElement(By.xpath("/html/body/div[4]/center/h2")).getText();
        Assert.assertEquals(expected_title_sneaker, actual_title_sneakers);
        if (expected_title_sneaker.equals(expected_title_sneaker)){
            test.log(Status.PASS, "Test Passed for title verification of Sports Shoes");
            test.log(Status.PASS,test.addScreenCaptureFromPath(capture(driver))+ "Test Passed");
        } else if (false) {
            test.fail(MediaEntityBuilder.createScreenCaptureFromBase64String("base64").build());
        }
    }

    public static void formalshoes_firstshoename_verifyTitle(){
        String  expected_title_formal_firstshoe = "   Classic Cheltenham";
        driver.findElement(By.xpath(formalShoesdrpdown_xpath)).click();
        String actual_title_formal_firstshoes = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]")).getText();
        Assert.assertEquals(expected_title_formal_firstshoe,actual_title_formal_firstshoes);
        if(expected_title_formal_firstshoe.equals(actual_title_formal_firstshoes)){
            test.log(Status.PASS, "Test Passed for first shoe name of Formal shoe i.e Classic Cheltanham");
        }

    }

    public static void sportsshoes_firstshoename_verifyTitle(){
        String expected_title_sports_firstshoe= "   Ultimate";
        driver.findElement(By.xpath(sportsShoesdrpdown_xpath)).click();
        String actual_title_sports_firstshoes = driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[1]/td[1]")).getText();
        Assert.assertEquals(expected_title_sports_firstshoe,actual_title_sports_firstshoes);
        if(expected_title_sports_firstshoe.equals(actual_title_sports_firstshoes)){
            test.log(Status.PASS, "Test Passed for first shoe name of Sports shoe i.e Ultimate");
        }

    }

    public static void sneakers_firstshoename_verifyTitle(){
        String expected_title_sneakers_firstshoe= "   Archivo";
        driver.findElement(By.xpath(sneakerdrpdown_xpath)).click();
        String actual_title_sneakers_firstshoes = driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr[1]/td[1]")).getText();
        Assert.assertEquals(expected_title_sneakers_firstshoe,actual_title_sneakers_firstshoes);
        if(expected_title_sneakers_firstshoe.equals(actual_title_sneakers_firstshoes)){
            test.log(Status.PASS, "Test Passed for first shoe name of Sports shoe i.e Archivo");
        }
    }

}
