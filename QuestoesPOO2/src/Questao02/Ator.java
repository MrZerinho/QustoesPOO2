package Questao02;

public class Ator {
    private String nome;
    private int idade;
    private int nOscars;

    public Ator(String nome, int idade, int nOscars) {
        this.nome = nome;
        this.idade = idade;
        this.nOscars = nOscars;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getnOscars() {
        return nOscars;
    }

    public void setnOscars(int nOscars) {
        this.nOscars = nOscars;
    }
}
