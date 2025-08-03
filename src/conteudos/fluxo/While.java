package conteudos.fluxo;

public class While {
    public static void main(String[] args) {
        Double mesada = 50.00;

        while (mesada >= 0){
            double valor = valorAleatorio();
            mesada -= valor;
            System.out.println("Valor retirado: " + valor);
            System.out.println("Ainda resta:" + mesada);
        }
        System.out.println(mesada);
    }

    public static double valorAleatorio(){
        return Math.random() * 100;
    }
}
