package TestLiquidadoraDeHaberes;

import ejercicio18.liquidaciondehaberes.Empleado;
import java.time.LocalDate;
import java.time.Month;

public class EmpleadoTest {
    
    public static void main(String[] args) {
        
        Empleado arii = new Empleado("Ariana","Diaz","5024",LocalDate.of(2002, 10, 24),true,true);
		
	Empleado maria = new Empleado("Marianella","Diaz","4205",LocalDate.of(2002, 10, 24),false, true);
        
        arii.cargarContratoPorHoras(LocalDate.of(2022, 9, 3), LocalDate.of(2022, 12, 3), 400, 240);
          
        maria.cargarContratoDePlanta(LocalDate.of(2015, 4, 3), 80000, 10000, 10000);
        
        System.out.println("Empleado:         " + arii.toString());
        System.out.println("Sueldo:           " + arii.calcularMontoTotal());
        System.out.println("Contrato vencido: " + arii.tieneContratoVencido());
        System.out.println(arii.generarRecibo());
        System.out.println();
        System.out.println("Empleado:         " + maria.toString());
        System.out.println("Antiguedad:       " + maria.antiguedad());
        System.out.println("Sueldo:           " + maria.calcularMontoTotal());
        System.out.println(maria.generarRecibo());
        
    }
    
}
