
package modele;


import util.DepenseDejaPresenteException;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

public class RegistreDepenses {
    private ArrayList<Depense> registreDepense;

    public RegistreDepenses() {
        this.registreDepense = new ArrayList<Depense>();
    }

    public ArrayList<Depense> getRegistreDepense() {
        return registreDepense;
    }

    public void setRegistreDepense(ArrayList<Depense> registreDepense) {
        this.registreDepense = registreDepense;
    }

    public void ajouterDepense(Depense depense) {
        if(validerDoublon(depense)) {
            //throw new DepenseDejaPresenteException("Cette dépense a déjà été enregistrée", depense);
            JOptionPane.showMessageDialog(null, "Cette dépense a déjà été enregistrée", "Doublon", JOptionPane.ERROR_MESSAGE);
        } else {
            this.registreDepense.add(depense);
            System.out.println("ajouté dans la liste");
        }
    }

    private boolean validerDoublon(Depense depense) {
        for (Depense tmp: registreDepense) {
            if(tmp.equals(depense)) {
                return true;
            }
        }
        return false;
    }

    public void supprimerDerniereDepenseEnregistree(Depense depense) {
        registreDepense.remove((registreDepense.size()) - 1);
    }

    public void listerDepenses(RegistreDepenses registreDepenses) {
        for (Depense tmp: registreDepense) {
            System.out.println(tmp);
            //à définir plus précisément (juste no employé, nom et prénom)
        }
    }

}
            
