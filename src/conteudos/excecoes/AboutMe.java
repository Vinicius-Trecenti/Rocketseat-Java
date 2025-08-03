package conteudos.excecoes;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        // Tratar caso seja nulo ou invalido o nome
        String nome = scanner.next();

        System.out.println("Digite sua idade:");
        // Tratar caso seja vazio ou um double e entre outros
        int idade = scanner.nextInt();

        System.out.println("Olá " + nome + " sua idade é " + idade);
        

        /**
         * Sempre suar Try and Catch para capturar os erros - Finally para fim
         */
        try {
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
