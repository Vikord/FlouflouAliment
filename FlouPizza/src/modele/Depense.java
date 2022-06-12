
package modele;


public abstract class Depense {
    
    private String categorie;
    private int frequence;
    private String montantAlloue;
    private double frais;
    private String noFacture;
    private String date;

    public Depense() {
    }

    public Depense(String categorie, int frequence, String montantAlloue, double frais, String noFacture, String date) {
        this.categorie = categorie;
        this.frequence = frequence;
        this.montantAlloue = montantAlloue;
        this.frais = frais;
        this.noFacture = noFacture;
        this.date = date;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public int getFrequence() {
        return frequence;
    }

    public void setFrequence(int frequence) {
        this.frequence = frequence;
    }

    public String getMontantAlloue() {
        return montantAlloue;
    }

    public void setMontantAlloue(String montantAlloue) {
        this.montantAlloue = montantAlloue;
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
        return "Depense{" + "categorie=" + categorie 
                + ", frequence=" + frequence 
                + ", montantAlloue=" + montantAlloue 
                + ", frais=" + frais + ", noFacture=" 
                + noFacture + ", date=" + date + '}';
    }
    
    
    
    
    
}
