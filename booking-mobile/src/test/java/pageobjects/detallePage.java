package pageobjects;

import commons.util;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class detallePage extends util {
    @AndroidFindBy(id = "com.booking:id/select_room_cta")protected WebElement btnSeleccionar;
    @AndroidFindBy(id = "com.booking:id/rooms_item_select_layout")protected WebElement btnPreReserva;
    @AndroidFindBy(id = "com.booking:id/recommended_block_reserve_button")protected WebElement btnReservar;

    public detallePage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void seleccionarCuarto(){
        wait.until(ExpectedConditions.elementToBeClickable(btnSeleccionar));
        btnSeleccionar.click();
    }

    public void clickPreReserva(){
        wait.until(ExpectedConditions.elementToBeClickable(btnPreReserva));
        btnPreReserva.click();
    }

    public void clickReservar(){
        wait.until(ExpectedConditions.elementToBeClickable(btnReservar));
        btnReservar.click();
    }
}
