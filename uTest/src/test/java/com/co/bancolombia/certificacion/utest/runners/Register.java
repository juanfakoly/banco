package com.co.bancolombia.certificacion.utest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/register.feature",
                glue = "com.co.bancolombia.certificacion.utest.stepdefinitions",
                snippets = SnippetType.CAMELCASE)
public class Register {
}
