package FarolasConFocosTest;

import ejercicio20.farolasconfocos.Farola;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

public class FarolaTest {

    private Farola farola1;
    private Farola farola2;
    private Farola farola3;

    @Before
    public void setUp() {
        farola1 = new Farola("Fabricante A", 5);
        farola2 = new Farola("Fabricante B", 3);
        farola3 = new Farola("Fabricante C", 1);
    }

    @Test
    public void testCrearFarola() {
        assertFalse(farola1.isOn()); // Verificar que la farola comienza apagada
        assertEquals(0, farola1.getNeighbors().size()); // Verificar que no tiene vecinos al inicio
    }

    @Test
    public void testEmparejarFarolas() {
        farola1.pairWithNeighbor(farola2);

        // Verificar que ambas farolas son vecinas entre si
        assertTrue(farola1.getNeighbors().contains(farola2));
        assertTrue(farola2.getNeighbors().contains(farola1));
    }

    @Test
    public void testEncenderFarolaPropagaAccion() {
        farola1.pairWithNeighbor(farola2);
        farola2.pairWithNeighbor(farola3);

        farola1.turnOn();

        // Verificar que todas las farolas en la red estan encendidas
        assertTrue(farola1.isOn());
        assertTrue(farola2.isOn());
        assertTrue(farola3.isOn());
    }

    @Test
    public void testApagarFarolaPropagaAccion() {
        farola1.pairWithNeighbor(farola2);
        farola2.pairWithNeighbor(farola3);

        farola1.turnOn(); // Encender todas las farolas
        farola1.turnOff(); // Apagar la primera farola

        // Verificar que todas las farolas en la red estan apagadas
        assertFalse(farola1.isOn());
        assertFalse(farola2.isOn());
        assertFalse(farola3.isOn());
    }

    @Test
    public void testFarolasConFocosVencidos() {
        farola1.pairWithNeighbor(farola2);
        farola2.pairWithNeighbor(farola3);

        // Encendemos las farolas para consumir los ciclos del foco
        farola1.turnOn();
        farola1.turnOff();
        farola1.turnOn(); // Dos encendidos para farola3 (con 1 ciclo) para vencer su foco

        // Verificar que solo farola3 tiene el foco vencido
        List<Farola> farolasConFocosVencidos = farola1.FarolasConFocosVencidos();
        assertEquals(1, farolasConFocosVencidos.size());
        assertTrue(farolasConFocosVencidos.contains(farola3));
    }
    
}
