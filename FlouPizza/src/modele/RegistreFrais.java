
package modele;


import javax.swing.*;
import java.util.ArrayList;

public class RegistreFrais {
    private ArrayList<Frais> registreDepense;

    public RegistreFrais() {
        this.registreDepense = new ArrayList<Frais>();
    }

    public ArrayList<Frais> getRegistreDepense() {
        return registreDepense;
    }

    public void setRegistreDepense(ArrayList<Frais> registreDepense) {
        this.registreDepense = registreDepense;
    }

    public void ajouterDepense(Frais depense) {
        if(validerDoublon(depense)) {
            //throw new DepenseDejaPresenteException("Cette dépense a déjà été enregistrée", depense);
            JOptionPane.showMessageDialog(null, "Cette dépense a déjà été enregistrée", "Doublon", JOptionPane.ERROR_MESSAGE);
        } else {
            this.registreDepense.add(depense);
            //DISTINGUER REPAS HEBERGEMENT DEPLACEMENT??? IF FRAIS = FRAISREPAS
            //System.out.println("ajouté dans la liste");
        }
    }

    private boolean validerDoublon(Frais depense) {
        for (Frais tmp: registreDepense) {
            if(tmp.equals(depense)) {
                return true;
            }
        }
        return false;
    }

    public void supprimerDerniereDepenseEnregistree(Frais depense) {
        registreDepense.remove((registreDepense.size()) - 1);
    }

    public void listerDepenses(RegistreFrais registreDepenses) {
        for (Frais tmp: registreDepense) {
            System.out.println(tmp);
            //à définir plus précisément
            // Employe employe (Id, nom, prenom, catégorie de l'employé), String categorieFrais, double montantFrais, String dateFrais, double montantRemboursementFrais)
        }
    }
}
            
