package com.mervy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws MontantInvalidException, SoldeInsuffisantExeption{
        //Creer un compte avec 0DH
        CompteBancaire cb = new CompteBancaire();
        /*try{
            cb = new CompteBancaire();
        }catch(MontantInvalidException e){
            System.out.println(e.getMessage());
        }*/

        int solde;
        //Deposer un montant
        try {
            solde = (int)(Math.random() * 201 -50);
            cb.deposer(solde);
        } catch (MontantInvalidException e) {
            System.out.println(e.getMessage());
        }

        //Retirer un montant
        try {
            solde = (int)(Math.random() * 201 -50);
            cb.retirer(solde);
        } catch (SoldeInsuffisantExeption e) {
            System.out.println(e.getMessage());
        }



        //CompteBancaire cb1 = null, cb2 = null, cb3 = null, cb4 = null;
        /*List<CompteBancaire> comptes = new ArrayList<CompteBancaire>(4);

        double solde;

        for (CompteBancaire compte : comptes) {
            solde = Math.random() * 201 - 50;
            System.out.println("Solde: " + solde);
            try {
                compte = new CompteBancaire(solde);
                System.out.println(compte);
                System.out.println("Solde: " + solde);
            }catch (MontantInvalidException e) {
                System.out.println(e.getMessage());
            }
        }*/


        /*CompteBancaire cb1 = null, cb2 = null, cb3 = null, cb4 = null;
        List<CompteBancaire> list = new ArrayList<>();

        try {
            cb1 = new CompteBancaire();
            cb2 = new CompteBancaire(50);
            cb3 = new CompteBancaire(-50);
            cb4 = new CompteBancaire();
        }catch (MontantInvalidException e) {
            System.out.println(e.getMessage());
        }

        list.add(cb1);
        list.add(cb2);
        list.add(cb3);
        list.add(cb4);

        for (CompteBancaire compte : list) {
            System.out.println(compte);
        }



        *//*for (CompteBancaire compte : comptes) {
            System.out.println(compte);
        }*//*
        double montant;
        for (CompteBancaire cb : list) {
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

        for (CompteBancaire cb : list) {
            System.out.println(cb);
        }

        for (CompteBancaire cb : list) {
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

        for (CompteBancaire cb : list) {
            System.out.println(cb);
        }*/

    }
}