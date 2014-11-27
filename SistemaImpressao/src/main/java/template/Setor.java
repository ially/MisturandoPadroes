package template;

public abstract class Setor {
        
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
  
    
}
