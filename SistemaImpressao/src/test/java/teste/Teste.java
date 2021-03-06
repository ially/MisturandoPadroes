package teste;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import strategy.singleton.*;

public class Teste {
    
    private JatoTinta instancia01, instancia02;
    
    private Laser inicio, fim;
    
    public Teste() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testaImpressoaraJatoTinta(){
        instancia01 = JatoTinta.getJatoTintaInstancia();
        instancia02 = JatoTinta.getJatoTintaInstancia();
        assertEquals(instancia02, instancia01);        
    }
    
    @Test
    public void testaImpressoraLaser(){
        inicio = Laser.getLaserInstancia();
        fim = Laser.getLaserInstancia();
        assertEquals(fim, inicio);        
    }
}
