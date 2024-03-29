/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package b;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test 
    void Test_registrar_usuario(){
        App classUnderTest = new App();
        List<Usuario> usuarios = classUnderTest.getUsuarios(); // vacia
        classUnderTest.registrar_usuario("marta","marta@gmail.com", 1); // añadimos un usuario
        List<Usuario> usuarios2 = classUnderTest.getUsuarios(); // la lista tiene un usuario
        usuarios.add(new Usuario("marta","marta@gmail.com", 1)); // lo añadimos a la lista anterior
        
        assertArrayEquals(usuarios.toArray(), usuarios2.toArray());  // comparamos
    }
    @Test 
    void Test_eliminar_usuario(){
        App classUnderTest = new App();
        List<Usuario> usuarios = classUnderTest.getUsuarios(); // vacia
        classUnderTest.eliminar_usuario("marta", "marta@gmail.com", 1);
        List<Usuario> usuarios2 = classUnderTest.getUsuarios(); // la lista tiene un usuario
        usuarios.remove(new Usuario("marta","marta@gmail.com", 1)); // lo añadimos a la lista anterior
        
        assertArrayEquals(usuarios.toArray(), usuarios2.toArray());  // comparamos
    }
    @Test 
    void Test_registrar_habitaciones(){
        App classUnderTest = new App();
        List<Habitacion> habitaciones = classUnderTest.getHabitaciones(); // vacia
        classUnderTest.añadir_habitacion("media",30, 1); // añadimos un usuario
        List<Habitacion> habitaciones2 = classUnderTest.getHabitaciones(); // la lista tiene un usuario
        habitaciones.add(new Habitacion("media",30, 1)); // lo añadimos a la lista anterior
        
        assertArrayEquals(habitaciones.toArray(), habitaciones2.toArray());  // comparamos
    }
    @Test 
    void Test_eliminar_habitaciones(){
        App classUnderTest = new App();
        List<Habitacion> habitaciones = classUnderTest.getHabitaciones(); // vacia
        classUnderTest.eliminar_habitacion("media",30, 1); // añadimos un usuario
        List<Habitacion> habitaciones2 = classUnderTest.getHabitaciones(); // la lista tiene un usuario
        habitaciones.remove(new Habitacion("media",30, 1)); // lo añadimos a la lista anterior
        
        assertArrayEquals(habitaciones.toArray(), habitaciones2.toArray());  // comparamos
    }
    @Test 
    void Test_listar_habitaciones(){
        App classUnderTest = new App();
        List<Habitacion> habitaciones = classUnderTest.getHabitaciones(); // vacia
        classUnderTest.eliminar_habitacion("media",30, 1); // añadimos un usuario
        List<Habitacion> habitaciones2 = classUnderTest.getHabitaciones(); // la lista tiene un usuario
        habitaciones.remove(new Habitacion("media",30, 1)); // lo añadimos a la lista anterior
        
        assertArrayEquals(habitaciones.toArray(), habitaciones2.toArray());  // comparamos
    }
    
    


}
