package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobjects.*;

public class reservaDefinition {
    loginPage login;
    hospedajePage hospedaje;
    calendarioPage calendario;
    ocupantesPage ocupantes;
    busquedaPage busqueda;
    detallePage detalle;

    public reservaDefinition() {
        login = new loginPage();
        hospedaje = new hospedajePage();
        calendario = new calendarioPage();
        ocupantes = new ocupantesPage();
        busqueda = new busquedaPage();
        detalle = new detallePage();
    }

    @Given("dar click a la opción cerrar login")
    public void darClickALaOpcionCerrarLogin() {
        login.clickBotonCerrar();
    }

    @When("escribir el destino {string} del hospedaje")
    public void escribirElDestinoDelHospedaje(String valor) {
        hospedaje.escribirDestino(valor);
    }

    @And("se selecciona la fecha inicio {string}")
    public void seSeleccionaLaFechaInicio(String valor) {
        calendario.seleccionarFecha(valor);
    }

    @And("se selecciona la fecha fin {string}")
    public void seSeleccionaLaFechaFin(String valor) {
        calendario.seleccionarFecha(valor);
        calendario.confirmarFecha();
    }

    @And("se ingresa {int} cuartos")
    public void seIngresaCuartos(int valor) {
        hospedaje.ingresarOcupantes();
        ocupantes.ingresarCantidadCuartos(valor);
    }

    @And("se ingresa {int} adultos")
    public void seIngresaAdultos(int valor) {
        ocupantes.ingresarCantidadAdultos(valor);
    }

    @And("se ingresa niño de {int} años")
    public void seIngresaNino(int valor) {
        ocupantes.ingresarCantidadNinos(valor);
    }

    @And("se realiza la busqueda")
    public void seRealizaLaBusqueda() {
       ocupantes.confirmarOcupantes();
       hospedaje.clickBuscar();
    }

    @And("se selecciona la opción {string}")
    public void seSeleccionaLaOpcionDeSuPreferencia(String valor) {
        busqueda.seleccionarOpcion(valor);

    }


    @And("se realiza la reserva")
    public void seRealizaLaReserva() {
        detalle.seleccionarCuarto();
        detalle.clickReservar();
    }
}
