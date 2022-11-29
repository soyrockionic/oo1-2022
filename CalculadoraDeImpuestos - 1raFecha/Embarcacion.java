package calculadoradeimpuestos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Embarcacion extends Vehiculo{
    
    private String nombre;
    
    public Embarcacion(String patente, String nombre, LocalDate fechaFab, double valor){
        super(patente,fechaFab,valor);
        this.nombre = nombre;
    }
    
    public double CalcularMonto(){
        double impuesto = 0;
        if(MenorADiezAños()){
            if(getValor() < 1000000){
                impuesto = getValor() * 0.10;
            }else{
                impuesto = getValor() * 0.15;
            }
        }
        return impuesto;
    }
    
}
