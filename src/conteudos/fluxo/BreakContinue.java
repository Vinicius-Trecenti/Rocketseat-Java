package conteudos.fluxo;

public class BreakContinue {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            if(i == 3){
//                break; para por completo o laço e nao exibe a mensagem
                continue; //apenas nao exebi a mensagem
            }
            System.out.println(i);
        }
    }
}
