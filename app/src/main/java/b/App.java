/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package b;
import java.util.*;

import com.google.common.base.Strings;


public class App {
    public static boolean registrar_usuario(String nombre, String correo, int id) {
        List<Usuario> usuarios = new ArrayList<>();
        for(int i=0;i<usuarios.size();i++){
            if(usuarios.get(i).getId()==(id)){
                return false;
            } 
        }
    
        Usuario newUser = new Usuario(nombre, correo,id);
        usuarios.add(newUser);
        return true;
    }

    public static boolean eliminar_usuario(String nombre,String correo, int id){
        List<Usuario> usuarios = new ArrayList<>();
        for (int i=0;i<usuarios.size();i++){
            if(usuarios.get(i).getId()==(id)){
                usuarios.remove(usuarios.get(i).getId());
                return true;
            }
        }
       return false;
    }
}