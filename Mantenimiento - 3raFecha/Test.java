package Test;

import java.time.LocalDate;
import mantenimiento.Cliente;
import mantenimiento.Servicio;
import mantenimiento.Sistema;

public class Test {
    
    public static void main(String[] args) {
        
        Sistema empresa = new Sistema();
        
        Cliente juan = empresa.RegistrarCliente("Juan", "520 y 179");
        
        Cliente sofia = empresa.RegistrarCliente("Sofia", "Buzan AL 2000");
        
        Servicio s1 = empresa.RegistrarServDeLimpieza(2000, 4, 4000);
        
        Servicio s2 = empresa.RegistrarServParquizacion(2000, 4, 2, 500);
        
        empresa.ContratarPorUnicaVez(juan, LocalDate.of(2022,12,25), s1);
        empresa.ContratarPorUnicaVez(juan, LocalDate.of(2022,12,25), s2);
        
        empresa.ContratarProlongado(sofia, s1, LocalDate.of(2022,12,17), 7);
        empresa.ContratarPorUnicaVez(sofia, LocalDate.of(2022,12,24), s2);
        
        System.out.println(empresa.ObtenerMontoAPagarPorUnCliente(juan));
        System.out.println(empresa.ObtenerMontoAPagarPorUnCliente(sofia));
        System.out.println(empresa.ObtenerCantServiciosMontoMayorAUnValor(3000));
        
        System.out.println("------------------------------");
        System.out.println("Monto a pagar por juan: " + juan.ObtenerMontoAPagar());
        System.out.println("Cant de contratos:      " + juan.getContratos().size());
        
        System.out.println("------------------------------");
        System.out.println("Monto servicio 1: " + s1.MontoAbonar());
        System.out.println("Monto servicio 2: " + s2.MontoAbonar());
        
        System.out.println("------------------------------");
        System.out.println("Cant de clientes: " + empresa.getClientes().size());
        empresa.getClientes().forEach(System.out::println);
    }
    
}
