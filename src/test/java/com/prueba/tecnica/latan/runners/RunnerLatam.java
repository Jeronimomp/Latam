package com.prueba.tecnica.latan.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/pruebaFeature.feature",
        glue="com.prueba.tecnica.latan.stepdefinitions",
        snippets= SnippetType.CAMELCASE //, tags="@Post,@Put"  //, dryRun = true/
)
public class RunnerLatam {
}
