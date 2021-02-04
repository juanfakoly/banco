package com.co.bancolombia.certificacion.utest.tasks;

import com.co.bancolombia.certificacion.utest.models.RegisterDevices;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.time.Duration;

import static com.co.bancolombia.certificacion.utest.userinterfaces.RegisterComponents.*;

public class SetTerms implements Task {

    private RegisterDevices registerDevices;

    public SetTerms(RegisterDevices registerDevices) {
        this.registerDevices = registerDevices;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(registerDevices.getPassword())
                .into(PASSWORD.waitingForNoMoreThan(Duration.ofSeconds(10))),
                Enter.theValue(registerDevices.getPassword()).into(PASSWORD_CONFIRM),
                Click.on(TERM_OF_USE),
                Click.on(PRIVACY),
                Click.on(COMPLETE)
        );
    }

    public static SetTerms ofUse(RegisterDevices registerDevices) {
        return Tasks.instrumented(SetTerms.class, registerDevices);
    }
}
