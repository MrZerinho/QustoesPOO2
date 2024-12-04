package Questao01;
public class Aluno {
    private String nome;
    private double notaBimestre1;
    private double notaBimestre2;
    private int matricula;

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Aluno(int matricula, String nome, double notaBimestre1, double notaBimestre2) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaBimestre1 = notaBimestre1;
        this.notaBimestre2 = notaBimestre2;
    }

    public int getMatricula() {
        return matricula;
    }

    public double calcularMedia() {
        return (notaBimestre1 + notaBimestre2) / 2;
    }

    public String getSituacao() {
        return calcularMedia() >= 6.0 ? "APROVADO" : "REPROVADO";
    }

    public String getNome() {
        return nome;
    }
}
