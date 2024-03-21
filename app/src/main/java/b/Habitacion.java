package b;

public class Habitacion {
    private int id;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String tipus;
    private int preu;

    public String getTipus() {
        return this.tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public int getPreu() {
        return this.preu;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }

    public Habitacion(String tipus,int preu,int id){
        this.preu=preu;
        this.tipus=tipus;
        this.id=id;
    }

    
}
