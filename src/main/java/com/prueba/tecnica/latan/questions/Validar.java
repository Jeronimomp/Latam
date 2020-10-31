package com.prueba.tecnica.latan.questions;

import com.prueba.tecnica.latan.ui.PageTarget;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Validar implements Question<Integer> {
    @Override
    public Integer answeredBy(Actor actor) {
        int codigo= PageTarget.CODIGO_RESERVA.resolveFor(actor).getText().length()-1;
        System.out.println(codigo);
        return  codigo;
    }

    public static Validar codigo(){

        return new Validar();
    }
}
