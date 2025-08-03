package conteudos.operadores;

import java.util.Date;

public class operadores {
    /*
    *   Os tipos de dados sempre esperam o seu real tipo - Alem das definicões basicas
    */

    //Atribuição
    String nome         = "Vinicius" + "Trecenti";
    int idade           = 22;
    double peso         = 74.5;
    char sexo           = 'M';
    boolean doadorOrgao = true;
    Date dataNascimento = new Date(); // Se foi atribuido o tipo data que vem de um pacote

    //Alguns tipos precisam das instancias para serem criados

    //Aritméticos
    /*
    + soma, adição, concatenação
    - subtração
    / divisão
    * multiplicação
    % modulo (Restante da divisão)
    */

    //Ha expressões equivalentes como
    //n1 = n1 + n2;
    //n1 += n2;

    public static void main(String[] args){
        String nome = "Vinicius " + "Trecenti";
        String sobrenome = 1 + 1 + "º nome";

        boolean validacao = 1>2;
        //Ao encontrar uma string ele deixa de querer realizar uma soma e faz uma concatenacao
        System.out.println(nome + " " + sobrenome);
        System.out.println("Resultado: " + validacao);


        int modulo = 20 % 3;
        System.out.println(modulo);
    }
}
