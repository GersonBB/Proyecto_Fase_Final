package uvg.edu.gt;

import static org.junit.jupiter.api.Assertions.*;

class DefuningTest {

            @org.junit.jupiter.api.Test
             void recursivo() {
                Defuning d = new Defuning();
                String exp = "cond";
                String valor = "2";
                String parametro = "x";
                String nombre = "nombre";
                String result = d.recursivo(exp, valor, parametro, nombre);
                assertEquals("", result);
            }
}