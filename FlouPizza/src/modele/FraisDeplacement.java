
package modele;

public class FraisDeplacement extends Frais {

    private String typeDeplacement;

    public FraisDeplacement() {
    }

    public FraisDeplacement(Employe employe, String categorieFrais, double montantFrais, String dateFrais, double montantRemboursementFrais, String typeDeplacement) {
        super(employe, categorieFrais, montantFrais, dateFrais, montantRemboursementFrais);
        this.typeDeplacement = typeDeplacement;
    }

    @Override
    public double retournerAllocation(Employe employe) {
        return employe.getCategorieEmploye().getMontantAlloueDeplacementTerrestre();
    }
}
