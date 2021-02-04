package com.co.bancolombia.certificacion.utest.questions;

import com.co.bancolombia.certificacion.utest.userinterfaces.RegisterComponents;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheRegisterWas implements Question<Boolean> {

    public static final String WELCOME = "Welcome to the world's largest community of freelance software testers!";

    @Override
    public Boolean answeredBy(Actor actor) {
        return RegisterComponents.WELCOME_MESSAGE.resolveFor(actor).getText().equals(WELCOME);
    }

    public static TheRegisterWas successful() {
        return new TheRegisterWas();
    }
}
