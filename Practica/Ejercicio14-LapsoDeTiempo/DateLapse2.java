package ejercicio14.otraimplementacion;

import ejercicio14.lapsodetiempo.Interface;
import java.time.LocalDate;

public class DateLapse2 implements Interface {
    
    private LocalDate from;
    private int sizeInDays;
	
    public DateLapse2(LocalDate aDateFrom, int days) {
	fromTo(aDateFrom,days);
    }
	
    private void fromTo(LocalDate aDateFrom, int days) {
	this.setFrom(aDateFrom);
	this.setSizeInDays(days);
    }
	
    public int sizeInDays() {
	return this.getSizeInDays();
    }
	
    public boolean includesDate(LocalDate other) {
	LocalDate to = this.getFrom().plusDays(sizeInDays);
	if(other.isAfter(getFrom()) && other.isBefore(to))
	    return true;
	else
	    return false;
    }

    public LocalDate getFrom() {
	return from;
    }

    public void setFrom(LocalDate from) {
	this.from = from;
    }

    public int getSizeInDays() {
        return sizeInDays;
    }

    public void setSizeInDays(int sizeInDays) {
	this.sizeInDays = sizeInDays;
    }
        

}