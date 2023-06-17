package projetogaleteriaonline;

public class Produto {

    public String idProduto;
    public String nome;
    public double valorUnitario;

    public Produto() {
    }

    public Produto(String idProduto, String nome, double valorUnitario) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.valorUnitario = valorUnitario;
    }

    public String getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public void informarProduto() {

    }

    public void atualizarProduto() {

    }
}
