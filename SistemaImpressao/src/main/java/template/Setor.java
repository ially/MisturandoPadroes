package template;

import strategy.JeitoImprimir;

public abstract class Setor {
    
    private JeitoImprimir jeitoImprimir;
        
    private void enviarArquivo(){
        
        System.out.println("Enviando arquivo.");
    }
    
    protected abstract void imprimirArquivo();
    
    private void finalizarImpressao(){
        
        System.out.println("Finalizando Impressao.\n");
    }
    
    public void realizarImpressao(){
        
        enviarArquivo();
        imprimirArquivo();
        finalizarImpressao();
    }   

    public JeitoImprimir getJeitoImprimir() {
        return jeitoImprimir;
    }

    public void setJeitoImprimir(JeitoImprimir jeitoImprimir) {
        this.jeitoImprimir = jeitoImprimir;
    }
  
    
    
}
