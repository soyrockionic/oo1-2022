package ejercicio3Test;

import ejercicio3.Item;
import static junit.framework.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class ItemTest2 {
    
    private Item item;

	@Before
	public void setUp() {
	    item = new Item().detalle("Azucar").costoUnitario(60).cantidad(2);
	}

	@Test
	public void testCosto() {
	    assertEquals(120, item.costo());
	}

	@Test
	public void testCostoUnitario() {
	    assertEquals(60, item.getCostoUnitario());
	}
        
        
}
    
