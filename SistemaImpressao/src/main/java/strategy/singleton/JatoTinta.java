package strategy.singleton;

import strategy.JeitoImprimir;

public class JatoTinta implements JeitoImprimir{
    
    private static JatoTinta jatoTintaInstancia = null;
    
    private JatoTinta(){}
    
    public static JatoTinta getJatoTintaInstancia(){
        
        if(jatoTintaInstancia == null){
            jatoTintaInstancia = new JatoTinta();
            System.out.println("Iniciou e Utilizou Impressora Jato de Tinta.");
        }
        else{
            System.out.println("Utilizou Impressora Jato de Tinta.");
        }
        return jatoTintaInstancia;
    }
    
    @Override
    public void jeitoImprimir(){
        
        System.out.println("Imprimindo na Impressora Jato de Tinta\n");
    }
}
