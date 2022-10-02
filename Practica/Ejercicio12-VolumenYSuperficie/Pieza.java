package ejercicio12.volumenysuperficiedesolidos;

public abstract class Pieza {
    
    private String material;
    private String color;
    
    public Pieza(String material, String color){
        this.material = material;
        this.color = color;
    }
    
    public String getMaterial(){
        return this.material;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public abstract double getVolumenDeMaterial();
    
    public abstract double getSuperficieDeColor();
    
}
