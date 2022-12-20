package mantenimiento;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class PorUnicaVez extends Contrato{
    
    public PorUnicaVez(Servicio serv, LocalDate fecha){
        super(serv,fecha);
    }
    
    public double ObtenerMontoAbonar(){
        double monto = this.getServicio().MontoAbonar();
        DayOfWeek dia = DayOfWeek.from(getFecha());
        if(dia.equals(DayOfWeek.SATURDAY) || dia.equals(DayOfWeek.SUNDAY))
            monto = monto * 1.15;
        return monto;
    }
    
}
