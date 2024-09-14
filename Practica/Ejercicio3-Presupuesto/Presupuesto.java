package ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Presupuesto extends Object{
    
    private LocalDate fecha;
    private String cliente;
    private ArrayList<Item> items = new ArrayList<Item>();
    
    
    public LocalDate getFecha() {
	return fecha;
    }
        
    public void setFecha(LocalDate fecha) {
	this.fecha = fecha;
    }
        
    public String getCliente() {
	return cliente;
    }
        
    public void setCliente(String cliente) {
	this.cliente = cliente;
    }
    
    public void agregarItem(Item item){
        items.add(item);
    }
    
    public double calcularTotal() {
        return items.stream()
                        .mapToDouble(Item::costo)  // Mapea cada item a su costo
                        .sum();                    // Suma todos los costos
    }
    
    public Presupuesto cliente(String cliente) {
	this.setCliente(cliente);
	return this;
    }
    
    public ArrayList<Item> getItems(){
        return items;
    }
    
}
