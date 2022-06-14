package modele;

public class CategorieEmploye {

    private String nomCategorie;
    private int montantAlloueRepas;
    private int montantAlloueHebergement;
    private int montantAlloueDeplacementTerrestre;
    private int montantAlloueDeplacementAerien;

    public CategorieEmploye(String nomCategorie, int montantAlloueRepas, int montantAlloueHebergement, int montantAlloueDeplacementTerrestre, int montantAlloueDeplacementAerien) {
        this.nomCategorie = nomCategorie;
        this.montantAlloueRepas = montantAlloueRepas;
        this.montantAlloueHebergement = montantAlloueHebergement;
        this.montantAlloueDeplacementTerrestre = montantAlloueDeplacementTerrestre;
        this.montantAlloueDeplacementAerien = montantAlloueDeplacementAerien;
    }

    public String getNomCategorie() {
        return nomCategorie;
    }

    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }

    public int getMontantAlloueRepas() {
        return montantAlloueRepas;
    }

    public void setMontantAlloueRepas(int montantAlloueRepas) {
        this.montantAlloueRepas = montantAlloueRepas;
    }

    public int getMontantAlloueHebergement() {
        return montantAlloueHebergement;
    }

    public void setMontantAlloueHebergement(int montantAlloueHebergement) {
        this.montantAlloueHebergement = montantAlloueHebergement;
    }

    public int getMontantAlloueDeplacementTerrestre() {
        return montantAlloueDeplacementTerrestre;
    }

    public void setMontantAlloueDeplacementTerrestre(int montantAlloueDeplacementTerrestre) {
        this.montantAlloueDeplacementTerrestre = montantAlloueDeplacementTerrestre;
    }

    public int getGetMontantAlloueDeplacementAerien() {
        return montantAlloueDeplacementAerien;
    }

    public void setMontantAlloueDeplacementAerien(int montantAlloueDeplacementAerien) {
        this.montantAlloueDeplacementAerien = montantAlloueDeplacementAerien;
    }

    @Override
    public String toString() {
        return "CategorieEmploye{" +
                "nomCategorie='" + nomCategorie + '\'' +
                '}';
    }
}
