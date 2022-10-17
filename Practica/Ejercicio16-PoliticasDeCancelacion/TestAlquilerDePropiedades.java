package TestAlquilerDePropiedades;

import ejercicio15.alquilerdepropiedades.DateLapse;
import ejercicio15.alquilerdepropiedades.Moderada;
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
            LocalDate.of(2022, 10, 10));
        
        Usuario dueño = new Usuario("Marianella","Calle 47",43254904);
        bnb.registrarUsuario(dueño);
        Moderada m = new Moderada();
        Propiedad prop = new Propiedad("Casa","Con garage",200,dueño,"Calle 55",m);
        System.out.println(bnb.registrarPropiedad(prop));
            
        Usuario inquilino = new Usuario("Juan","Calle 47",43254904);
        bnb.registrarUsuario(inquilino);
        dueño.registrarPropiedad(prop);
        Reserva reserva1 = new Reserva(lapso1,prop);
        inquilino.hacerReserva(reserva1);
             
        prop.agregarReserva(reserva1);
        
        System.out.println("Cant Reservas: " + inquilino.getReservas().size());
        System.out.println("Ingresos:      " + bnb.calcularIngresos(dueño, LocalDate.of(2022, 10, 2),
                                               LocalDate.of(2022, 10, 10)));
        System.out.println("Reserva:       " + reserva1.calcularPrecio());
        System.out.println("Reembolso:     " + prop.CancelarReserva(reserva1, LocalDate.of(2022, 9, 29)));
        
        bnb.eliminarReserva(reserva1);
        
        Iterator it = inquilino.getReservas().iterator();
        while(it.hasNext())
            System.out.println(it.next());
        
        System.out.println("Cant Reservas: " + inquilino.getReservas().size());
        
    }
    
}
