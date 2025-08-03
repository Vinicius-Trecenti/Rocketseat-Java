package conteudos.operadores;

public class logicos {

    public static void main(String[] args) {
        /*Operadores logicos para verificação de expressões */
        // && para E
        // || para OU

        boolean condicaoT = true;
        boolean condicaoF = false;

        if(condicaoT && condicaoF){
            System.out.println("Os dois valores precisam ser verdadeiros");
        }

        if(condicaoT || condicaoF){
            System.out.println("Apenas um valor precisa ser verdadeiro");
        }

        if(1==1 && 2<3){
            System.out.println("Os dois precisam ser verdadeiros");
        }
    }
}
