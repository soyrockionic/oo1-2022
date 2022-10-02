package ejercicio3Test;

import ejercicio3.Item;
import ejercicio3.Presupuesto;
import static junit.framework.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class PresupuestoTest2 {
    
    private Presupuesto presupuesto;

	@Before
	public void setUp() {
	    presupuesto = new Presupuesto().cliente("Guadalupe");
	}

	@Test
	public void testCalcularTotal() {
	    assertEquals(0, presupuesto.calcularTotal());
	    Item item = new Item().detalle("Leche").costoUnitario(100).cantidad(1);
            presupuesto.agregarItem(item);
	    assertEquals(100, presupuesto.calcularTotal());

	    item = new Item().detalle("Chocolate").costoUnitario(150).cantidad(1);
            presupuesto.agregarItem(item);

	    assertEquals(250, presupuesto.calcularTotal());
	}

	@Test
	public void testInitialize() {
	    assertEquals(0, presupuesto.calcularTotal());
	}
    
}
