package TestAlquilerDePropiedades;

import ejercicio15.alquilerdepropiedades.DateLapse;
import ejercicio15.alquilerdepropiedades.Flexible;
import ejercicio15.alquilerdepropiedades.OOBnB;
import ejercicio15.alquilerdepropiedades.Propiedad;
import ejercicio15.alquilerdepropiedades.Reserva;
import ejercicio15.alquilerdepropiedades.Usuario;
import java.time.LocalDate;
import java.util.Iterator;

public class TestAlquilerDePropiedades {
    
    public static void main(String[] args) {
        
        OOBnB bnb = new OOBnB();
        
        DateLapse lapso1 = new DateLapse(LocalDate.of(2022, 10, 2),
            LocalDate.of(2022, 10, 10));// Del 1 al 10 de diciembre - 9 días
        
        Usuario inquilino = new Usuario("Marianella","Calle 47",43254904);
        Propiedad propiedad1 = new Flexible("Casa","Con garage",200,inquilino,"Calle 55");
        Reserva reserva1 = new Reserva(lapso1,propiedad1);
        
        bnb.registrarUsuario(inquilino);
        bnb.registrarPropiedad(propiedad1);
        inquilino.registrarPropiedad(propiedad1);
        inquilino.hacerReserva(reserva1);
        
        propiedad1.agregarReserva(reserva1);
        
        System.out.println("Ingresos:      " + bnb.calcularIngresos(inquilino, LocalDate.MAX, LocalDate.MAX));
        System.out.println("Reserva:       " + reserva1.calcularPrecio());
        System.out.println("Reembolso:     " + propiedad1.calcularReembolso(reserva1, LocalDate.of(2022, 9, 29)));
        
        bnb.eliminarReserva(reserva1);
        
        Iterator it = inquilino.getReservas().iterator();
        while(it.hasNext())
            System.out.println(it.next());
        
        System.out.println("Cant Reservas: " + inquilino.getReservas().size());
        
        }

}
