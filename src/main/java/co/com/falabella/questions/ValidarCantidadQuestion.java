package co.com.falabella.questions;


import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;



import static co.com.falabella.ui.DetalleProductoUI.CANTIDAD_CARRITO;


public class ValidarCantidadQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WebElementFacade nombre = CANTIDAD_CARRITO .resolveFor(actor);
        return nombre.getValue().equals("3");
    }



    public static Question<Boolean> from(){
        return new ValidarCantidadQuestion();
    }
    }

