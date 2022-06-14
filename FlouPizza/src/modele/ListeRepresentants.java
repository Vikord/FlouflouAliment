package modele;

import javax.swing.*;
import java.util.ArrayList;

public class ListeRepresentants {

    private ArrayList<Representant> listeRepresentants;

    public ListeRepresentants() {
        this.listeRepresentants = new ArrayList<Representant>();
    }

    public void ajouterRepresentant(Representant representant) {
        this.listeRepresentants.add(representant);
    }

    public Employe rechercherEmployeParId(String empId)
    {
        for (int i = 0; i < this.listeRepresentants.size() ; i++) {
            if(listeRepresentants.get(i).getEmpId().equals(empId))
                return listeRepresentants.get(i);
        }
        return null;
    }
}
