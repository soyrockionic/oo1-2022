package ejercicio15.alquilerdepropiedades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Moderada extends Propiedad{

    public Moderada(String nombre, String descripcion, double precioPorNoche, Usuario dueño, String direccion) {
	super(nombre, descripcion, precioPorNoche, dueño, direccion);
    }

    @Override
    public double calcularReembolso(Reserva reserva, LocalDate fecha) {
	Long cantidadDias = ChronoUnit.DAYS.between(fecha, reserva.getPeriodo().getFrom());
	if (cantidadDias >= 7) {
	    return reserva.calcularPrecio();
	} else if (cantidadDias >= 2 && cantidadDias < 7) {
	    return reserva.calcularPrecio() / 2;
	}
        return 0;
    }
        

}