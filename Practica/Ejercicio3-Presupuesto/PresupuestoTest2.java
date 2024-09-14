package ejercicio3Test;

import ejercicio3.Item;
import ejercicio3.Presupuesto;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;

public class PresupuestoTest2 {

    private Presupuesto presupuesto;
    private Item item1;
    private Item item2;

    @Before
    public void setUp() {
        presupuesto = new Presupuesto().cliente("Juan Pérez");
        item1 = new Item().detalle("Leche").costoUnitario(100).cantidad(2); // Total: 200
        item2 = new Item().detalle("Pan").costoUnitario(50).cantidad(1);    // Total: 50
    }

    @Test
    public void testGetSetFecha() {
        LocalDate fecha = LocalDate.now();
        presupuesto.setFecha(fecha);
        assertEquals(fecha, presupuesto.getFecha());
    }

    @Test
    public void testGetSetCliente() {
        assertEquals("Juan Pérez", presupuesto.getCliente());
        presupuesto.setCliente("Maria López");
        assertEquals("Maria López", presupuesto.getCliente());
    }

    @Test
    public void testAgregarItem() {
        presupuesto.agregarItem(item1);
        presupuesto.agregarItem(item2);

        assertEquals(2, presupuesto.getItems().size());  // Comprobar que se añadieron dos items
    }

    @Test
    public void testCalcularTotal() {
        assertEquals(0, presupuesto.calcularTotal(), 0); // Sin items, total = 0

        presupuesto.agregarItem(item1);
        presupuesto.agregarItem(item2);

        assertEquals(250, presupuesto.calcularTotal(), 0); // Leche + Pan = 200 + 50
    }
}
