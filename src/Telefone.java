package src;

public class Telefone extends Iphone{
    
    public Telefone(String modelo) {
        super(modelo);
    }

    public void ligar(int tel){      
            System.out.println("Telefonando " + tel);  
            System.out.println("Ninguem atendeu a ligação");   
            IniciarCorreioVoz();     
    }

    public void atender(){
        System.out.println("Atendendo ligação");
        
    }
    private void IniciarCorreioVoz(){
        System.out.println("Iniciando Correio de Voz...");
    }
}
