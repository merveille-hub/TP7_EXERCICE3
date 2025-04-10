package com.mervy;

public class MontantInvalidException extends Exception{
    public MontantInvalidException() {
        super("Le montant est invalide !!!");
    }

    public MontantInvalidException(String message) {
        super(message);
    }
}
