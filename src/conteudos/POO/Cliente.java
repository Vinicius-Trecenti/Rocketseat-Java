package conteudos.POO;

public class Cliente {
    String nome;
    Double limiteCredito = 100.0; //Atribuido na hora da criação para todos os clientes

    //Construtor para dizer que necessariamente precisa de alguns dados
    //nem todos atributos precisam ser informado no começo
    public Cliente(String nome){
        this.nome = nome; //sombreamento de parametros
    }

    public void solicitarLimiteCredito(Double valorSolicitado){
        this.limiteCredito = valorSolicitado;
    }

    public void comprar(Double valorProduto){
        this.limiteCredito = limiteCredito - valorProduto;
    }
}
