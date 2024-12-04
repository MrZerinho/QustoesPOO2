package Questao02;

public class Principal {
    public static void main(String[] args) {
        CadastroFilme.inicializarDados();

        Filme novoFilme = CadastroFilme.buscaFilme("Titanic");
        if (novoFilme != null) {
            System.out.println("Filme encontrado: " + novoFilme.getTitulo());
        } else {
            System.out.println("Filme não encontrado.");
        }

        CadastroFilme.buscarDiretoresVencedoresDeOscars();
    }
}
