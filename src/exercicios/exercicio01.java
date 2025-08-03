package exercicios;

public class exercicio01 {

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
    int numero;
    int agencia;
    String nomeCliente;
    String data      = "28/07/2003";
    Double saldo        = 10000.50;
    String status       = "Ativa";

    public static void main (String[] args ){
        exercicio01 contaCorrente = new exercicio01();

        System.out.println("Saldo: " + "R$" + contaCorrente.consultar());

        contaCorrente.saldo = contaCorrente.sacar(100.00);
        System.out.println("Saldo após sacar: " + "R$" +contaCorrente.consultar());

        contaCorrente.saldo = contaCorrente.transferir(contaCorrente, 0.50);
        System.out.println("Valor com a transferência: " + "R$" + contaCorrente.consultar());

        System.out.println(contaCorrente.cancelar("Inadimplência"));
    }

    //Métodos

    //Sacar um valor
    Double sacar(Double valor){
        if(valor > 0){
            return saldo - valor;
        }
        return saldo;
    }

    //consultar saldo
    Double consultar(){
        return saldo;
    }

    //transferência
    Double transferir(exercicio01 remetente, Double valor){
        if(remetente.saldo >= valor){
            return remetente.saldo - valor;
        }
        return saldo;
    }

    String cancelar(String motivo){
        return status = "Conta cancelada por: " + motivo;
    }

}
