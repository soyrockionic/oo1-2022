package ejercicio3.balanzamejorada;

import java.util.*;

public class Balanza extends Object {
    
    private ArrayList<Producto> productos= new ArrayList<Producto>();
	
    public void agregarProducto(Producto producto) {
	productos.stream();
	productos.add(producto);
    }
	
    public Ticket emitirTicket() {
	Ticket ticket = new Ticket (this.productos);
	return ticket;
    }
	
    public void ponerEnCero() {
	this.productos.clear();
    }

    public List<Producto> getProductos(){
	return this.productos;
    }
}
