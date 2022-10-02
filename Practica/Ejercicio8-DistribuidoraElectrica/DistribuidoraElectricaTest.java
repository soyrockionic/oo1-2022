package DistribuidoraElectricaTest;

import ejercicio8.distribuidoraelectrica.Consumo;
import ejercicio8.distribuidoraelectrica.Distribuidora;
import ejercicio8.distribuidoraelectrica.Usuario;
import java.time.LocalDate;

public class DistribuidoraElectricaTest {

    
    public static void main(String[] args) {
        
        Distribuidora distribuidora = new Distribuidora(0.45);
        
        Usuario juan = new Usuario("520 y 179" , "Juan");
        Usuario maria = new Usuario("520 y 179" , "Marianella");
        
        Consumo alto = new Consumo(LocalDate.now(),800,425);
        Consumo bajo = new Consumo(LocalDate.now(), 300, 150);
	Consumo medio = new Consumo(LocalDate.now(), 450, 225);
        
        distribuidora.agregarUsuario(maria);
        distribuidora.agregarUsuario(juan);
        
        juan.agregarMedicion(alto);
        maria.agregarMedicion(medio);
        
        System.out.println("Cant usuarios: " + distribuidora.getUsuarios().size());
        System.out.println("Consumo total: " + distribuidora.consumoTotalActiva());
        System.out.println(distribuidora.facturar());
       
    }
    
}