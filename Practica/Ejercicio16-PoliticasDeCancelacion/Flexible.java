package ejercicio15.alquilerdepropiedades;

import java.time.LocalDate;

public class Flexible implements Interface{

    public Flexible() {
	
    }

    @Override
    public double calcularReembolso(Reserva reserva, LocalDate fecha) {
	if(fecha.isBefore(reserva.getPeriodo().getFrom())){     
	    return reserva.calcularPrecio();       
        }else
	    return 0;
    }

}