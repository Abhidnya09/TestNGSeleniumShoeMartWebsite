package Tests;

import Pages.HomePage;
import Pages.ProductsPages;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


public class SeleniumTests {
    public static WebDriver driver;
    static ExtentReports report;
    public static ExtentTest test;
    public static ExtentReports extent = new ExtentReports();



    @BeforeSuite
    public static void SetUp(){
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
        extent.attachReporter(spark);
        HomePage.click_hamburger_menu();
        HomePage.click_orderProducts_link();
    }

    public static String capture(WebDriver driver) throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File Dest = new File("src/../ExecImages/" + System.currentTimeMillis()
                + ".png");
        String errflpath = Dest.getAbsolutePath();
        FileUtils.copyFile(scrFile, Dest);
        return errflpath;
    }

    @Test
    void validates_Title_of_Online_Products() throws IOException {
        test = extent.createTest("Validates Shoes title on Product Page","This test validates that the different shotypes are correct on Online Products Page");
        ProductsPages.formal_shoes_verifyTitle();
        ProductsPages.sports_shoes_verifyTitle();
        ProductsPages.sneakers_verifyTitle();
        extent.flush();
    }

    @Test
    void validates_FirstFormal_shoes(){
        test = extent.createTest("Validate First Formal Shoename","This test validates first formal shoes on Products page");
        ProductsPages.formalshoes_firstshoename_verifyTitle();
        System.out.println("Name validated");
    }

    @Test
    void validates_FirstSports_shoes(){
        test = extent.createTest("Validate First Sports Shoename","This test validates first sports shoes on Products page");
        ProductsPages.sportsshoes_firstshoename_verifyTitle();
        System.out.println("Name validated");
    }

    @Test
    void validates_FirstSneakers_shoes(){
        test = extent.createTest("Validate First Sneakers Shoename","This test validates first sneakers shoes on Products page");
        ProductsPages.sneakers_firstshoename_verifyTitle();
        System.out.println("Name validated");
    }

    @AfterSuite
    public static void cleanup()
    {

        extent.flush();
    }
}
