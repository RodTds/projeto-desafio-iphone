package iphone;
import apps.navegadores.Firefox;
import apps.navegadores.Navegador;
import apps.navegadores.Safari;
import apps.players.IphoneReprodutor;
import apps.players.ReprodutorMusical;
import apps.telefonia.Telefone;
import apps.telefonia.DiscadorIphone;

public class telaPrincipal {
     public static void main(String[] args) {
        System.out.println("Bem Vindo a Tela do Iphone \n ");

        Navegador app = new Safari(); // chamando a classe safari pela interface navegador
        Navegador app2 = new Firefox(); // chamando a classe firefox pela interface navegador

        System.out.println("Funções do Navegador Safari \n");
        app.exibirPagina();
        app.adicionarAba();
        app.atualizarPagina();
        System.out.println("");
     
        System.out.println("Funções do Navegador Firefox\n");
        app2.exibirPagina();
        app2.adicionarAba();
        app2.atualizarPagina();
        System.out.println("");

        // chamdno a classe discador pela interface telefone 
        System.out.println("Funções de Telefone\n");

        Telefone tel = new DiscadorIphone();

        tel.ligar();
        tel.atender();
        tel.iniciarCorreioVoz();
        System.out.println("");

        // chamando classe reprodutorIphone de musica pela interface reprodutor de musica
        System.out.println("Funções Reprodutor Musical ");

        ReprodutorMusical play = new IphoneReprodutor();
        
        play.tocar();
        play.pausar();
        play.selecionarMusica();
    
      }
   
}
