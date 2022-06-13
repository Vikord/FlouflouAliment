
package modele;


public class FraisRepas extends Frais {

    public FraisRepas(Employe employe, String categorieFrais, double montantFrais, String dateFrais, double montantRemboursementFrais) {
        super(employe, categorieFrais, montantFrais, dateFrais, montantRemboursementFrais);
    }

    @Override
    public double retournerMontantFrais() {
        return super.retournerMontantFrais();
    }

    @Override
    public double retournerRemboursementDisponible() {
        return super.retournerRemboursementDisponible();
    }
}
