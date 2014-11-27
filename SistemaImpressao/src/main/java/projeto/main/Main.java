package projeto.main;

import strategy.singleton.*;
import template.*;

public class Main {

    public static void main(String[] args) {
      
        
        Setor secretaria = new Secretaria();
        secretaria.setJeitoImprimir(JatoTinta.getJatoTintaInstancia());
        secretaria.realizarImpressao();       
        
        secretaria.setJeitoImprimir(JatoTinta.getJatoTintaInstancia());
        secretaria.realizarImpressao();
        
        Setor tesouraria = new Tesouraria();
        tesouraria.setJeitoImprimir(JatoTinta.getJatoTintaInstancia());
        tesouraria.realizarImpressao();
        
        tesouraria.setJeitoImprimir(Laser.getLaserInstancia());
        tesouraria.realizarImpressao();
        
        secretaria.setJeitoImprimir(Laser.getLaserInstancia());
        secretaria.realizarImpressao();
        
    }
    
}
