package ejercicio12.volumenysuperficiedesolidos;

public class Cilindro extends Pieza{
    
    private int altura;
    private int radio;
    
    public Cilindro(int radio, int altura, String material, String color){
        super(material,color);
        this.radio = radio;
        this.altura = altura;
    }
    
    
    public double getVolumenDeMaterial() {
	return Math.PI * Math.pow(this.getRadio(), 2) * this.getAltura();
    }
    
    public double getSuperficieDeColor(){
        return 2 * Math.PI * this.getRadio() * this.getAltura()
                + 2 * Math.PI * Math.pow(this.getRadio(), 2);
    }
    
    public int getRadio(){
        return radio;
    }
    
    public int getAltura(){
        return (altura);
    }
    
}
