package FarolasConFocosTest;

import ejercicio20.farolasconfocos.Farola;

public class FarolasConFocosTest {
    
   public static void main(String[] args) {
        
        Farola farolaUno = new Farola("PHILIPS", 2);
	Farola farolaDos = new Farola("LUMITH", 1);
        
        farolaUno.pairWithNeighbor(farolaDos);
        System.out.println(farolaUno.getNeighbors().contains(farolaDos));
        System.out.println(farolaDos.getNeighbors().contains(farolaUno));
        
        System.out.println();
        System.out.println(farolaUno.isOn());
        System.out.println(farolaDos.isOn());
        
        farolaUno.turnOn();
        System.out.println(farolaUno.isOn());
        System.out.println(farolaDos.isOn());
        
        farolaUno.turnOff();
        System.out.println(farolaUno.isOn());
        System.out.println(farolaDos.isOn());
        System.out.println();
        
        farolaUno.turnOn();
        System.out.println(farolaUno.isOn());
        System.out.println(farolaDos.isOn());
        
        /*farolaDos.turnOff();
        System.out.println(farolaUno.isOn());
        System.out.println(farolaDos.isOn());*/
        
        System.out.println(farolaUno.farolasConFocosVencidos());
        
    } 
    
}
