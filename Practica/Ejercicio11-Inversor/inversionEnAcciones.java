package ejercicio11.elinversor;

public class inversionEnAcciones implements Inversion{
    
    private String nombre;
    private int cantidad;
    private double valorUnitario;
    
    
    public inversionEnAcciones(String nombre, int cantidad, double valorUnitario) {
	this.nombre = nombre;
	this.cantidad = cantidad;
	this.valorUnitario = valorUnitario;
    }
    
 
    public double valorActual() {
	return this.getCantidad() * this.getValorUnitario();
    }
       
    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public double getValorUnitario() {
	return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
	this.valorUnitario = valorUnitario;
    }

    public int getCantidad() {
	return cantidad;
    }

    public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
    }
    
    
    
}
