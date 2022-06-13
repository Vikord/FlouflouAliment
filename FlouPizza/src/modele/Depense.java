
package modele;


import java.util.Objects;

public abstract class Depense {
    
    private Employe employe;
    private String categorieDepense;
    private int frequence;
    private double frais;
    private String noFacture;
    private String date;
    protected int montantMaximumAlloue;

    public Depense() {
    }

    public Depense(Employe employe, String categorieDepense, int frequence, double frais, String noFacture, String date) {
        this.employe = employe;
        this.categorieDepense = categorieDepense;
        this.frequence = frequence;
        this.frais = frais;
        this.noFacture = noFacture;
        this.date = date;
    }

    public Employe getEmploye() {
        return employe;
    }

    public String getCategorieDepense() {
        return categorieDepense;
    }

    public void setCategorieDepense(String categorieDepense) {
        this.categorieDepense = categorieDepense;
    }

    public int getFrequence() {
        return frequence;
    }

    public void setFrequence(int frequence) {
        this.frequence = frequence;
    }


    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public double getFrais() {
        return frais;
    }

    public void setFrais(double frais) {
        this.frais = frais;
    }

    public String getNoFacture() {
        return noFacture;
    }

    public void setNoFacture(String noFacture) {
        this.noFacture = noFacture;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Depense{" + "categorie=" + categorieDepense
                + ", frequence=" + frequence
                + ", frais=" + frais + ", noFacture=" 
                + noFacture + ", date=" + date + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Depense depense = (Depense) o;
        return frequence == depense.frequence
                && Double.compare(depense.frais, frais) == 0
                && employe.equals(depense.employe)
                && categorieDepense.equals(depense.categorieDepense)
                && noFacture.equals(depense.noFacture)
                && date.equals(depense.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employe, categorieDepense, frequence, frais, noFacture, date);
    }
}
