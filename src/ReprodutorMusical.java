package src;

public class ReprodutorMusical extends Iphone{
    
    public ReprodutorMusical(String modelo) {
        super(modelo);
    }
    public void tocar(){
        System.out.println("Reproduzindo musica");
    }
    public void pausar(){
        System.out.println("Pausando musica");
    }
    public void selecionarMusica(){
        System.out.println("Escolhendo musica");
    }
}
