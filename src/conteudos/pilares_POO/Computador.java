package conteudos.pilares_POO;

public class Computador {
    public static void main(String[] args) {
        MSNMessager msn = new MSNMessager();
        // msn.enviarMensagem();
        // msn.receberMensagem();

        WhatsApp whats = new WhatsApp();
        // whats.enviarMensagem();
        // whats.receberMensagem();

        //Polimorfismo
        // Podemos usar o mesmo método para diferentes classes
        //Cada classe tem sua própria implementação do método
        String appEscolhido = "WhatsApp";

        if (appEscolhido.equals("MSN")) {
            msn.enviarMensagem();
            msn.receberMensagem();
        } else if (appEscolhido.equals("WhatsApp")) {
            whats.enviarMensagem();
            whats.receberMensagem();
        } else {
            System.out.println("Aplicativo não suportado.");
        }
    }
}
