package conteudos.Comparacao;

public class Fabrica {

    public static void main(String[] args) {
        Carro carro1 = new Carro("Branco", "Fiat", "Palio");
        Carro carro2 = new Carro("Branco", "Fiat", "Palio");
        Carro carro3 = new Carro("Branco", "Fiat", "Palio");

        Carro carro4 = carro1;
        System.out.println(carro1 == carro2); //false -> compara referencias de objetos
        System.out.println(carro1.equals(carro2)); //false
        System.out.println(carro4 == carro1); //true mesma referencia
        System.out.println(carro1.equals(carro4));

        //Caracteristicas - é diferente de mesma referencia
        //equals para comparar as caracteristaicas

    }
}
