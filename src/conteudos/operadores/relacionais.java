package conteudos.operadores;

public class relacionais {

    //avaliam a relação entre duas variaveis ou expressões
    //sempre resultam em valores booleanos
    /*
       == (igual)
       != (diferente)
       >  (maior)
       <  (menor)
       >= (maior ou igual)
       <= (menor ou igual)
    */

    public static void main(String [] args){
        int numero1 = 1;
        int numero2 = 2;

        //operadores ternarios
        int idade = 18;
        boolean maior = idade > 18;
        // expressao condicional ? caso seja true : caso seja false
        System.out.println("Iza é maior de idade? " + (maior ? "Sim" : "Não"));

        if(numero1 > numero2){
            System.out.println("Maior");
        }

        if(numero1 < numero2) {
            System.out.println("Menor");
        }

        if(numero1 != numero2) {
            System.out.println("Diferente");
        }

    }
}
