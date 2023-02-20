package Page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Optional;

public class AcessarGooglePage {

    WebDriver driver;

    @FindBy ( xpath = "//input[@name='q']" )
    public WebElement escreverGoogle;

    @FindBy ( xpath= "//input[@name='q']" )
    public WebElement pesquisarGoogle;

    @FindBy ( xpath= "//a[contains(text(),'Imagens')]" )
    public WebElement pesquisarImagemGoogle;

    public AcessarGooglePage(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver, this);

    }

    public AcessarGooglePage escrever (WebElement element, String value) {
        String elementId = element.getAttribute("xpath");

        WebDriverWait wait = new WebDriverWait(this.driver, 50);
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(value);

        System.out.println(String.format("[%s]", value, elementId));

        return this;

    }

    public AcessarGooglePage clicar (WebElement element) {

        String elementId = element.getAttribute("xpath");

        WebDriverWait wait = new WebDriverWait(this.driver, 50);
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(Keys.ENTER);

        System.out.println(String.format("[%s]", elementId));

        return this;
    }



}
