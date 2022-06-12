
package modele;


public class Representant extends Employe{
    private String categorie;
    private String Secteur;
        
public Representant() {
    }

    public Representant(String categorie, String Secteur) {
        this.categorie = categorie;
        this.Secteur = Secteur;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getSecteur() {
        return Secteur;
    }

    public void setSecteur(String Secteur) {
        this.Secteur = Secteur;
    }

    @Override
    public String toString() {
        return "Representant{" + "categorie=" + categorie + ", Secteur=" + Secteur + '}';
    }

    
    
}
