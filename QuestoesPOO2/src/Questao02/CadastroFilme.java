package Questao02;

import java.util.ArrayList;

public class CadastroFilme {
    private static ArrayList<Filme> filmes = new ArrayList<>();
    private static ArrayList<Diretor> diretores = new ArrayList<>();
    private static ArrayList<Ator> atores = new ArrayList<>();

    public static void inicializarDados() {
        Ator ator1 = new Ator("Leonardo DiCaprio", 48, 1);
        Ator atriz1 = new Ator("Kate Winslet", 48, 1);
        atores.add(ator1);
        atores.add(atriz1);

        Diretor diretor1 = new Diretor("James Cameron", true);
        diretores.add(diretor1);

        Filme filme1 = new Filme("Titanic", diretor1, ator1, atriz1);
        filmes.add(filme1);

        diretor1.setPrincipalFilme(filme1);
    }

    public static Filme buscaFilme(String titulo) {
        for (Filme filme : filmes) {
            if (filme.getTitulo().equalsIgnoreCase(titulo)) {
                return filme;
            }
        }
        return null;
    }

    public static boolean insereFilme(Filme filme) {
        for (Filme f : filmes) {
            if (f.getTitulo().equalsIgnoreCase(filme.getTitulo())) {
                return false;
            }
        }
        filmes.add(filme);
        return true;
    }

    public static void buscarDiretoresVencedoresDeOscars() {
        for (Diretor diretor : diretores) {
            if (diretor.isGanhadorOscar() && diretor.getPrincipalFilme() != null) {
                Filme filme = diretor.getPrincipalFilme();
                System.out.printf("Diretor: %s | Filme: %s | Ator Principal: %s | Atriz Principal: %s\n",
                        diretor.getNome(),
                        filme.getTitulo(),
                        filme.getAtorPrincipal().getNome(),
                        filme.getAtrizPrincipal().getNome());
            }
        }
    }
}
