package ejercicio14.lapsodetiempo;

import java.time.LocalDate;

public interface Interface {
    
    public int sizeInDays();
    public boolean includesDate(LocalDate other);
    public LocalDate getFrom();
    
}
