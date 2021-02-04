package com.co.bancolombia.certificacion.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterComponents {

    public static final String OPTION = "//option[text()='{0}']";

    public static final Target SIGN_UP = Target.the("sign up button").locatedBy("[ui-sref='signup.personal']:nth-child(1)");
    public static final Target NAME = Target.the("name").located(By.id("firstName"));
    public static final Target LASTNAME = Target.the("lastname").located(By.id("lastName"));
    public static final Target EAMIL = Target.the("email").located(By.id("email"));
    public static final Target DAY = Target.the("birthday").locatedBy(OPTION);
    public static final Target MONTH = Target.the("birth month").locatedBy(OPTION);
    public static final Target YEAR = Target.the("birth year").locatedBy(OPTION);
    public static final Target NEXT = Target.the("next button").locatedBy("[aria-label='Next step - define your location']");
    public static final Target CITY = Target.the("city").located(By.id("city"));
    public static final Target ZIP = Target.the("zip").located(By.id("zip"));
    public static final Target COUNTRY = Target.the("country").locatedBy("[aria-label='Select a country']");
    public static final Target COUNTRY_INPUT = Target.the("country").locatedBy("[aria-label='Select a country'] input:first-of-type");
    public static final Target COUNTRY_SELECT = Target.the("country select").locatedBy("[ng-bind-html='country.name | highlight: $select.search']");
    public static final Target NEXT_LOCATION = Target.the("next button").locatedBy("[aria-label='Next step - select your devices']");
    public static final Target BRAND = Target.the("brand").locatedBy("[aria-label='Select Brand']");
    public static final Target BRAND_INPUT = Target.the("country").locatedBy("[aria-label='Select Brand'] input:first-of-type");
    public static final Target BRAND_SELECT = Target.the("country select").locatedBy("[ng-bind-html='device.name | highlight: $select.search']");
    public static final Target MODEL = Target.the("model").locatedBy("[aria-label='Select a Model']");
    public static final Target MODEL_INPUT = Target.the("model input").locatedBy("[aria-label='Select a Model'] input:first-of-type");
    public static final Target MODEL_SELECT = Target.the("model select").locatedBy("[ng-bind-html='model.name | highlight: $select.search']");
    public static final Target OS = Target.the("os").locatedBy("[name='handsetOSId']");
    public static final Target OS_INPUT = Target.the("os input").locatedBy("[name='handsetOSId'] input:first-of-type");
    public static final Target OS_SELECT = Target.the("os select").locatedBy("[ng-bind-html='osVersion.name | highlight: $select.search']");
    public static final Target NEXT_FINAL = Target.the("next final").locatedBy("[aria-label='Next - final step']");
    public static final Target PASSWORD = Target.the("password").located(By.id("password"));
    public static final Target PASSWORD_CONFIRM = Target.the("password confirm").located(By.id("confirmPassword"));
    public static final Target TERM_OF_USE = Target.the("term of use").located(By.id("termOfUse"));
    public static final Target PRIVACY = Target.the("privacy").located(By.id("privacySetting"));
    public static final Target COMPLETE = Target.the("complete").locatedBy("[aria-label='Complete Setup']");
    public static final Target WELCOME_MESSAGE = Target.the("welcome message").locatedBy(".image-box-header h1");

    private RegisterComponents() {}

}
