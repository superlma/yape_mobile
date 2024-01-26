package pageobjects;

import commons.util;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class hospedajePage extends util {
    @AndroidFindBy(id = "com.booking:id/facet_search_box_accommodation_destination")protected WebElement txtDestino;
    @AndroidFindBy(id = "com.booking:id/facet_with_bui_free_search_booking_header_toolbar_content")protected WebElement txtCampo;
    @AndroidFindBy(id = "com.booking:id/view_disambiguation_destination_title")protected WebElement btnOpcion;
    @AndroidFindBy(id = "com.booking:id/facet_search_box_accommodation_dates")protected WebElement txtFecha;
    @AndroidFindBy(id = "com.booking:id/facet_search_box_accommodation_occupancy")protected WebElement txtocupantes;
    @AndroidFindBy(id = "com.booking:id/facet_search_box_cta")protected WebElement btnBuscar;

    public hospedajePage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void escribirDestino(String valor){
        wait.until(ExpectedConditions.visibilityOf(txtDestino));
        txtDestino.click();
        wait.until(ExpectedConditions.visibilityOf(txtCampo));
        txtCampo.sendKeys(valor);
        wait.until(ExpectedConditions.visibilityOf(btnOpcion));
        btnOpcion.click();
    }

    public void ingresarOcupantes(){
        wait.until(ExpectedConditions.visibilityOf(txtocupantes));
        txtocupantes.click();
    }

    public void clickBuscar(){
        wait.until(ExpectedConditions.elementToBeClickable(btnBuscar));
        btnBuscar.click();
    }

}
