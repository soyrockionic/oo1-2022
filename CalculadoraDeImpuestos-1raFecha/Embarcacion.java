package calculadoradeimpuestos;

import java.time.LocalDate;

public class Embarcacion implements Impuesto{
    
    private String patente;
    private String nombre;
    private LocalDate fechaFab;
    private double valor;
    
    public Embarcacion(String patente, String nombre, LocalDate fechaFab, double valor){
        this.patente = patente;
        this.nombre = nombre;
        this.fechaFab = fechaFab;
        this.valor = valor;
    }
    
    public double CalcularValor(){
        double impuesto = 0;
        if(this.valor < 1000000){
            impuesto = this.valor * 0.10;
        }else{
            impuesto = this.valor * 0.15;
        }
        return impuesto;
    }
    
}
