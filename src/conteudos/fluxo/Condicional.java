package conteudos.fluxo;

import java.sql.SQLOutput;

public class Condicional {
    public static void main(String[] args) {

        //atribuição ternaria
        int nota = 7;
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

//        System.out.println("O aluno esta: " + resultado);

        //Switch Case - Casos incadeados
        /*
         * ele combina valores diferente do if else
         */
        String sigla = "M";

        switch (sigla){
            default:{
                System.out.println("Indefinido");
            }
            case "P":{
                System.out.println("Medida igual a P - Pequeno");
                break;
            }
            case "M":{
                System.out.println("Medida igual a M - Médio");
                break;
            }
            case "G":{
                System.out.println("Medida igual G - Grande");
                break;
            }
        }
    }
}
