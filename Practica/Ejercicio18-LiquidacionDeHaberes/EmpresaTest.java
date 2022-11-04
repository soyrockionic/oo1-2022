package TestLiquidadoraDeHaberes;

import ejercicio18.liquidaciondehaberes.Empresa;
import java.time.LocalDate;

public class EmpresaTest {
    
    public static void main(String[] args) {
       
        Empresa soyrock = new Empresa();
        
        soyrock.altaEmpleado("Piri","Heks","4506",LocalDate.of(2000, 10, 2),true,false);
        soyrock.cargarContratoPorHoras(soyrock.buscarEmpleado("4506"), LocalDate.of(2022, 10, 2), LocalDate.of(2022, 12, 2), 500, 320);
        
        soyrock.altaEmpleado("Sofia", "Kim", "3907", LocalDate.of(1998, 10, 2),false,false);
        soyrock.cargarContratoPorHoras(soyrock.buscarEmpleado("3907"), LocalDate.of(2022, 10, 3), LocalDate.of(2022, 11, 3), 500, 160);
        
        soyrock.altaEmpleado("Mayra","Maggi","2485", LocalDate.of(1994, 6, 10),false,false);
        soyrock.cargarContratoDePlanta(soyrock.buscarEmpleado("2485"), LocalDate.of(2021, 10, 1), 80000, 10000, 10000);
        
        System.out.println(soyrock.obtenerEmpleadosConContratosVencidos());
        
        System.out.println(soyrock.generarRecibos());
        
        soyrock.bajaEmpleado(soyrock.buscarEmpleado("2485"));
        System.out.println(soyrock.getEmpleados());
        
    }
    
}
