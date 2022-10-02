package ejercicio3.balanzamejoradatest;


import ejercicio3.balanzamejorada.Balanza;
import ejercicio3.balanzamejorada.Producto;
import ejercicio3.balanzamejorada.Ticket;
import static junit.framework.Assert.assertEquals;
import java.time.LocalDate;
import org.junit.Before;
import org.junit.Test;

public class BalanzaTest2 {
 
  private Balanza balanza;
  private Producto queso;
  private Producto jamon;
  
  @Before
  void setUp() throws Exception {
    balanza = new Balanza();
    queso = new Producto();
    queso.setPeso(0.1);
    queso.setPrecioPorKilo(140);
    queso.setDescripcion("Queso");

    jamon = new Producto();
    jamon.setDescripcion("Jamón");
    jamon.setPeso(0.1);
    jamon.setPrecioPorKilo(90);
  }

  @Test
  void testAgregarProducto() {
    balanza.agregarProducto(queso); 
    balanza.agregarProducto(jamon);
    assertEquals(0.2, balanza.emitirTicket().getPesoTotal());
    assertEquals(23, balanza.emitirTicket().getPrecioTotal());
    assertEquals(2, balanza.emitirTicket().getCantidadDeProductos());   
  }

  
  @Test
  void testEmitirTicket() {
    balanza.agregarProducto(queso);
    balanza.agregarProducto(jamon);
    Ticket ticket = balanza.emitirTicket();
    assertEquals(0.2, ticket.getPesoTotal());
    assertEquals(23, ticket.getPrecioTotal());
    assertEquals(2, ticket.getCantidadDeProductos());
    assertEquals(23 * 0.21, ticket.impuesto());
    assertEquals(LocalDate.now(), ticket.getFecha());
  }


  @Test
  void testPonerEnCero() {
    balanza.agregarProducto(queso);
    balanza.ponerEnCero();
    assertEquals(0, balanza.emitirTicket().getPesoTotal());
    assertEquals(0, balanza.emitirTicket().getPrecioTotal());
    assertEquals(0, balanza.emitirTicket().getCantidadDeProductos());   
  }  

}