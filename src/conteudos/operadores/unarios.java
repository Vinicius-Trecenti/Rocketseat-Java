package conteudos.operadores;

public class unarios {

    //Sao aplicados juntamente com um outros operador artimético
    //Eles realizam alguns trabalhos básicos como incrementar decrementar, inverter valores numericos ou booleanos

    /*
        (+) Operador unário de valor positivo para incrementar e explicitamente deixar valores positivos
        (-) Operador para valores negativos
        (++) Operador de incremento de valor, incrementa o valor em 1 unidade
        (--) Operador de decremento de valor, menos 1 unidade
        (!) Operador para negação ou inversão de valores em uma expressão
    */

    public static void main(String[] args){
        int numero = +5;

        System.out.println(numero);
        System.out.println(-numero); //inversao do valor para negativo

        numero++;
        System.out.println(numero);

        boolean verdadeira = true;
        boolean falsa = !verdadeira;
        System.out.println(falsa);


    }
}
