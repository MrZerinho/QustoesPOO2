package Questao04;

public class Pessoa {
    private String nome;
    private Dado dado6;
    private Dado dado8;

    public Pessoa(String nome) {
        this.nome = nome;
        this.dado6 = new Dado(6);
        this.dado8 = new Dado(8);
    }

    public int jogarDados() {
        return dado6.jogar() + dado8.jogar();
    }

    public String getNome() {
        return nome;
    }
}
