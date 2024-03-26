/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package b;

import java.util.*;

import com.google.common.base.Strings;

public class App {
    List<Usuario> usuarios= new ArrayList<>();
    List<Habitacion> habitaciones= new ArrayList<>();

    public App() {
        this.usuarios =  new ArrayList<>();
        this.habitaciones =  new ArrayList<>();
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
    

    public void registrar_usuario(String nombre, String correo, int id) {
        /* for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == (id)) {
                return;
            }
        }
        */
        Usuario usuarionuevo = new Usuario(nombre, correo, id);
        usuarios.add(usuarionuevo);

    }
    public void eliminar_usuario(String nombre, String correo, int id) {
        
        Usuario usuarionuevo = new Usuario(nombre, correo, id);
        usuarios.remove(usuarionuevo);

    }
    
    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }
    

    public void añadir_habitacion(String tipus,int preu,int id) {

        Habitacion nuevaHabitacion = new Habitacion(tipus,preu, id);
        habitaciones.add(nuevaHabitacion);

    }
    public void eliminar_habitacion(String tipus,int preu,int id) {
        
        Habitacion nuevaHabitacion = new Habitacion(tipus,preu, id);
        habitaciones.remove(nuevaHabitacion);
    }
    public List<Habitacion> listar_habitacion() {
        return habitaciones;
                // for(int i=0;i<habitaciones.size();i++){
                //    // return habitaciones.get(i);
                //     return habitaciones;
                // }        
        
    }
    


    
    

}