package Questao04;

public class Principal {
    public static void main(String[] args) {
        Pessoa jogador1 = new Pessoa("João");
        Pessoa jogador2 = new Pessoa("Maria");

        int pontosJogador1 = 0;
        int pontosJogador2 = 0;

        for (int rodada = 1; rodada <= 7; rodada++) {
            System.out.println("\nRodada " + rodada);

            int resultado1 = jogador1.jogarDados();
            int resultado2 = jogador2.jogarDados();

            System.out.println(jogador1.getNome() + " tirou: " + resultado1);
            System.out.println(jogador2.getNome() + " tirou: " + resultado2);

            if (resultado1 > resultado2) {
                System.out.println(jogador1.getNome() + " venceu a rodada!");
                pontosJogador1++;
            } else if (resultado2 > resultado1) {
                System.out.println(jogador2.getNome() + " venceu a rodada!");
                pontosJogador2++;
            } else {
                System.out.println("Empate na rodada!");
            }
        }

        System.out.println("\nResultado Final:");
        if (pontosJogador1 > pontosJogador2) {
            System.out.println("Vencedor: " + jogador1.getNome());
        } else if (pontosJogador2 > pontosJogador1) {
            System.out.println("Vencedor: " + jogador2.getNome());
        } else {
            System.out.println("O jogo terminou empatado!");
        }
    }
}
