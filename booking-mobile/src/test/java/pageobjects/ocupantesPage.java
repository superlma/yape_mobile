package pageobjects;

import commons.util;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.appium.java_client.AppiumBy;

public class ocupantesPage extends util {
    @AndroidFindBy(xpath = "//*[@resource-id=\"com.booking:id/group_config_rooms_count\"]//following-sibling::android.widget.Button[@resource-id=\"com.booking:id/bui_input_stepper_add_button\"]")protected WebElement btnMasCuartos;
    @AndroidFindBy(xpath = "//*[@resource-id=\"com.booking:id/group_config_rooms_count\"]//following-sibling::android.widget.Button[@resource-id=\"com.booking:id/bui_input_stepper_remove_button\"]")protected WebElement btnMenosCuartos;
    @AndroidFindBy(xpath = "//*[@resource-id=\"com.booking:id/group_config_rooms_count\"]//following-sibling::android.widget.TextView[@resource-id=\"com.booking:id/bui_input_stepper_value\"]")protected WebElement txtCuartos;
    @AndroidFindBy(xpath = "//*[@resource-id=\"com.booking:id/group_config_adults_count\"]//following-sibling::android.widget.Button[@resource-id=\"com.booking:id/bui_input_stepper_add_button\"]")protected WebElement btnMasAdultos;
    @AndroidFindBy(xpath = "//*[@resource-id=\"com.booking:id/group_config_adults_count\"]//following-sibling::android.widget.Button[@resource-id=\"com.booking:id/bui_input_stepper_remove_button\"]")protected WebElement btnMenosAdultos;
    @AndroidFindBy(xpath = "//*[@resource-id=\"com.booking:id/group_config_adults_count\"]//following-sibling::android.widget.TextView[@resource-id=\"com.booking:id/bui_input_stepper_value\"]")protected WebElement txtAdultos;
    @AndroidFindBy(xpath = "//*[@resource-id=\"com.booking:id/group_config_children_count\"]//following-sibling::android.widget.Button[@resource-id=\"com.booking:id/bui_input_stepper_add_button\"]")protected WebElement txtNinos;
    @AndroidFindBy(id = "android:id/button1")protected  WebElement btnOK;
    @AndroidFindBy(id = "com.booking:id/group_config_apply_button")protected WebElement btnAplicar;

    public ocupantesPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void ingresarCantidadCuartos(int valor){
        wait.until(ExpectedConditions.visibilityOf(txtCuartos));
        int cant = Integer.parseInt(txtCuartos.getText());
        if (cant<valor){
            int point = valor-cant;
            for(int i=0;i<point; i++) {
                btnMasCuartos.click();
            }
        }else {
            int point = valor-cant;
            for(int i=0;i<point; i++) {
                btnMenosCuartos.click();
            }
        }

    }

    public void ingresarCantidadAdultos(int valor){
        wait.until(ExpectedConditions.visibilityOf(txtAdultos));
        int cant = Integer.parseInt(txtAdultos.getText());
        if (cant<valor){
            int point = valor-cant;
            for(int i=0;i<point; i++) {
                btnMasAdultos.click();
            }
        }else {
            int point = valor-cant;
            for(int i=0;i<point; i++) {
                btnMenosAdultos.click();
            }
        }

    }

    public void ingresarCantidadNinos(int valor){
        wait.until(ExpectedConditions.visibilityOf(txtNinos));
        txtNinos.click();
        int edad= valor+1;
        String nino= edad + " years old";
        String scroll = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\""+nino+"\"))";
        driver.findElement(AppiumBy.androidUIAutomator(scroll));
        btnOK.click();

    }

    public void confirmarOcupantes(){
        wait.until(ExpectedConditions.elementToBeClickable(btnAplicar));
        btnAplicar.click();
    }
}
