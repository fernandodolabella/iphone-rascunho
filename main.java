

import src.Iphone;
import src.NavegadorWeb;
import src.ReprodutorMusical;
import src.Telefone;

public class main {
    public static void main(String[] args) {

        ReprodutorMusical ipod = new ReprodutorMusical(null);
        ipod.tocar();
        ipod.pausar();
        ipod.selecionarMusica();

        Telefone celular = new Telefone(null);
        celular.ligar(12345678);
        celular.atender();

        NavegadorWeb browser = new NavegadorWeb(null);
        browser.exibirPagina();
        browser.adicionarNovaAba();
        browser.atualizarPagina();

        Iphone iphone = new Iphone("6");
        iphone.desligar(true);

    

    }
}
