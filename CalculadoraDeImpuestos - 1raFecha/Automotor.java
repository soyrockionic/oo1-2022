package calculadoradeimpuestos;

import java.time.LocalDate;

public class Automotor extends Vehiculo {
    
    private String marca;
    private String modelo;
    
    public Automotor (String pat, String marca, String modelo, LocalDate fechaFab, double valor){
        super(pat,fechaFab,valor);
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public double CalcularMonto(){
        double impuesto = 0;
        if(MenorADiezAños()){
            impuesto = getValor() * 0.05;
        }
        return impuesto;
    }
    
}
