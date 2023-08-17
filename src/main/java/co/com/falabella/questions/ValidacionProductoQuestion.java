package co.com.falabella.questions;

import co.com.falabella.utils.Data;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static co.com.falabella.ui.DetalleProductoUI.AGREGAR;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class ValidacionProductoQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        WebElementFacade nombreProducto = AGREGAR .resolveFor(actor);
        WaitUntil.the(AGREGAR , isVisible()).forNoMoreThan(5).seconds();
        return Data.extractTo().get(0).get("Validacion").contains(nombreProducto.getText().toString());
    }



    public static Question<Boolean> from(){
        return new ValidacionProductoQuestion();
    }
}
