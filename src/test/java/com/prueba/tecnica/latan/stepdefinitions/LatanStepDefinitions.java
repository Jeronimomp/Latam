package com.prueba.tecnica.latan.stepdefinitions;

import com.prueba.tecnica.latan.questions.Validar;
import com.prueba.tecnica.latan.tasks.VerCodigo;
import com.prueba.tecnica.latan.utils.HisDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

public class LatanStepDefinitions {
    Actor pasajero=null;
@Before
    public void setUP(){
         pasajero =Actor.named("pasajero LATAM");
        pasajero.can(BrowseTheWeb.with(HisDriver.chromeDriver()));
    }



    @Given("^me encuentro en la pagina web de LATAM  Colombia$")
    public void meEncuentroEnLaPaginaWebDeLATAMColombia() {
      pasajero.wasAbleTo(
              Open.url("https://www.latam.com/es_co/")
      );
    }

    @When("^entro a mis viajes y busco el codigo de reserva$")
    public void entroAMisViajesYBuscoElCodigoDeReserva() {
 pasajero.attemptsTo(
         VerCodigo.deReserva()
 );
    }

    @Then("^se ve que el codigo tiene (.*) digitos$")
    public void seVeQueElCodigoTieneDigitos(int numero) {
    pasajero.should(GivenWhenThen.seeThat(Validar.codigo(), Matchers.equalTo(numero)));


    }
}
