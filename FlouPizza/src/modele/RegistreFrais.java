
package modele;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
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

    private boolean validerDoublon(Frais frais) {
        for (Frais tmp: registreFrais) {
            if(tmp.equals(frais)) {
                return true;
            }
        }
        return false;
    }

    public void supprimerDerniereDepenseEnregistree() {
        registreFrais.remove((registreFrais.size()) - 1);
    }

    public String listerFraisPourFichier() {
        StringBuilder sb = new StringBuilder();
        for (Frais tmp: this.registreFrais) {
            sb.append(tmp.getEmploye().getEmpId() + " - "
            + tmp.getEmploye().getNom() + " "
            + tmp.getEmploye().getPrenom() + ", "
            + tmp.getEmploye().getCategorieEmploye().getNomCategorie() + ": "
            + tmp.getDateFrais() + " "
            + tmp.getCategorieFrais() + " "
            + tmp.getMontantFrais() + "$ → "
            + tmp.getMontantRemboursementFrais() + "$");
            if(tmp instanceof FraisDeplacement)
                sb.append(((FraisDeplacement) tmp).getTypeDeplacement());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void listerFraisPourUI(JTable tblAffichage) {
        DefaultTableModel model = (DefaultTableModel) tblAffichage.getModel();
        model.setRowCount(0);

        for (Frais tmp: this.registreFrais) {
            model.addRow(new Object[] {tmp.getEmploye().getEmpId(),
                                       tmp.getEmploye().getNom(),
                                       tmp.getEmploye().getPrenom(),
                                       tmp.getEmploye().getCategorieEmploye().getNomCategorie(),
                                       tmp.getDateFrais(),
                                       tmp.getCategorieFrais(),
                                       tmp.getMontantFrais(),
                                       tmp.getMontantRemboursementFrais()});
        }
    }
}
            
