package com.prueba.tecnica.latan.ui;

import net.serenitybdd.screenplay.targets.Target;

public class PageTarget {

    public static final Target MIS_VIAJES=Target.the("Mis viajes").locatedBy("(//p[contains(text(),'Mis viajes')])[1]");
    public static final Target DONDE_LO_ENCUENTRAS=Target.the("Donde lo encuentras").locatedBy("//a[@role='button']");
    public static final Target CODIGO_RESERVA=Target.the("Codigo reserva").locatedBy("//span[@class='record-locator']");

}
