
package modele;

public class Transport extends Depense{
    
    private String type;

    public Transport() {
    }
    
    public Transport(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Transport{" + "type=" + type + '}';
    }
    
    
}
