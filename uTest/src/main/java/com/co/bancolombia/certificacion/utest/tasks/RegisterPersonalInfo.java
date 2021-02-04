package com.co.bancolombia.certificacion.utest.tasks;

import com.co.bancolombia.certificacion.utest.models.RegisterData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.time.Duration;

import static com.co.bancolombia.certificacion.utest.userinterfaces.RegisterComponents.*;

public class RegisterPersonalInfo implements Task {

    private RegisterData registerData;

    public RegisterPersonalInfo(RegisterData registerData) {
        this.registerData = registerData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SIGN_UP),
                Enter.theValue(registerData.getName()).into(NAME.waitingForNoMoreThan(Duration.ofSeconds(10))),
                Enter.theValue(registerData.getLastName()).into(LASTNAME),
                Enter.theValue(registerData.getEmail()).into(EAMIL),
                Click.on(DAY.of(registerData.getBirthday())),
                Click.on(MONTH.of(registerData.getBirthMonth())),
                Click.on(YEAR.of(registerData.getBirthYear())),
                Click.on(NEXT));
    }

    public static RegisterPersonalInfo ofUser(RegisterData registerData) {
        return Tasks.instrumented(RegisterPersonalInfo.class, registerData);
    }
}
