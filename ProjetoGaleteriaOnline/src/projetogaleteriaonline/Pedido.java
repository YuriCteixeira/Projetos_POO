package projetogaleteriaonline;

public class Pedido {

    private String numPedido;
    private ItensPedido itensPedido;
    private double valorTotal;
    private Entrega entrega;
    private Cliente cliente;

    private void processarPagamento() {

    }

    public Pedido(String numPedido, ItensPedido itensPedido, double valorTotal, Entrega entrega, Cliente cliente) {
        this.numPedido = numPedido;
        this.itensPedido = itensPedido;
        this.valorTotal = valorTotal;
        this.entrega = entrega;
        this.cliente = cliente;
    }

    public void calcularValorTotal() {

    }
}
