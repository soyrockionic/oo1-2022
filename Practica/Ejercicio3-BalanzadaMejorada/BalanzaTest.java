package ejercicio3.balanzamejoradatest;

import ejercicio3.balanzamejorada.Balanza;
import ejercicio3.balanzamejorada.Producto;
import ejercicio3.balanzamejorada.Ticket;


public class BalanzaTest {
    
    public static void main(String[] args) {
        
        Balanza balanza = new Balanza(); 
      
        Producto queso = new Producto();      
        queso.setPeso(0.5);
        queso.setPrecioPorKilo(140);
        queso.setDescripcion("Queso");
        
        Producto jamon = new Producto();
        jamon.setDescripcion("Jamón");
        jamon.setPeso(0.5);
        jamon.setPrecioPorKilo(90);
        
        balanza.agregarProducto(queso);
        balanza.agregarProducto(jamon);
        
        Ticket ticket = balanza.emitirTicket();
        System.out.println("Fecha:          " + ticket.getFecha());
        System.out.println("Cant productos: " + ticket.getCantidadDeProductos());
        System.out.println("Peso total:     " + ticket.getPesoTotal());
        System.out.println("Precio total:   " + ticket.getPrecioTotal());
        System.out.println("Iva:            " + ticket.impuesto());
        
        balanza.ponerEnCero();
       
    }
      
}
