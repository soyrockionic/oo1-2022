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
    
    public double calcularTotal(){
        double total = 0;
        for(Item i:items){
            total = total + i.costo();
        }
        return total;
    }
    
    public Presupuesto cliente(String cliente) {
	this.setCliente(cliente);
	return this;
    }
    
}
