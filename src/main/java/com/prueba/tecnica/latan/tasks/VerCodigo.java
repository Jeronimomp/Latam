package com.prueba.tecnica.latan.tasks;

import com.prueba.tecnica.latan.ui.PageTarget;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class VerCodigo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
               Click.on(PageTarget.MIS_VIAJES),
               Click.on(PageTarget.DONDE_LO_ENCUENTRAS)

       );

    }

    public static VerCodigo deReserva(){
        return new VerCodigo();
    }
}
