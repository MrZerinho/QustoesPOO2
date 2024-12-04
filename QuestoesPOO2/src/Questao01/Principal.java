package Questao01;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> listaAlunos = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Cadastro do aluno " + (i + 1) + ":");
            System.out.print("Matrícula: ");
            int matricula = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Nota 1: ");
            double nota1 = scanner.nextDouble();
            System.out.print("Nota 2: ");
            double nota2 = scanner.nextDouble();

            Aluno aluno = new Aluno(matricula, nome, nota1, nota2);
            listaAlunos.add(aluno);
        }

        System.out.println("\nSituação dos alunos:");
        for (Aluno aluno : listaAlunos) {
            System.out.printf("%s: %s (Média: %.2f)\n", aluno.getNome(), aluno.getSituacao(), aluno.calcularMedia());
        }

        scanner.close();
    }
}
