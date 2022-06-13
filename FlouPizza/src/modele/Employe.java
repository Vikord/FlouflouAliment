
package modele;

public class Employe {
    
    private int empId;
    private String nom;
    private String prenom;
    private String adresse;
    private String courriel;

    public Employe() {
    }

    public Employe(int empId, String nom, String prenom, String adresse, String courriel) {
        this.empId = empId;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.courriel = courriel;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCourriel() {
        return courriel;
    }

    public void setCourriel(String courriel) {
        this.courriel = courriel;
    }

    @Override
    public String toString() {
        return "Employes{" + "empId=" 
                + empId + ", nom=" 
                + nom + ", prenom=" 
                + prenom + ", adresse=" 
                + adresse + ", courriel=" 
                + courriel + '}';
    }
    
    
    
}
