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
    /*@Test 
    void Test_eliminar_usuario(){
        App classUnderTest = new App();
        boolean resultat = App.eliminar_usuario("mart","mart@gmail.com", 3);
        assertTrue(resultat);
    }
    */
    
    


}
