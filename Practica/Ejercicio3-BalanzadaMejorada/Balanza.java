package ejercicio3.balanzamejorada;

import java.util.ArrayList;
import java.util.List;

public class Balanza {

    private ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public Ticket emitirTicket() {
        // Crear el Ticket usando la lista de productos actual
        Ticket ticket = new Ticket(this.productos);
        return ticket;
    }

    public void ponerEnCero() {
        // Limpiar la lista de productos
        this.productos.clear();
    }

    public List<Producto> getProductos() {
        return this.productos;
    }
    
}
