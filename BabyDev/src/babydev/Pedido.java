package babydev;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Pedido {
    private String numPedido;
    private Date dtCriacao;
    private int quantidade;
    Cliente cliente = new Cliente();
    Produto produto = new Produto();

    public Pedido() {
    }

    public Pedido(String numPedido, Date dtCriacao) {
        this.numPedido = numPedido;
        this.dtCriacao = dtCriacao;
    }

    public String getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(String numPedido) {
        this.numPedido = numPedido;
    }

    public Date getDtCriacao() {
        return dtCriacao;
    }

    public void setDtCriacao(Date dtCriacao) {
        this.dtCriacao = dtCriacao;
    }
    
    public void imprimirInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String notaFiscal = "NOTA FISCAL\n";
        notaFiscal += "--------------------------------------\n";
        notaFiscal += "Data do Pedido: " + sdf.format(dtCriacao) + "\n";
        notaFiscal += "Número do Pedido: " + numPedido + "\n";
        notaFiscal += "Cliente: " + cliente.getNomeCliente() + "\n";
        notaFiscal += "Endereço: " + cliente.getEndereco() + "\n";
        notaFiscal += "Produto: " + produto.getNome() + "\n";
        notaFiscal += "Valor Unitário: " + produto.getValor() + "\n";
        notaFiscal += "Quantidade: " + quantidade + "\n";
        notaFiscal += "Valor Total: " + calcularValorTotal() + "\n";
        notaFiscal += "--------------------------------------\n";

    }

    private double calcularValorTotal() {
        return (produto.getValor() * produto.getValor());
    }
                
}
