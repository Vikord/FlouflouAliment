/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package control;

import io.Archive;
import modele.CategorieEmploye;
import util.Utilitaire;

import java.util.HashMap;
import ui.FenSaisie;

public class Main {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenSaisie().setVisible(true);
            }
        });
    }

    //Lecture
//    String representants = Archive.lecture("D:\\Gaëlle\\FormationAnalysteProgrammeur\\Etape2_A07_ProgrammationComposants\\projet_session\\FlouflouAliments\\FlouPizza\\src\\files\\representants.json");
//        System.out.println(representants);


    //Ecriture
    //Archive.ecriture("../files/depensesRepresentants.txt");

    }
//    HashMap<String, CategorieEmploye> categories = new HashMap<>();
//
//    CategorieEmploye catJunior = new CategorieEmploye("junior", 25, 1200, 50, 0);
//    CategorieEmploye catSenior = new CategorieEmploye("senior", 40, 1600, 80, 0);
//    CategorieEmploye catSuper = new CategorieEmploye("super", 60, 3000, 150, 2000);
//
//    categories.put("junior", catJunior);
//    categories.put("senior", catSenior);
//    categories.put("super", catSuper);
//
//    }
//}
