package com.co.bancolombia.certificacion.utest.tasks;

import com.co.bancolombia.certificacion.utest.models.RegisterDevices;
import static com.co.bancolombia.certificacion.utest.userinterfaces.RegisterComponents.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.time.Duration;

public class RegisterDevicesOf implements Task {

    private RegisterDevices registerDevices;

    public RegisterDevicesOf(RegisterDevices registerDevices) {
        this.registerDevices = registerDevices;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BRAND.waitingForNoMoreThan(Duration.ofSeconds(10))),
                Enter.theValue(registerDevices.getBrand()).into(BRAND_INPUT.waitingForNoMoreThan(Duration.ofSeconds(10))),
                Click.on(BRAND_SELECT),
                Click.on(MODEL),
                Enter.theValue(registerDevices.getDevices()).into(MODEL_INPUT),
                Click.on(MODEL_SELECT),
                Click.on(OS),
                Enter.theValue(registerDevices.getOs()).into(OS_INPUT),
                Click.on(OS_SELECT),
                Click.on(NEXT_FINAL)
        );
    }

    public static RegisterDevicesOf user(RegisterDevices registerDevices) {
        return Tasks.instrumented(RegisterDevicesOf.class, registerDevices);
    }
}
