package ejercicio2test;

import ejercicio2.Producto;

public class ProductoTest2 {   
    
    public static void main(String[] args) {
        
        Producto queso = new Producto();
        
        queso.setDescripcion("queso");
        if(queso.getDescripcion().equals("queso")){
            System.out.println(queso.getDescripcion());
        }
        queso.setPrecioPorKilo(250);
        if(queso.getPrecioPorKilo() == 250) {
            System.out.println(queso.getPrecioPorKilo());
        }
        queso.setPeso(2);
        if(queso.getPeso() == 2){
        System.out.println(queso.getPeso());
        }
        if(queso.getPrecio() == 500){
            System.out.println(queso.getPrecio());
        }
        
    }
    
}
