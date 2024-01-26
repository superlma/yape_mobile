package pageobjects;

import commons.util;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class loginPage extends util {
    @AndroidFindBy(accessibility = "Navigate up")protected WebElement btnCerrar;

    public loginPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickBotonCerrar(){
        wait.until(ExpectedConditions.elementToBeClickable(btnCerrar));
        btnCerrar.click();
    }
}
