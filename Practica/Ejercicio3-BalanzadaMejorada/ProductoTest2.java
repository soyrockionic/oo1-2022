package ejercicio3.balanzamejoradatest;

import ejercicio3.balanzamejorada.Producto;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class ProductoTest2 {

    private Producto producto;

    @Before
    public void setUp() {
        // Inicializa un Producto antes de cada prueba
        producto = new Producto("Manzana", 2.0, 5.0); // descripcion, peso, precio por kilo
    }

    @Test
    public void testGetDescripcion() {
        // Verifica que la descripcion se obtiene correctamente
        assertEquals("Manzana", producto.getDescripcion());
    }

    @Test
    public void testGetPeso() {
        // Verifica que el peso se obtiene correctamente
        assertEquals(2.0, producto.getPeso(), 0.01);
    }

    @Test
    public void testGetPrecioPorKilo() {
        // Verifica que el precio por kilo se obtiene correctamente
        assertEquals(5.0, producto.getPrecioPorKilo(), 0.01);
    }

    @Test
    public void testGetPrecio() {
        // Verifica que el precio total se calcula correctamente
        assertEquals(10.0, producto.getPrecio(), 0.01); // 2.0 * 5.0
    }

    @Test
    public void testSetPeso() {
        // Verifica que el peso se establece correctamente
        producto.setPeso(3.0);
        assertEquals(3.0, producto.getPeso(), 0.01);
    }

    @Test
    public void testSetPrecioPorKilo() {
        // Verifica que el precio por kilo se establece correctamente
        producto.setPrecioPorKilo(6.0);
        assertEquals(6.0, producto.getPrecioPorKilo(), 0.01);
    }

    @Test
    public void testSetDescripcion() {
        // Verifica que la descripcion se establece correctamente
        producto.setDescripcion("Naranja");
        assertEquals("Naranja", producto.getDescripcion());
    }
}
