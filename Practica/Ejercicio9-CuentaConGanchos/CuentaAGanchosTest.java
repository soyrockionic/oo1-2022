package CuentaAGanchos;

import ejercicio9.cuentaaganchos.CajaDeAhorro;
import ejercicio9.cuentaaganchos.CuentaCorriente;

public class CuentaAGanchosTest {
    
    public static void main(String[] args) {
        
        System.out.println("----------");
        CajaDeAhorro ahorro = new CajaDeAhorro(100.0);
        ahorro.depositar(1000);
        ahorro.extraer(500.0);
        System.out.println(ahorro.getSaldo());
        ahorro.depositar(300);
        System.out.println(ahorro.getSaldo());
        
        System.out.println("----------");
        CuentaCorriente corriente = new CuentaCorriente(0,300);       
        corriente.depositar(2000);
        corriente.extraer(2250);
        System.out.println(corriente.getSaldo());
        ahorro.transferirACuenta(150, corriente);
        System.out.println(corriente.getSaldo());
        
        System.out.println("----------");
        System.out.println(ahorro.getSaldo());
    }
    
}
