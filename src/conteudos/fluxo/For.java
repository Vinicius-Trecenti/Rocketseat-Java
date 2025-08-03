package conteudos.fluxo;

public class For {
    public static void main(String[] args) {
        /**
         * Estruturas de repetição
         * Loops são repetições que acontecem no codigo
         * podendo ter seuas condições e controle de fluxos
         */

        //for ( bloco de inicialização ; expressão booleana de validacao ; bloco de incremento ou atualização){}
        for(int contador = 0 ; contador < 11 ; contador++){
            System.out.println("1 x " + contador + " = " + 1*contador);
        }

        String alunos[] = {"Felipe", "Jonas", "Tiago", "Julia"};

        //com index e contadores para gerenciar os encrementos
        for(int index = 0; index < alunos.length; index++){
            System.out.println("Aluno: " + alunos[index]);
        }

        //para cada item dentro do array
        for(String aluno : alunos){
            System.out.println("Aluno com foreach: " + aluno);
        }
    }
}
