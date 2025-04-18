package com.mervy;

public class CompteBancaire {
    private double solde;

    public CompteBancaire(double solde) throws MontantInvalidException {
        if (solde < 0)
            throw new MontantInvalidException();
        this.solde = solde;
        System.out.println("Compte Initialisé avec un solde de: " + solde);
    }

    public CompteBancaire() throws MontantInvalidException {
        new CompteBancaire(0);
        //System.out.println("Compte Initialisé avec un solde de: " + solde);
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void deposer(double montant) throws MontantInvalidException {
        System.out.println("***********************DEPOSER MONTANT************************");
        System.out.println("Deposer " + montant + "DH dans votre compte");
        if (montant < 0)
            throw new MontantInvalidException();
        else {
            solde += montant;
            System.out.println("Solde: " + solde);
        }
    }

    public void retirer(double montant) throws SoldeInsuffisantExeption, MontantInvalidException {
        System.out.println("**********************RETIRER MONTANT***********************");
        System.out.println("Retirer " + montant + "DH de votre compte");
        if (solde < montant)
            throw new SoldeInsuffisantExeption();
        else if (montant < 0) {
            throw new MontantInvalidException();
        } else {
            solde -= montant;
            System.out.println("Solde: " + solde);
        }
    }

    public String toString() {
        return "Compte Bancaire <Solde: " + solde + ">";
    }
}
