package ejercicio3.balanzamejoradatest;

import ejercicio3.balanzamejorada.Producto;
import ejercicio3.balanzamejorada.Ticket;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;
import java.util.ArrayList;

public class TicketTest {

    private Ticket ticket;
    private Producto producto1;
    private Producto producto2;

    @Before
    public void setUp() {
        // Inicializa los productos y el ticket antes de cada prueba
        producto1 = new Producto("Leche", 2.5, 50.0);  // nombre, peso, precio
        producto2 = new Producto("Pan", 1.0, 20.0);
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(producto1);
        productos.add(producto2);
        ticket = new Ticket(productos);
    }

    @Test
    public void testFecha() {
        // Verifica que la fecha es la actual
        LocalDate today = LocalDate.now();
        assertEquals(today, ticket.getFecha());
    }

    @Test
    public void testPesoTotal() {
        // Verifica que el peso total se calcula correctamente
        assertEquals(3.5, ticket.getPesoTotal(), 0.01);  // 2.5 + 1.0
    }

    @Test
    public void testPrecioTotal() {
        // Verifica que el precio total se calcula correctamente
        assertEquals(145.0, ticket.getPrecioTotal(), 0.01);  // 50.0 + 20.0
    }

    @Test
    public void testCantidadDeProductos() {
        // Verifica que la cantidad de productos es correcta
        assertEquals(2, ticket.getCantidadDeProductos());
    }

    @Test
    public void testImpuesto() {
        // Verifica que el cálculo del impuesto es correcto
        assertEquals(30.45, ticket.impuesto(), 0.01);  // 70.0 * 0.21
    }
}
