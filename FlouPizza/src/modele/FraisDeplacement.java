
package modele;

public class FraisDeplacement extends Frais {

    private String typeDeplacement;

    public FraisDeplacement() {
    }

    public FraisDeplacement(Employe employe, String categorieFrais, double montantFrais, String dateFrais, double montantRemboursementFrais, String typeDeplacement) {
        super(employe, categorieFrais, montantFrais, dateFrais, montantRemboursementFrais);
        this.typeDeplacement = typeDeplacement;
    }

    public String getTypeDeplacement() {
        return typeDeplacement;
    }

    public void setTypeDeplacement(String typeDeplacement) {
        this.typeDeplacement = typeDeplacement;
    }

    @Override
    public double retournerAllocation(Employe employe, boolean avion) {
        if(avion)
            return employe.getCategorieEmploye().getGetMontantAlloueDeplacementAerien();
        else
            return employe.getCategorieEmploye().getMontantAlloueDeplacementTerrestre();
    }
}
