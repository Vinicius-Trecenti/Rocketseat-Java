package conteudos.fluxo;

import java.util.Random;

public class DoWhile {

    private static int tentativas = 0;

    public static void main(String[] args) {
        System.out.println("Discando...");

        do{
            System.out.println("Chamando...");
        }
        while(tocando());

        if(tentativas < 5){
            System.out.println("Alo!");
        }
        else{
            System.out.println("Chamada encerrada - Caixa postal");
        }

    }

    public static boolean tocando(){
        tentativas++;
        boolean atendeu = new Random().nextInt(5) == 1;

        if(tentativas == 5){
            return false;
        }
        else
            return !atendeu;
    }
}
