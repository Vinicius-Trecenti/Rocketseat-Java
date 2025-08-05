package conteudos.pilares_POO;

public class Computador {
    public static void main(String[] args) {
        MSNMessager msn = new MSNMessager();
        msn.enviarMensagem();
        msn.receberMensagem();

        WhatsApp whats = new WhatsApp();
        whats.enviarMensagem();
        whats.receberMensagem();
    }
}
