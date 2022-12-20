package mantenimiento;

import java.time.LocalDate;

public class Prolongado extends Contrato{
    
    private int cantDias;
    
    public Prolongado(Servicio serv, LocalDate fechaIni, int cantDias){
        super(serv,fechaIni);
        this.cantDias = cantDias;
    }
    
    public double ObtenerMontoAbonar(){
        double monto = this.getServicio().MontoAbonar() * this.cantDias;
        if(this.cantDias > 5)
            monto = monto * 0.9;
        return monto;
    }
    
}
