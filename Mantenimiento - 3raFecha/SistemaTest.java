package mantenimiento;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class SistemaTest {
    
    private Sistema empresa;
    private Cliente juan;
    private Cliente sofia;
    private Servicio lim01;
    private Servicio lim02;
    private Servicio lim03;
    
    private void initialize(){ 
        empresa = new Sistema(); 
        juan = empresa.RegistrarCliente("Juan", "520 y 179");
        sofia = empresa.RegistrarCliente("Sofia", "Buza al 2000");
        lim01 = empresa.RegistrarServDeLimpieza(2000, 4, 4000);
        lim02 = empresa.RegistrarServDeLimpieza(2500, 3, 6000);
    }
    
    @BeforeEach
    public void setUp() {
	this.initialize();
    }
    
    @Test
    public void TestRegistrarSerDeLimpieza(){
        lim03 = empresa.RegistrarServDeLimpieza(1000, 2, 1500);
        assertEquals(lim03.MontoAbonar(),2000);
    }
    
    @Test
    public void TestContratarPorUnicaVez(){
        empresa.ContratarPorUnicaVez(juan, LocalDate.of(2022, 12, 24), lim01);
        empresa.ContratarPorUnicaVez(juan, LocalDate.of(2022, 12, 23), lim02);
        assertEquals(juan.getContratos().size(),2);
        empresa.ContratarPorUnicaVez(sofia, LocalDate.of(2022, 12, 22), lim01);
        assertEquals(sofia.getContratos().size(),1);
    }
    
    @Test
    public void TestMontoAPorUnCliente(){
        assertEquals(juan.ObtenerMontoAPagar(),16700);
        assertEquals(sofia.ObtenerMontoAPagar(),8000);
    }
    
}
