package ejercicio15.alquilerdepropiedades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Propiedad {
	
    private String nombre;
    private String descripcion;
    private double precioPorNoche;
    private String direccion;
    private Usuario dueño;
    private Interface politica;
    private List<Reserva> fechasOcupadas; /*son las reservas*/
	
    public Propiedad(String nombre, String descripcion, double precioPorNoche, Usuario dueño, String direccion, Interface politica) {
	this.nombre = nombre;
	this.descripcion = descripcion;
	this.dueño = dueño;
	this.direccion = direccion;
        this.politica = politica;
	this.precioPorNoche = precioPorNoche;
	this.fechasOcupadas = new ArrayList<Reserva>();
    }
	
    public Propiedad(){
        
    }
    
    public boolean estaDisponible(DateLapse periodo) {
	List<Boolean> f = fechasOcupadas.stream()
			.map(r -> r.getPeriodo().equals(periodo))
			.collect(Collectors.toList());
        if (f.isEmpty())
	    return true;
	else
            return false;
    }
	
    public double getPrecioPorNoche() {
	return this.precioPorNoche;
    }
    
    public String getNombre(){
        return this.nombre;
    }
	
    public void agregarReserva(Reserva reserva) {
	this.fechasOcupadas.add(reserva);
    }
    
    public double CancelarReserva(Reserva reserva, LocalDate fecha){
        return this.politica.calcularReembolso(reserva, fecha);
    }
	
    public void liberarFecha(Reserva reserva) {
	this.fechasOcupadas.remove(reserva);
    }
	
    public ArrayList<Reserva> getReservas(){
	return  (ArrayList<Reserva>) this.fechasOcupadas;
    }
    
    public String toString(){
        return this.nombre + " - por noche: " + this.precioPorNoche +
                " $ - Dueño " + this.dueño.getNombre();
    }
	
}