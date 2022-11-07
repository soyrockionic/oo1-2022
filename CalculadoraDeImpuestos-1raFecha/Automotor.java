package calculadoradeimpuestos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Automotor implements Impuesto {
    
    private String patente;
    private String marca;
    private String modelo;
    private LocalDate fechaFab;
    private double valor;
    
    public Automotor (String pat, String marca, String modelo, LocalDate fechaFab, double valor){
        this.patente = pat;
        this.marca = marca;
        this.modelo = modelo;
        this.fechaFab = fechaFab;
        this.valor = valor;
    }
  
    public double CalcularValor(){
        double impuesto = 0;
        if(ChronoUnit.YEARS.between(fechaFab,LocalDate.now()) < 10){
            impuesto = this.valor * 0.05;
        }
        return impuesto;
    }
    
}
