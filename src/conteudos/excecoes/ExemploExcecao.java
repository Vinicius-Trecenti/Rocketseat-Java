package conteudos.excecoes;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        try {
            // Double valor = Double.valueOf("a1.45");
            // Number valor = NumberFormat.getInstance().parse("a1,75");
            // Number valor = NumberFormat.getInstance().parse("1.75"); //vai para 175
            Number valor = NumberFormat.getInstance().parse("1,75"); //vai para 1.75

            Double vd  = valor.doubleValue();
            System.out.println(vd);

        } catch (NumberFormatException ex) {
            System.err.println("Numero invalido");
        }
        catch (ParseException e){
            System.err.println("Numero invalido");
        }
    }
}
