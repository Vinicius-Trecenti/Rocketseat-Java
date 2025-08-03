package exercicios;

import java.time.LocalDate;

public class contaCorrente {

    //Seguir as seguintes regras de desenvolvimento:
        //TipoVariavel + nomeVariavel = valorPadrao;
        //TipoRetorno nomeNoInfinitivo (TipoA nome, ) {}

    //Criar uma Classe que simule uma Conta Corrente com os atributos e métodos:
    /*
       Atributos:
            - Numero da conta
            - Numero da agência
            - Nome do cliente
            - Data Nascimento
            - Saldo da conta

       Métodos:
            - Sacar um valo
            - Transferir um valor para outra conta
            - Cancelar uma conta com uma justificativa
            - Consultar o extrato entre duas datas
            - Consultar o saldo atual
     */

    //Atributos
    Integer numero;
    Integer agencia;
    Double saldo;
    String nomeCliente;
    LocalDate dataNascimento;
    boolean status;

    //Métodos
    void transferir(contaCorrente destino, Double valor){

    }

    void sacar(Double valor){

    }

    void cancelar(String justificativa){

    }

    void consultarExtrato(LocalDate dataInicial, LocalDate dataFinal){
        //essa funcao deve retonar um array 
    }

    Double consultarSaldo(){
        return saldo;
    }
}
