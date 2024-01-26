package pageobjects;

import commons.util;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class busquedaPage extends util {

    @AndroidFindBy(id = "com.booking:id/toolbar_item_icon")protected WebElement label;

    public busquedaPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void validarpantalla(){
        wait.until(ExpectedConditions.visibilityOf(label));
        label.isDisplayed();
    }

    public void seleccionarOpcion(String valor){
        //android.widget.TextView[@text="Palacio del Inka, a Luxury Collection Hotel, Cusco"]
        String scroll = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\""+valor+"\"))";
        driver.findElement(AppiumBy.androidUIAutomator(scroll)).click();
    }
}
