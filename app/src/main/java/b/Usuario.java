package b;

public class Usuario {
   
   
    private int id;
    private String nombre;
    private String correo;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() { 
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Usuario(String nombre,String correo,int id){
        this.id=id;
        this.nombre=nombre;
        this.correo=correo;
    }
    

        
}
