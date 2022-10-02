package MetodoLookupTest;

import ejercicio7.methodlookup.Gerente;

public class MetodoLookupTest {
    
    public static void main(String[] args) {
        
        Gerente alan = new Gerente("Alan Turing");
        
        System.out.println("Nombre:       " + alan.getNombre());
        System.out.println("Aportes:      " + alan.Aportes());
        System.out.println("Monto basico: " + alan.MontoBasico());
        System.out.println("Bono x Cat. : " + alan.BonoPorCategoria());        
        System.out.println("Sueldo:       " + alan.SueldoBasico());
        
    }
    
}
