package ejercicio3.balanzamejoradatest;

import ejercicio3.balanzamejorada.Producto;
import static junit.framework.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


public class ProductoTest2 {

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
    queso.setPeso(0.1);
    queso.setPrecioPorKilo(140);
    assertEquals(14, queso.getPrecio());
  }
}
