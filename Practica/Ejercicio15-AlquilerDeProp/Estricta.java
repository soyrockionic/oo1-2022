package ejercicio15.alquilerdepropiedades;

import java.time.LocalDate;

public class Estricta extends Propiedad{

    public Estricta(String nombre, String descripcion, double precioPorNoche, Usuario dueño, String direccion) {
	super(nombre, descripcion, precioPorNoche, dueño, direccion);
    }

    @Override
    public double calcularReembolso(Reserva reserva, LocalDate fecha) {
	return 0;
    }

}