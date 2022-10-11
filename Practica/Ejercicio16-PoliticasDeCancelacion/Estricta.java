package ejercicio15.alquilerdepropiedades;

import java.time.LocalDate;

public class Estricta implements Interface{

    public Estricta() {
	
    }

    @Override
    public double calcularReembolso(Reserva reserva, LocalDate fecha) {
	return 0;
    }

}