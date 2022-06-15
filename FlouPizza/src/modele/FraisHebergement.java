
package modele ;


public class FraisHebergement extends Frais {

    public FraisHebergement() {
    }

    public FraisHebergement(Employe employe, String categorieFrais, double montantFrais, String dateFrais, double montantRemboursementFrais) {
        super(employe, categorieFrais, montantFrais, dateFrais, montantRemboursementFrais);
    }

    @Override
    public double retournerAllocation(Employe employe, boolean avion) {
        return employe.getCategorieEmploye().getMontantAlloueHebergement();
    }
}
