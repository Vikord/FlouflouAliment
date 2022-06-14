/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package control;

import io.Archive;
import modele.*;
import org.json.simple.parser.*;
import ui.FenSaisie;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenSaisie().setVisible(true);
            }
        });

        HashMap<String, CategorieEmploye> categories = new HashMap<>();

        CategorieEmploye catJunior = new CategorieEmploye("junior", 25, 1200, 50, 0);
        CategorieEmploye catSenior = new CategorieEmploye("senior", 40, 1600, 80, 0);
        CategorieEmploye catSuper = new CategorieEmploye("super", 60, 3000, 150, 2000);

        categories.put("junior", catJunior);
        categories.put("senior", catSenior);
        categories.put("super", catSuper);

        ListeRepresentants listeRepresentants = new ListeRepresentants();

        try {
            listeRepresentants = Archive.lecture("c:/temp/representants.json", categories); //gérer exceptions
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (ParseException e3) {
            e3.printStackTrace();
        }


        String empId = "7";
        double testMontant = 200;
        String date = "2022-06-10";

        Employe testEmploye = listeRepresentants.rechercherEmployeParId(empId);
        System.out.println(testEmploye);

        Frais testFrais = new FraisRepas();
        double montantRemboursement = testFrais.calculerRemboursementFrais(testEmploye, testMontant);
        System.out.println(montantRemboursement);

        RegistreFrais testRegistreFrais = new RegistreFrais();
        testRegistreFrais.ajouterFrais(new FraisRepas(testEmploye, "repas", testMontant, date, montantRemboursement));

        testRegistreFrais.listerFrais();






        //Ecriture
    //Archive.ecriture("../files/depensesRepresentants.txt");

 //   }


    }
}
