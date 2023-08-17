package co.com.falabella.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static co.com.falabella.ui.AgregarCarritoUI.*;



import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarCarritoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_COOKIS),
                Click.on(BTN_AGREGAR ),
                Click.on(BTN_IRCARRITO)

        );

    }
    public static AgregarCarritoTask on(){
        return instrumented(AgregarCarritoTask.class);
    }
}
