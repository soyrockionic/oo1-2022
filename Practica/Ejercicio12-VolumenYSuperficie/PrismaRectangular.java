package ejercicio12.volumenysuperficiedesolidos;

public class PrismaRectangular extends Pieza{
    
    private int ladoMayor;
    private int ladoMenor;
    private int altura;
    
    
    public PrismaRectangular(int altura, int ladoMayor, int ladoMenor,
            String material, String color){
        super(material,color);
        this.altura = altura;
        this.ladoMayor = ladoMayor;
        this.ladoMenor = ladoMenor;
    }
    
    public int getLadoMayor() {
	return ladoMayor;
    }
    
    public int getLadoMenor() {
	return ladoMenor;
    }
    
    public int getAltura() {
	return altura;
    }
    
    
    public double getVolumenDeMaterial() {
	return this.getLadoMayor() * this.getLadoMenor() * this.getAltura();
    }
    
    public double getSuperficieDeColor(){
        return 2 * (ladoMayor * ladoMenor + ladoMayor * altura
                + ladoMenor * altura);
    }
    
    
}
