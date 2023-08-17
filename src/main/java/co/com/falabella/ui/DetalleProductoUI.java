package co.com.falabella.ui;

import net.serenitybdd.screenplay.targets.Target;

public class DetalleProductoUI {


    public static  Target AGREGAR = Target.the("agrega").locatedBy("//a[@class='chakra-link css-qpfo7l']");

    public static Target CANTIDAD_CARRITO = Target.the("cantidad en el carrito")
            .locatedBy("//input[@class='chakra-input css-1k2vvg6']");



}
