package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AcessarGooglePage {

    WebDriver driver;

    public AcessarGooglePage(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver, this);

    }

}
