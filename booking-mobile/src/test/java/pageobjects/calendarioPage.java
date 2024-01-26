package pageobjects;

import commons.util;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class calendarioPage extends util {

    @AndroidFindBy(id = "com.booking:id/calendar_week_days")protected WebElement calendar;
    @AndroidFindBy(id = "com.booking:id/facet_date_picker_confirm")protected  WebElement btnConfirmar;

    public calendarioPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void seleccionarFecha(String valor){
        wait.until(ExpectedConditions.visibilityOf(calendar));
        driver.findElement(By.xpath("//android.view.View[@content-desc='"+valor+"']")).click();
    }

    public void confirmarFecha(){
        wait.until(ExpectedConditions.elementToBeClickable(btnConfirmar));
        btnConfirmar.click();
    }
}
