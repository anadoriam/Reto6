package co.com.choucair.certification.reto6.stepdefinitions;

import co.com.choucair.certification.reto6.tasks.CompraTv;
import co.com.choucair.certification.reto6.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ExitoStepdefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Ana quiere comprar un Televior marca LG en el exito$")
    public void anaQuiereComprarUnTeleviorMarcaLGEnElExito()  {
        OnStage.theActorCalled("Ana").wasAbleTo(OpenUp.thePage(), (CompraTv.thePg()));

    }

    @When("^entra en la aplicacion del grupo exito y buscamos la seccion de televisores$")
    public void entraEnLaAplicacionDelGrupoExitoYBuscamosLaSeccionDeTelevisores()  {

    }

    @Then("^seleccionamos el tv que queremos y se sube al carrito paracomprarla$")
    public void seleccionamosElTvQueQueremosYSeSubeAlCarritoParacomprarla()  {

    }

}
