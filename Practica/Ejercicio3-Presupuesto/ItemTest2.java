package ejercicio3Test;

import ejercicio3.Item;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class ItemTest2 {

    private Item item;

    @Before
    public void setUp() {
        item = new Item();
    }

    @Test
    public void testGetSetDetalle() {
        item.setDetalle("Leche");
        assertEquals("Leche", item.getDetalle());
    }

    @Test
    public void testGetSetCantidad() {
        item.setCantidad(3);
        assertEquals(Integer.valueOf(3), item.getCantidad());
    }

    @Test
    public void testGetSetCostoUnitario() {
        item.setCostoUnitario(50.5);
        assertEquals(50.5, item.getCostoUnitario(), 0);
    }

    @Test
    public void testCosto() {
        item.setCostoUnitario(100);
        item.setCantidad(2);
        assertEquals(200, item.costo(), 0);  // 100 * 2 = 200
    }

    @Test
    public void testMetodoEncadenado() {
        item.detalle("Pan").costoUnitario(20).cantidad(5);
        assertEquals("Pan", item.getDetalle());
        assertEquals(20, item.getCostoUnitario(), 0);
        assertEquals(Integer.valueOf(5), item.getCantidad());
        assertEquals(100, item.costo(), 0);  // 20 * 5 = 100
    }
    
}
