package conteudos.JavaBens;

public class Objetos {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();

        felipe.setNome("Felipe Junior");
        felipe.setIdade(-1); //lança uma Exception
        System.out.println(felipe.getNome());
        System.out.println(felipe.getIdade());
    }
}
