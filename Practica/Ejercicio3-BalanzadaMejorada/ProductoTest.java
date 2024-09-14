package ejercicio3.balanzamejoradatest;

import ejercicio3.balanzamejorada.Producto;

public class ProductoTest {
    
    public static void main(String[] args) {
        
        Producto queso = new Producto();      
        queso.setPeso(0.5);
        queso.setPrecioPorKilo(140.0);
        queso.setDescripcion("Queso");
        
        System.out.println("Descripcion: " + queso.getDescripcion());
        System.out.println("Peso:        " + queso.getPeso());
        System.out.println("Precio x kg: " + queso.getPrecioPorKilo());
        System.out.println("Precio:      " + queso.getPrecio());
        
    }
       
}
