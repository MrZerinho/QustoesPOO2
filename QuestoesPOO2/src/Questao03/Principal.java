package Questao03;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto produto1 = new Produto("Notebook", 3000.0);
        Produto produto2 = new Produto("Smartphone", 2000.0);

        System.out.println("Cadastro de Pessoa:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        Pessoa pessoa = new Pessoa(nome, cpf);

        System.out.println("\nProdutos Disponíveis:");
        System.out.println("1. " + produto1.getNome() + " - R$ " + produto1.getPreco());
        System.out.println("2. " + produto2.getNome() + " - R$ " + produto2.getPreco());
        System.out.print("Escolha o produto (1 ou 2): ");
        int escolha = scanner.nextInt();

        Produto produtoEscolhido = (escolha == 1) ? produto1 : produto2;
        Compra compra = new Compra(pessoa, produtoEscolhido);

        compra.verificarCompra();

        scanner.close();
    }
}
