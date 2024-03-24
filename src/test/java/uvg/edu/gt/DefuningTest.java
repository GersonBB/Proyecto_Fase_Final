package uvg.edu.gt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DefuningTest {

    @Test
    void recursivo() {
        // Arrange
        Defuning d = new Defuning();
        String exp = "(cond (> x 2) (+ x 1) (- x 1))"; // Ejemplo de expresión
        String valor = "5";
        String parametro = "x";
        String nombre = "nombre";

        // Act
        String result = d.recursivo(exp, valor, parametro, nombre);

        // Assert
        assertEquals("6.0 ", result); // Modificar el resultado esperado según lo que debería devolver la función
    }
}
