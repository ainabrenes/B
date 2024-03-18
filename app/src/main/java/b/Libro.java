package b;

public class Libro {
    private int id;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String titol;
    private String autor;

    public String getTitol() {
        return this.titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Libro(String titol,String autor,int id){
        this.autor=autor;
        this.titol=titol;
        this.id=id;
    }

    
}
