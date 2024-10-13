package org.example.presentation;

import org.example.dao.Etudiant;
import org.example.dao.EtudiantDAODictionary;
import org.example.metier.EtudiantManager;

public class Presentation {
    public static void main(String [] args){
        EtudiantDAODictionary etudiantDAO = new EtudiantDAODictionary();
        EtudiantManager etudiantManager = new EtudiantManager(etudiantDAO);

         Etudiant e1 = new Etudiant(1,"Ibtissam","Saadali","ibtissamsaadali@gmail.com");
         Etudiant e2 = new Etudiant(2,"Al","BL","albl@gmail.com");
         Etudiant e3 = new Etudiant(3,"Br","LM","brlm@gmail.com");
         Etudiant e4 = new Etudiant( 4,"Sm","Yg","smyg@gmail.com");

        etudiantManager.addEtudiant(e1);
        etudiantManager.addEtudiant(e2);
        etudiantManager.addEtudiant(e3);
        etudiantManager.addEtudiant(e4);

        System.out.println("Avant mise à jour : ");
        for (Etudiant etudiant : etudiantManager.getAllEtudiants()) {
            System.out.println(etudiant);
        }

        Etudiant etudiantModifie = new Etudiant(4, "lk", "Paul", "lkpaul@gmail.com");
        etudiantManager.updateEtudiant(etudiantModifie);

        System.out.println("Après mise à jour : ");
        for (Etudiant etudiant : etudiantManager.getAllEtudiants()) {
            System.out.println(etudiant);
        }

    }
}
