package com.co.bancolombia.certificacion.utest.exceptions;

public class ErrorRegister extends AssertionError {

    public static final String ERROR_REGISTER = "The register fail";

    public ErrorRegister(String messages, Throwable cause) {
        super(messages, cause);
    }
}
