package util;

import modele.Frais;

public class DepenseDejaPresenteException extends Exception {

    private Frais depense;

    public DepenseDejaPresenteException(String message, Frais depense) {
        super(message);
        this.depense = depense;
    }

    public Frais getDepense() {
        return depense;
    }

    public void setDepense(Frais depense) {
        this.depense = depense;
    }

    @Override
    public String toString() {
        return "DepenseDejaPresenteException{" +
                "depense=" + depense +
                '}';
    }
}
