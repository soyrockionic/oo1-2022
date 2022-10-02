package ejercicio12.volumenysuperficiedesolidos;

public class Esfera extends Pieza{
    
    private int radio;
    
    public Esfera(int radio, String material, String color){
        super(material,color);
        this.radio = radio;
    }
    
    public double getVolumenDeMaterial(){
        return 1.33 * Math.PI * Math.pow(this.getRadio(), 3);
    }
    
    public double getSuperficieDeColor(){
        return 4 * Math.PI * Math.pow(this.getRadio(), 2);
    }
    
    public int getRadio(){
        return this.radio;
    }
    
}
