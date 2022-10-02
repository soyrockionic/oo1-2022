package MetodoLookupTest;

import ejercicio7.methodlookup.Gerente;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestGerente {
    
    private Gerente alan;

    @BeforeEach
    public void setUp() {
	this.alan = new Gerente("Alan Turing");
    }
	
    @Test
    public void testAportes() {
	assertEquals(2850.0, this.alan.Aportes());
    }
	
    @Test
    public void testMontoBasico() {
	assertEquals(43000, this.alan.SueldoBasico());
    }
      
    
}
