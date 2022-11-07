package calculadoradeimpuestos;

public class Inmueble implements Impuesto{
    
    private String partida;
    private double valorLote;
    private double valorEdif;
    
    public Inmueble(String partida, double valorLote, double valorEdif){
        this.partida = partida;
        this.valorLote = valorLote;
        this.valorEdif = valorEdif;
    }
    
    public double CalcularValor(){
        return (this.valorLote + this.valorEdif) * 0.01;
    }
    
}
