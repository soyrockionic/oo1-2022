package LapsoDeTiempoTest;

import ejercicio14.lapsodetiempo.DateLapse;
import java.time.LocalDate;

public class LapsoDeTiempoTest {
    
    public static void main(String[] args) {
        
        
        DateLapse fromTo = new DateLapse(LocalDate.of(2022,9,20),LocalDate.now());
         
        System.out.println("Inicio:                   " + fromTo.getFrom());
        System.out.println("Fin:                      " + fromTo.getTo());
        System.out.println("Cantidad de dias:         " + fromTo.sizeInDays());  
        System.out.println("Se encuentra en el lapso: " + 
                           fromTo.includesDate(LocalDate.of(2022,9,21)));
       
    }       
   
    
}