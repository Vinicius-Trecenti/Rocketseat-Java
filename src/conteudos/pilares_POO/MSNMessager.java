package conteudos.pilares_POO;

public class MSNMessager extends SistemaDeMenssagensInstantaneas{
    public void enviarMensagem() {
        if(validarConectadoInternet()){
            System.out.println("Conectado à Internet!");
        } else {
            System.out.println("Não conectado à Internet!");
            return;
        }
    }

    public void receberMensagem() {
        System.out.println("Mensagem recebida pelo MSN!");
    }

    private boolean validarConectadoInternet() {
        return true; // Simula que está conectado à Internet
    }
}
