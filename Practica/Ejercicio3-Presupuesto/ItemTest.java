package ejercicio3Test;

import ejercicio3.Item;


public class ItemTest {
    
    public static void main(String[] args) {
        
        Item item = new Item().detalle("Azucar").costoUnitario(60).cantidad(2);
        System.out.println("Detalle:     " + item.getDetalle());
        System.out.println("Precio unit: " + item.getCostoUnitario());
        System.out.println("Cantidad:    " + item.getCantidad());
        System.out.println("Costo total: " + item.costo());
    }
       
}
