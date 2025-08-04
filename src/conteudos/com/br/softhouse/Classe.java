package conteudos.com.br.softhouse;

import conteudos.com.br.softhouse.Model.User;

import java.math.BigDecimal;

public class Classe {
    public static void main(String[] args) {
        String nome = "Vinicius";
        Integer idade = 22;
        BigDecimal altura = BigDecimal.ONE;
//        System.out.println(altura);

        //determinando qual a classe que eu realmente preciso utilizar para acessar os metodos e funções
        //ideal por importações para adequar o codigo
        conteudos.com.br.softhouse.Model.User user = new conteudos.com.br.softhouse.Model.User();
        conteudos.com.br.softhouse.User userLocal = new conteudos.com.br.softhouse.User();

        user.showName();
        userLocal.showName();

    }
}
