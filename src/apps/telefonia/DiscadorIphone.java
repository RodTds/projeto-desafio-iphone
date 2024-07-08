package apps.telefonia;

public class DiscadorIphone implements Telefone {
    public void ligar(){
        System.out.println("FAZENDO lIGAÇÃO ");
    }
    public void atender(){
        System.out.println("Atendendo telefone ");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando Correio de Voz");
    }
}
