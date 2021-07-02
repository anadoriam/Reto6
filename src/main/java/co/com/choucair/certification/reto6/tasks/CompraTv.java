package co.com.choucair.certification.reto6.tasks;

import co.com.choucair.certification.reto6.userinterface.CompraTvPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.sql.Driver;

public class CompraTv implements Task {

    public static CompraTv thePg() {
        return Tasks.instrumented(CompraTv.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CompraTvPage.Televisor),
                Click.on(CompraTvPage.Marca),
                Click.on(CompraTvPage.Pulgadas),
                Click.on(CompraTvPage.Resolucion),
                Click.on(CompraTvPage.Comprar)


        );


    }
}
