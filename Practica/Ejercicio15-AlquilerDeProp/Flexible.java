package ejercicio15.alquilerdepropiedades;

import java.time.LocalDate;

public class Flexible extends Propiedad{

    public Flexible(String nombre, String descripcion, double precioPorNoche, Usuario dueño, String direccion) {
	super(nombre, descripcion, precioPorNoche, dueño, direccion);
    }

    @Override
    public double calcularReembolso(Reserva reserva, LocalDate fecha) {
	    if(fecha.isBefore(reserva.getPeriodo().getFrom())){
                reserva.eliminarse();
		return reserva.calcularPrecio();
            }else
		return 0;
    }

    
}