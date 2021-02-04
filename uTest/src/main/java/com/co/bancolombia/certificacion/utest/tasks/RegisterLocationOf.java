package com.co.bancolombia.certificacion.utest.tasks;

import com.co.bancolombia.certificacion.utest.models.RegisterLocation;
import com.co.bancolombia.certificacion.utest.userinterfaces.RegisterComponents;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.time.Duration;

import static com.co.bancolombia.certificacion.utest.userinterfaces.RegisterComponents.*;

public class RegisterLocationOf implements Task {

    private RegisterLocation registerLocation;

    public RegisterLocationOf(RegisterLocation registerLocation) {
        this.registerLocation = registerLocation;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(registerLocation.getCity())
                .into(CITY.waitingForNoMoreThan(Duration.ofSeconds(10))),
                Enter.theValue(registerLocation.getZip()).into(ZIP),
                Click.on(COUNTRY),
                Enter.theValue(registerLocation.getCountry())
                        .into(COUNTRY_INPUT.waitingForNoMoreThan(Duration.ofSeconds(10))),
                Click.on(COUNTRY_SELECT),
                Click.on(NEXT_LOCATION)
        );
    }

    public static RegisterLocationOf user(RegisterLocation registerLocation) {
        return Tasks.instrumented(RegisterLocationOf.class, registerLocation);
    }
}
