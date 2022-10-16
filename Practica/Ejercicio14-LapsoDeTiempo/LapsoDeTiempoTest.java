package LapsoDeTiempoTest;

import ejercicio14.lapsodetiempo.DateLapse;
import ejercicio14.otraimplementacion.DateLapse2da;
import java.time.LocalDate;

public class LapsoDeTiempoTest {
    
    public static void main(String[] args) {
        
        
        DateLapse fromTo = new DateLapse(LocalDate.of(2022,9,20),LocalDate.now());
        DateLapse2da fromTo2 = new DateLapse2da(LocalDate.of(2022,9,20),30);
         
        System.out.println("Inicio:                   " + fromTo.getFrom());
        System.out.println("Fin:                      " + fromTo.getTo());
        System.out.println("Cantidad de dias:         " + fromTo.sizeInDays());  
        System.out.println("Se encuentra en el lapso: " + 
                           fromTo.includesDate(LocalDate.of(2022,9,21)));
        
        System.out.println();
        System.out.println("Inicio:                   " + fromTo2.getFrom());
        System.out.println("Cantidad de dias:         " + fromTo2.sizeInDays());  
        System.out.println("Se encuentra en el lapso: " + 
                           fromTo2.includesDate(LocalDate.of(2022,9,21)));
       
    }       
    
}