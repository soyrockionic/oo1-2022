package ejercicio14.lapsodetiempo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse implements Interface{
    
    private LocalDate from;
    private LocalDate to;
    
    public DateLapse(LocalDate from,LocalDate to){
        fromTo(from,to);
    }       
   
    /*Retorna la fecha de inicio del rango*/
    public LocalDate getFrom(){
        return this.from;
    }
    
    /*Retorna la fecha de fin del rango*/
    public LocalDate getTo(){
        return to;
    }
    
    private void fromTo(LocalDate from, LocalDate to) {
	this.from = from;
	this.to = to;
    }
    
    /*retorna la cantidad de dias entre la fecha 'from' y la fecha 'to'*/
    public int sizeInDays(){
        return (int) this.getFrom().until(getTo(),ChronoUnit.DAYS);
    }
    
    /*recibe un objeto LocalDate y retorna true si la fecha esta entre
      el from y el to del receptor y false en caso contrario*/
    public boolean includesDate(LocalDate other) {
	if(other.isAfter(getFrom()) && other.isBefore(getTo()))
	    return true;
        else
            return false;
    }
    
    
}
