package InversorTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestInversor {
	
    private Inversor inversor;
    private Inversion inversion1;
    private Inversion inversion2;
	
    @BeforeEach
    public void setUp() {
	this.inversor = new Inversor("Ada Lovelace");
        this.inversion1 = new InversionEnAcciones("GudmanTect", 100, 240);
	this.inversion2 = new PlazoFijo(LocalDate.now(), 1000, 2);
    }

    @Test
    public void testAgregarInversion() {
	this.inversor.agregarInversion(inversion1);
	this.inversor.agregarInversion(inversion2);
	assertEquals(2, this.inversor.getInversiones().size());
    }
	
    @Test
    public void testValorActual() {
	this.inversor.agregarInversion(inversion1);
	assertEquals(24000, this.inversor.valorActual());
    }
	
    
}
