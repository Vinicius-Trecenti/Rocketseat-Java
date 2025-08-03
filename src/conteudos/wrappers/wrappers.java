package conteudos.wrappers;

public class wrappers {
    public static void main (String[] args){
        double numeroDouble = 123.56;
        int numeroInt = (int) numeroDouble; //expression cast -> para conversao do tipo

        System.out.println(numeroInt);
        System.out.println(numeroDouble);

        Double d = 100.0;
        Integer i = d.intValue(); // O Wrapper intValue permite converter o tipo
        System.out.println(i);

        //Vantagens de utilizar os metodos Wrappers
        String numero = "100";
        int numeroConvertido = Integer.parseInt(numero);

        String numeroD = "100.50";
        double numerDouble = Double.parseDouble(numeroD);

        System.out.println(numeroConvertido);
        System.out.println(numerDouble);

        //comparando objetos
        Integer obj1 = Integer.valueOf("100");
        Integer obj2 = Integer.valueOf("100");

        System.out.println(obj1.equals(obj2));      //--> retorna true
        System.out.println(obj1.compareTo(obj2));   //--> retorna 0 para iguais -1 menores 1 maior que o objeto comparado
    }
}
