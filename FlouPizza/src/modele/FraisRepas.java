
package modele;


public class FraisRepas extends Frais {

    public FraisRepas() {
    }

    public FraisRepas(Employe employe, String categorieFrais, double montantFrais, String dateFrais, double montantRemboursementFrais) {
        super(employe, categorieFrais, montantFrais, dateFrais, montantRemboursementFrais);
    }

    @Override
    public double retournerAllocation(Employe employe) {
        return employe.getCategorieEmploye().getMontantAlloueRepas();
    }
}
