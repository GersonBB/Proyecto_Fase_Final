package uvg.edu.gt;

import static org.junit.jupiter.api.Assertions.*;

class TraductorTest {

        @org.junit.jupiter.api.Test
        void contarcaracteres() {
            Traductor traductor = new Traductor();
            assertEquals(2, traductor.contarcaracteres("hola", 'o'));
        }

        @org.junit.jupiter.api.Test
        void operar() {
            Traductor traductor = new Traductor();
            traductor.operar("(+ 1 2)");
            assertEquals(3, traductor.operaciones1.size());
        }
}