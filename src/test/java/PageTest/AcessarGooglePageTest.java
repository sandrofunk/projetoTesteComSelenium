package PageTest;

import Page.AcessarGooglePage;
import com.aventstack.extentreports.Status;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class AcessarGooglePageTest {

    public WebDriver driver;
    public AcessarGooglePage acessarGooglePage;

    @BeforeClass
    public void checkCurrentOS() {

        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver.exe");
        }
    }

    @BeforeMethod
    public void testCaseSetup() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        this.driver.get("https://www.google.com.br");
        this.driver.manage().window().maximize();

        System.out.println("A página acessada é: " + driver.getCurrentUrl());

    }

    @Test(priority = 1)
    public void acessandoGoogle() {

        acessarGooglePage = new AcessarGooglePage(driver);
        acessarGooglePage.escrita(acessarGooglePage.pesquisaGoogle, "Isso é um teste");

    }

}
