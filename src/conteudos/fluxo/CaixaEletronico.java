package conteudos.fluxo;

public class CaixaEletronico {
    public static void main(String[] args) {
         double saldo = 17.0;
         double valorSolicitado = 17.0;

         if(valorSolicitado <= saldo){
             saldo = saldo - valorSolicitado;
             System.out.println("Saque realizado!");
         }
         else{
             System.out.println("Saldo insuficiente");
         }
        System.out.println("R$"+saldo);
    }
}
