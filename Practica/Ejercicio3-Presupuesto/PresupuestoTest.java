package ejercicio3Test;

import ejercicio3.Item;
import ejercicio3.Presupuesto;

public class PresupuestoTest {
    
    public static void main(String[] args) {
        
       Presupuesto p = new Presupuesto().cliente(""); 
       
       System.out.println("Total: " + p.calcularTotal());
       
       Item item = new Item().detalle("Leche").costoUnitario(50).cantidad(3);
       p.agregarItem(item);
       
       item = new Item().detalle("Chocolate").costoUnitario(120).cantidad(2);
       p.agregarItem(item);
       
       System.out.println("Total: " + p.calcularTotal());
       
       
    }
    
}
