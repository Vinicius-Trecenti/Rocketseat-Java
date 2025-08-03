package conteudos.metodos;

public class metodos {
    //todo metodo deve ser um verbo - exemplo somar() ou abrirConexao(){}

    /*
    *   Quais os parâmetros que o método precisa?
    *   O método pode devolver alguma exceção?
    *   Qual o tipo do retorno do método?
    *   Apenas a classe pode acessar o método?
    *   Apenas uma função por método -> evitar calcularImprimir (Exemplo)
    */

    public static void main(String[] args){
        int resultado  = somar(10, 20);

        System.out.println("Resultado da soma: " + resultado);

        int subtracao = subtrair(50, 20);
        System.out.println("Resultado da subtração: " + subtracao);
    }

    public static int somar(int valor1, int valor2){
        return valor1 + valor2;
    }

    public static int subtrair(int valor1, int valor2){
        return valor1 - valor2;
    }
}
