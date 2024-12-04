package Questao03;
public class Compra {
    private Pessoa pessoa;
    private Produto produto;

    public Compra(Pessoa pessoa, Produto produto) {
        this.pessoa = pessoa;
        this.produto = produto;
    }

    public void verificarCompra() {
        System.out.printf("Compra realizada com sucesso!\nCliente: %s\nProduto: %s\n", 
                          pessoa.getNome(), produto.getNome());
    }
}
