
package io;

import modele.CategorieEmploye;
import modele.Employe;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Archive {
    public static ArrayList<Employe> lecture(String fichier, HashMap<String, CategorieEmploye> categories) throws FileNotFoundException, IOException, ParseException {

        Object objet = new JSONParser().parse(new FileReader(fichier));
        JSONObject jso = (JSONObject) objet;
        org.json.simple.JSONArray representants = (JSONArray) jso.get("representants");

        ArrayList<Employe> listeRepresentants = new ArrayList<Employe>();

        for (int i = 0; i < representants.size(); i++) {
            Object objetjs = representants.get(i);
            String empId = (String) ((JSONObject) objetjs).get("EmpId");
            String nom = (String) ((JSONObject) objetjs).get("Nom");
            String prenom = (String) ((JSONObject) objetjs).get("Prenom");
            String cleCategorie = (String) ((JSONObject) objetjs).get("Categorie");

            listeRepresentants.add(new Employe(empId, nom, prenom, categories.get(cleCategorie)));
        }

        return listeRepresentants;
    }



//    public static class ecriture {
//
//        public ecriture() {
//        }



}
