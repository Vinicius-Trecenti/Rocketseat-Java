package conteudos.Comparacao;

public class ComparacaoApp {
    public static void main(String[] args) {

        //Dois tipo de armazenamento para dar false

        /**
         * stack VS Heap
         *
         * Stack - Todos os valores numericos ate 127 bytes é na stack
         * apos isso joga para Heap (Repositorio de Objetos)
        * */

        Integer i1 = 128;
        Integer i2 = Integer.parseInt("128");

        System.out.println(i1 == i2); //compara OBJETOS
        System.out.println(i1.equals(i2)); //compara as informações

        String string1 = "Vinicius";
        String string2 = "Vinicius";
        String string3 = new String("vinicius");

        System.out.println(string1 == string2); //objetos de mesmo valor ele apenas aponta para la para nao gastar mais memoria
        System.out.println(string1.equals(string3));
        System.out.println(string3.equalsIgnoreCase(string1));
    }
}
