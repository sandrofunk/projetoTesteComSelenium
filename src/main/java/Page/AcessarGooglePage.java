package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AcessarGooglePage {

    WebDriver driver;

    @FindBy (xpath = "//input[@name='q']")
    public WebElement pesquisaGoogle;

    public AcessarGooglePage(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver, this);

    }

    public AcessarGooglePage escrita(WebElement element, String value) {
        String elementId = element.getAttribute("xpath");

        WebDriverWait wait = new WebDriverWait(this.driver, 50);
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(value);

        System.out.println(String.format("'%s", value, elementId));

        return this;

    }

}
