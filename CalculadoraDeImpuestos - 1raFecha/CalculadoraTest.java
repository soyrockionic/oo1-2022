package calculadoraDeImpuestoTest;

import calculadoradeimpuestos.Calculadora;
import java.time.LocalDate;
import java.time.Month;

public class CalculadoraTest {
    
    public static void main(String[] args) {
        
        Calculadora c = new Calculadora();
        
        c.DarAltaContribuyente("Juan", "604", "juan@gmail.com", "La Plata");
        
        c.DarAltaInmueble("625", 10000, 25000, c.buscarContribuyente("604"));
        c.DarAltaAutomotor("ABC123", "Ford", "Moustang", LocalDate.of(2015, 11, 5), 5000, c.buscarContribuyente("604"));
        
        c.DarAltaContribuyente("Marianella", "407", "neko@gmail.com", "La Plata");
        c.DarAltaInmueble("234", 10000, 80000, c.buscarContribuyente("407"));
        
        c.DarAltaContribuyente("Milagros", "263", "mili@gmail.com", "Berisso");
        c.DarAltaAutomotor("ABC789", "Ford", "KA", LocalDate.of(2018, 11, 6), 3500, c.buscarContribuyente("263"));
        
        c.DarAltaContribuyente("Pirita", "506", "piriheks@gmail.com", "La Plata");
        c.DarAltaInmueble("524", 10000, 70000, c.buscarContribuyente("506"));
        c.DarAltaEmbarcacion("ABC123", "Crucero", LocalDate.of(2016, 11, 6) , 120000, c.buscarContribuyente("506"));
        
        System.out.println(c.CalcularTotalImpuestos(c.buscarContribuyente("604")));
    
        c.ContribuyentesQueMasPagan("La Plata",5).forEach(System.out::println);
    
    }
    
}
