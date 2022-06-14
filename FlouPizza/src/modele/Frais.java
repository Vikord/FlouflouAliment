
package modele;


import java.util.Objects;

public abstract class Frais {
    
    private Employe employe;
    private String categorieFrais;
    private double montantFrais;
    private String dateFrais;
    private double montantRemboursementFrais;

    public Frais() {
    }

    public Frais(Employe employe, String categorieFrais, double montantFrais, String dateFrais, double montantRemboursementFrais) {
        this.employe = employe;
        this.categorieFrais = categorieFrais;
        this.montantFrais = montantFrais;
        this.dateFrais = dateFrais;
        this.montantRemboursementFrais = montantRemboursementFrais;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public String getCategorieFrais() {
        return categorieFrais;
    }

    public void setCategorieFrais(String categorieFrais) {
        this.categorieFrais = categorieFrais;
    }

    public double getMontantFrais() {
        return montantFrais;
    }

    public void setMontantFrais(double montantFrais) {
        this.montantFrais = montantFrais;
    }

    public String getDateFrais() {
        return dateFrais;
    }

    public void setDateFrais(String dateFrais) {
        this.dateFrais = dateFrais;
    }

    public double getMontantRemboursementFrais() {
        return montantRemboursementFrais;
    }

    public void setMontantRemboursementFrais(double montantRemboursementFrais) {
        this.montantRemboursementFrais = montantRemboursementFrais;
    }

    public double calculerRemboursementFrais() {
        double montantFrais = retournerMontantFrais();
        double allocation = retournerAllocation();

        if (montantFrais > allocation)
            return allocation;
        else {
            return montantFrais;
        }
    }

    public double retournerMontantFrais() {
        return 0;
    }

    public double retournerAllocation() {
        return 0;
    }



    @Override
    public String toString() {
        return "Depense{" + "categorie=" + categorieFrais
                + ", frais=" + montantFrais + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Frais depense = (Frais) o;
        return Double.compare(depense.montantFrais, montantFrais) == 0
                && employe.equals(depense.employe)
                && categorieFrais.equals(depense.categorieFrais)
                && dateFrais.equals(depense.dateFrais);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employe, categorieFrais, montantFrais, dateFrais);
    }
}
