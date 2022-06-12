
package modele;


import java.util.HashMap;



public class RegistreDepenses{
    private HashMap<String,Employe> registre;

    public RegistreDepenses(HashMap<String, Employe> registre) {
        this.registre = registre;
    }

    public HashMap<String, Employe> getRegistre() {
        return registre;
    }

    public void setRegistre(HashMap<String, Employe> registre) {
        this.registre = registre;
    }
      
}
            
