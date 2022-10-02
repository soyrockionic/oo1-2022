package ejercicio2test;

import ejercicio2.Balanza;
import ejercicio2.Producto;
import ejercicio2.Ticket;
import java.time.LocalDate;
import static junit.framework.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class BalanzaTest {
    
    private Balanza balanza;
    private Producto queso;
    
    @Before
    void setUp() throws Exception {      
        balanza = new Balanza();
        queso = new Producto();
        queso.setPeso(0.5);
        queso.setPrecioPorKilo(140);
        queso.setDescripcion("Queso");

    }
    
    @Test
    void testAgregarProducto() {
        balanza.agregarProducto(queso);
        assertEquals(0.5, balanza.getPesoTotal());
        assertEquals(14, balanza.getPrecioTotal());
        assertEquals(1, balanza.getCantidadDeProductos());  
    }

    @Test
    void testCantidadDeProductos() {
        assertEquals(0, balanza.getCantidadDeProductos());
        balanza.agregarProducto(queso);
        assertEquals(1, balanza.getCantidadDeProductos());
    }  
    
    @Test
    void testEmitirTicket() {
        balanza.agregarProducto(queso);
        Ticket ticket = balanza.emitirTicket();
        assertEquals(0.5, ticket.getPesoTotal());
        assertEquals(140, ticket.getPrecioTotal());
        assertEquals(1, ticket.getCantidadDeProductos());
        assertEquals(140 * 0.21, ticket.impuesto());
        assertEquals(LocalDate.now(), ticket.getFecha());
    }

    @Test
    void testConstructor() {
        assertEquals(0, balanza.getPesoTotal());
        assertEquals(0, balanza.getPrecioTotal());
        assertEquals(0, balanza.getCantidadDeProductos());
    }
    
    @Test
    void testPesoTotal() {
        assertEquals(0, balanza.getPesoTotal());
        balanza.agregarProducto(queso);
        assertEquals(0.5, balanza.getPesoTotal());
    } 
    
    @Test
    void testPonerEnCero() {
        balanza.agregarProducto(queso);
        balanza.ponerEnCero();
        assertEquals(0, balanza.getPesoTotal());
        assertEquals(0, balanza.getPrecioTotal());
        assertEquals(0, balanza.getCantidadDeProductos());
    } 
    
    @Test
    void testPrecioTotal() {
        assertEquals(0, balanza.getPrecioTotal());
        balanza.agregarProducto(queso);
        assertEquals(140, balanza.getPrecioTotal());
    } 
    
    
}
