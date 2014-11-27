package strategy.singleton;

import strategy.JeitoImprimir;

public class Laser implements JeitoImprimir{
    
    private static Laser laserInstancia = null;
    
    private Laser(){}
    
    public static Laser getLaserInstancia(){
        
        if(laserInstancia == null){
            laserInstancia = new Laser();
            System.out.println("Iniciou e Utilizou Impressora Laser.");
        }
        else{
            System.out.println("Utilizou Impressora Laser.");
        }
        return laserInstancia;
    }

    @Override
    public void jeitoImprimir() {
        System.out.println("Imprimindo na Impressora Laser\n");
    }
    
}
