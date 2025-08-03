package conteudos.JavaBens;

public class Aluno {

    private String nome;
    private Integer idade;

    public String getNome(){
        return this.nome;
    }

    public Integer getIdade(){
        return this.idade;
    }

    public void setIdade(Integer idade){
        if(idade < 0){
            throw new IllegalArgumentException("O valor da idade deve ser maior que 0");
        }
        this.idade = idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
