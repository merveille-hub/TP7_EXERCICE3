package com.mervy;

public class SoldeInsuffisantExeption extends Exception {
    public SoldeInsuffisantExeption() {
        super("Le solde est insuffisant !!!");
    }

    public SoldeInsuffisantExeption(String message) {
        super(message);
    }
}
