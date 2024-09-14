package ejercicio3.balanzamejoradatest;

import ejercicio3.balanzamejorada.Balanza;
import ejercicio3.balanzamejorada.Producto;
import ejercicio3.balanzamejorada.Ticket;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class BalanzaTest2 {

    private Balanza balanza;
    private Producto producto1;
    private Producto producto2;

    @Before
    public void setUp() {
        balanza = new Balanza();
        producto1 = new Producto("Leche", 2.5, 50.0);  // nombre, peso, precio
        producto2 = new Producto("Pan", 1.0, 20.0);
    }

    @Test
    public void testAgregarProducto() {
        balanza.agregarProducto(producto1);
        List<Producto> productos = balanza.getProductos();
        assertEquals(1, productos.size());
        assertEquals(producto1, productos.get(0));

        balanza.agregarProducto(producto2);
        assertEquals(2, productos.size());
        assertEquals(producto2, productos.get(1));
    }

    @Test
    public void testEmitirTicket() {
        balanza.agregarProducto(producto1);
        balanza.agregarProducto(producto2);
        
        Ticket ticket = balanza.emitirTicket();

        // Verifica que el ticket tiene la cantidad correcta de productos
        assertEquals(2, ticket.getCantidadDeProductos());

        // Usa un delta pequeño para comparar valores flotantes
        assertEquals(3.5, ticket.getPesoTotal(), 0.01);  // 2.5 + 1.0
        assertEquals(145.0, ticket.getPrecioTotal(), 0.01);  // 50.0 + 20.0
    }

    @Test
    public void testPonerEnCero() {
        balanza.agregarProducto(producto1);
        balanza.ponerEnCero();
        
        // Verifica que la lista de productos este vacia despues de poner en cero
        assertTrue(balanza.getProductos().isEmpty());
    }
    
}
