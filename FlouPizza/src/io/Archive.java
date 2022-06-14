
package io;

import modele.CategorieEmploye;
import modele.Employe;
import modele.ListeRepresentants;
import modele.Representant;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Archive {
    public static ListeRepresentants lecture(String fichier, HashMap<String, CategorieEmploye> categories) throws FileNotFoundException, IOException, ParseException {

        Object objet = new JSONParser().parse(new FileReader(fichier));
        JSONObject jso = (JSONObject) objet;
        org.json.simple.JSONArray representants = (JSONArray) jso.get("representants");

        ListeRepresentants listeRepresentants = new ListeRepresentants();

        for (int i = 0; i < representants.size(); i++) {
            Object objetjs = representants.get(i);
            String empId = (String) ((JSONObject) objetjs).get("EmpId");
            String nom = (String) ((JSONObject) objetjs).get("Nom");
            String prenom = (String) ((JSONObject) objetjs).get("Prenom");
            String adresse = (String) ((JSONObject) objetjs).get("Adresse");
            String courriel = (String) ((JSONObject) objetjs).get("Courriel");
            String cleCategorie = (String) ((JSONObject) objetjs).get("Categorie");
            String secteur = (String) ((JSONObject) objetjs).get("Secteur");

            listeRepresentants.ajouterRepresentant(new Representant(empId, nom, prenom, adresse, courriel, categories.get(cleCategorie), secteur));
        }
        return listeRepresentants;
    }



//    public static class ecriture {
//
//        public ecriture() {
//        }



}
