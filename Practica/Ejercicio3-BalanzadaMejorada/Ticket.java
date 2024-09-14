package ejercicio3.balanzamejorada;

import java.time.LocalDate;
import java.util.ArrayList;

public class Ticket {
    
    private LocalDate fecha;
    private double pesoTotal;
    private double precioTotal;
    private int cantidadDeProductos;
    private ArrayList<Producto> productos;

    public Ticket(ArrayList<Producto> productos) {
        this.fecha = LocalDate.now();
        this.productos = new ArrayList<>(productos);
        this.pesoTotal = productos.stream().mapToDouble(Producto::getPeso).sum();
        this.precioTotal = productos.stream().mapToDouble(Producto::getPrecio).sum();
        this.cantidadDeProductos = productos.size();
    }
    
    public double impuesto() {
        return this.getPrecioTotal() * 0.21;
    }
    	
    public LocalDate getFecha() {
        return fecha;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public int getCantidadDeProductos() {
        return cantidadDeProductos;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
    
}
        