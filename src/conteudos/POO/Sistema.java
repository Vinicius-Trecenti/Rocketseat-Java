package conteudos.POO;

public class Sistema {
    public static void main(String[] args) {
        //Objeto do tipo cliente - como uma forma de cadastro do cliente
        //Os construtores sao importantes para expressar que precisa de dados na criação
        Cliente vinicius = new Cliente("Vinicius Trecenti"); //apos o construtor o nome precisa ser informado

        //Manipulando estado dos objetos
        vinicius.nome = "Vinicius Trecenti";
        Cliente izabela = new Cliente("Izabela Ramos");
        //izabela.nome = "Izabela";

        System.out.println(vinicius.nome + " = R$" + vinicius.limiteCredito);
        vinicius.solicitarLimiteCredito(200.0);
        System.out.println(vinicius.nome + " = R$" + vinicius.limiteCredito);

        System.out.println(izabela.nome + " = R$" + izabela.limiteCredito);
        izabela.solicitarLimiteCredito(400.0);
        System.out.println(izabela.nome + " = R$" + izabela.limiteCredito);

        izabela.comprar(250.0);
        System.out.println("Após a compra izabela ficou com:");
        System.out.println(izabela.nome + " = R$" + izabela.limiteCredito);

    }
}
