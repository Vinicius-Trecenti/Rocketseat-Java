package conteudos.POO.Enums;

public class SistemaEnumeracao {
    public static void main(String[] args) {
//        EstadoBrasileiro eb = EstadoBrasileiro.PIAUI;

        String nome = "sao_paulo"; //As vezes vem de outra fonte e devemos limpar e tratar para buscar nas nossas classes
        EstadoBrasileiro eb = EstadoBrasileiro.valueOf(nome.toUpperCase());
        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());

        System.out.println("----- Estados na Classe Enum -----");
        for (EstadoBrasileiro estados: EstadoBrasileiro.values()){
            System.out.println(estados.getNome() + " - " + estados.getSigla());
        }
        System.out.println("----------");
    }
}
