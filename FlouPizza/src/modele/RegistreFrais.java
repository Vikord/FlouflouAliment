
package modele;


import javax.swing.*;
import java.util.ArrayList;

public class RegistreFrais {
    private ArrayList<Frais> registreFrais;

    public RegistreFrais() {
        this.registreFrais = new ArrayList<Frais>();
    }

    public ArrayList<Frais> getRegistreFrais() {
        return registreFrais;
    }

    public void setRegistreFrais(ArrayList<Frais> registreFrais) {
        this.registreFrais = registreFrais;
    }

    public void ajouterFrais(Frais frais) {
        if(validerDoublon(frais)) {
            //throw new DepenseDejaPresenteException("Cette dépense a déjà été enregistrée", depense);
            JOptionPane.showMessageDialog(null, "Cette dépense a déjà été enregistrée", "Doublon", JOptionPane.ERROR_MESSAGE);
        } else {
            this.registreFrais.add(frais);

            //System.out.println("ajouté dans la liste");
        }
    }

    private boolean validerDoublon(Frais depense) {
        for (Frais tmp: registreFrais) {
            if(tmp.equals(depense)) {
                return true;
            }
        }
        return false;
    }

    public void supprimerDerniereDepenseEnregistree(Frais depense) {
        registreFrais.remove((registreFrais.size()) - 1);
    }

    public void listerFrais() {
        for (Frais tmp: this.registreFrais) {
            System.out.println(tmp);
            //à définir plus précisément
            // Employe employe (Id, nom, prenom, catégorie de l'employé), String categorieFrais, double montantFrais, String dateFrais, double montantRemboursementFrais)
        }
    }
}
            
