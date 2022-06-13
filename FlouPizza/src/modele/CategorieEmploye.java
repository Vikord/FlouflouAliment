package modele;

public class CategorieEmploye {

    private String nomCategorie;
    private int montantAlloueRepas;
    private int montantAlloueHebergement;
    private int montantAlloueDeplacementTerrestre;
    private int getMontantAlloueDeplacementAerien;

    public CategorieEmploye(String nomCategorie, int montantAlloueRepas, int montantAlloueHebergement, int montantAlloueDeplacementTerrestre, int getMontantAlloueDeplacementAerien) {
        this.nomCategorie = nomCategorie;
        this.montantAlloueRepas = montantAlloueRepas;
        this.montantAlloueHebergement = montantAlloueHebergement;
        this.montantAlloueDeplacementTerrestre = montantAlloueDeplacementTerrestre;
        this.getMontantAlloueDeplacementAerien = getMontantAlloueDeplacementAerien;
    }
}
