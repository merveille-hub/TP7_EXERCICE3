package com.mervy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws MontantInvalidException, SoldeInsuffisantExeption {
        //CompteBancaire cb1 = null, cb2 = null, cb3 = null, cb4 = null;
        List<CompteBancaire> comptes = new ArrayList<CompteBancaire>(4);

        double solde;

        for (CompteBancaire compte : comptes) {
            solde = Math.random() * 201 - 50;
            try {
                compte = new CompteBancaire(solde);
            }catch (MontantInvalidException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println(comptes);


        double montant;

        for (CompteBancaire cb : comptes) {
            //generation aleatoire de montant a deposer pour chaque compte
            //Ce montant est choisit aleatoirement entre -50 et 150
            montant = Math.random() * 201.0 - 50;
            try {
                if (cb == null)
                    continue;
                cb.deposer(montant);
            }catch (MontantInvalidException e) {
                System.out.println(e.getMessage());
            }
        }

        for (CompteBancaire cb : comptes) {
            System.out.println(cb);
        }

        for (CompteBancaire cb : comptes) {
            //generation aleatoire de montant a retirer pour chaque compte
            //Ce montant est choisit aleatoirement entre -100 et 100
            montant = Math.random() * 201.0 - 100;

            try {
                if (cb == null)
                    continue;
                cb.retirer(montant);
            }
            catch (SoldeInsuffisantExeption e){
                System.out.println(e.getMessage());
            }
        }

        for (CompteBancaire cb : comptes) {
            System.out.println(cb);
        }

    }
}