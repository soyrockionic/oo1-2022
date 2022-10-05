package TestAlquilerDePropiedades;

import ejercicio15.alquilerdepropiedades.DateLapse;
import ejercicio15.alquilerdepropiedades.Estricta;
import ejercicio15.alquilerdepropiedades.OOBnB;
import ejercicio15.alquilerdepropiedades.Propiedad;
import ejercicio15.alquilerdepropiedades.Reserva;
import ejercicio15.alquilerdepropiedades.Usuario;
import java.time.LocalDate;

public class TestAlquilerDePropiedades {
    
    public static void main(String[] args) {
        
        OOBnB bnb = new OOBnB();
        
        DateLapse lapso1 = new DateLapse(LocalDate.of(2021, 12, 1),
            LocalDate.of(2021, 12, 10));// Del 1 al 10 de diciembre - 9 días
        
        Usuario usuario1 = new Usuario("Marianella","Calle 46",43254904);
        Propiedad propiedad1 = new Estricta("Casa","Con garage",200,usuario1,"Calle 55");
        Reserva reserva1 = new Reserva(lapso1,propiedad1);
        
        bnb.registrarUsuario(usuario1);
        bnb.registrarPropiedad(propiedad1);
        usuario1.registrarPropiedad(propiedad1);
        bnb.hacerReserva(lapso1,propiedad1,usuario1);
        
        System.out.println(bnb.calcularIngresos(usuario1, LocalDate.MAX, LocalDate.MAX));
        System.out.println(reserva1.calcularPrecio());
        System.out.println(usuario1.getReservas().get(0).getPeriodo().getFrom());
        System.out.println(usuario1.getReservas().get(0).getPeriodo().getTo());
        System.out.println(usuario1.getReservas().get(0).calcularPrecio());
    }
    
}
