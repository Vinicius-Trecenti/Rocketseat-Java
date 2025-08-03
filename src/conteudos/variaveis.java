package conteudos;

public class variaveis {
    public static void main (String[] args){

        //Não é permitido variaveis como:
        // int numero&um = 1;       -> O simbolo & não é permitido
        // int 1numero = 1;         -> Iniciar com um numero não é permitido
        // int numero um = 1;       -> Separação entre palavras não é valido
        // int long = 1;            -> long é uma palavra reservada

        //Porém é possivel:
        int numero$um = 1;
        int numero1 = 1;
        int numeroUm = 1;
        int longo = 1;
    }
}
