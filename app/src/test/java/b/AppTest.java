/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package b;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test 
    void Test_registrar_usuari(){
        App classUnderTest = new App();
        boolean resultat = App.registrar_usuario("marta","marta@gmail.com", 1);
        assertTrue(resultat);
    }
    


}
