package VolumenYSuperficieTest;

import ejercicio12.volumenysuperficiedesolidos.Cilindro;
import ejercicio12.volumenysuperficiedesolidos.Esfera;
import ejercicio12.volumenysuperficiedesolidos.PrismaRectangular;
import ejercicio12.volumenysuperficiedesolidos.ReporteDeConstruccion;

public class VolumenYSuperficieTest {
    
    public static void main(String[] args) {
        
        ReporteDeConstruccion rp = new ReporteDeConstruccion();
        
        Esfera e1 = new Esfera(2,"Plastico","Rojo");
        Esfera e2 = new Esfera(2,"Plastico","Azul");
        
        rp.addPiezas(e1);
        rp.addPiezas(e2);
        
        Cilindro c1 = new  Cilindro(2,5,"Hierro","Rojo");
        
        rp.addPiezas(c1);
        
        PrismaRectangular prisma = new PrismaRectangular(4,6,8,"Plastico","Azul");
        
        rp.addPiezas(prisma);
        
        System.out.println(rp.getVolumenDeMaterial("Plastico"));
        System.out.println(rp.getSuperficieDeColor("Rojo"));
        
        
    }
    
}
