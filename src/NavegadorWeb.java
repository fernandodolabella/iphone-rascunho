package src;

public class NavegadorWeb extends Iphone{
    
    public NavegadorWeb(String modelo) {
        super(modelo);
    }
    public void exibirPagina(){
        System.out.println("Exibindo página");
    }
    public void adicionarNovaAba(){
        System.out.println("Nova aba");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando...");
    }
}
