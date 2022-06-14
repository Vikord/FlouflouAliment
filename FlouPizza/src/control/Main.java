/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package control;



import io.Archive;
import modele.CategorieEmploye;
import modele.Employe;
import modele.Representant;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import util.Utilitaire;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FenSaisie().setVisible(true);
//            }
//        });
//    }

        HashMap<String, CategorieEmploye> categories = new HashMap<>();

        CategorieEmploye catJunior = new CategorieEmploye("junior", 25, 1200, 50, 0);
        CategorieEmploye catSenior = new CategorieEmploye("senior", 40, 1600, 80, 0);
        CategorieEmploye catSuper = new CategorieEmploye("super", 60, 3000, 150, 2000);

        categories.put("junior", catJunior);
        categories.put("senior", catSenior);
        categories.put("super", catSuper);

        //lecture du fichier json "representants!
        try {
            Object ob = new JSONParser().parse(new FileReader("c:/temp/representants.json"));
            JSONObject test = (JSONObject) ob;
            org.json.simple.JSONArray rep = (JSONArray) test.get("representants");

            ArrayList<Employe> listeRepresentants = new ArrayList<Employe>();

            for (int i = 0; i < rep.size(); i++) {
                Object plop = rep.get(i);
                String empId = (String)((JSONObject) plop).get("EmpId");
                String nom = (String)((JSONObject) plop).get("Nom");
                String prenom = (String)((JSONObject) plop).get("Prenom");
                String cleCategorie = (String)((JSONObject) plop).get("Categorie");

                listeRepresentants.add(new Employe(empId, nom, prenom, categories.get(cleCategorie)));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }



    //Ecriture
    //Archive.ecriture("../files/depensesRepresentants.txt");

 //   }


    }
}
