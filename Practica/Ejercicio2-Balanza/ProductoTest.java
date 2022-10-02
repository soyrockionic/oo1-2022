package ejercicio2test;

import ejercicio2.Producto;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class ProductoTest {

  private Producto queso;
  
  @Before
  void setUp() throws Exception {
    queso = new Producto();
  }

  @Test
  void testDescripcion() {
    queso.setDescripcion("Queso crema");
    assertEquals("Queso crema", queso.getDescripcion());
  }
  
  @Test
  void testPeso() {
    queso.setPeso(100);
    assertEquals(100, queso.getPeso());
  }

  @Test
  void testPrecioPorKilo() {
    queso.setPrecioPorKilo(100);
    assertEquals(100, queso.getPrecioPorKilo());
  }

  @Test
  void testPrecio() {  
    queso.setPrecioPorKilo(140);
    assertEquals(140, queso.getPrecio());
  }
}