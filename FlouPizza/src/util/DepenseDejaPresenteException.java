package util;

import modele.Depense;

public class DepenseDejaPresenteException extends Exception {

    private Depense depense;

    public DepenseDejaPresenteException(String message, Depense depense) {
        super(message);
        this.depense = depense;
    }

    public Depense getDepense() {
        return depense;
    }

    public void setDepense(Depense depense) {
        this.depense = depense;
    }

    @Override
    public String toString() {
        return "DepenseDejaPresenteException{" +
                "depense=" + depense +
                '}';
    }
}
