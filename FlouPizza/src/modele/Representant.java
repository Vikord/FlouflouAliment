
package modele;


public class Representant extends Employe {

    private String secteur;

    public Representant() {
    }

    public Representant(String empId, String nom, String prenom, String adresse, String courriel, CategorieEmploye categorieEmploye, String secteur) {
        super(empId, nom, prenom, adresse, courriel, categorieEmploye);
        this.secteur = secteur;
    }

    public String getSecteur() {
        return secteur;
    }

    public void setSecteur(String secteur) {
        this.secteur = secteur;
    }
}
