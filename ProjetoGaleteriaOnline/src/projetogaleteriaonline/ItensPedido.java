package projetogaleteriaonline;

public class ItensPedido {

    private Produto produto;
    private int qtde;

    public ItensPedido() {
    }

    public ItensPedido(Produto produto, int qtde) {
        this.produto = produto;
        this.qtde = qtde;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

}
