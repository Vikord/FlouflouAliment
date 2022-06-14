
package modele;


public class Representant extends Employe {

    private String secteur;
        
public Representant(String empId, String nom, String prenom, String adresse, String courriel, String categorieRepresentant, String secteur, CategorieEmploye categorieEmploye) {
    super(empId, nom, prenom, adresse, courriel, categorieEmploye);
    this.secteur = secteur;
    }

}
