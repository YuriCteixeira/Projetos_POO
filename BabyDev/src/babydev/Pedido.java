package babydev;

import java.util.Date;


public class Pedido {
    private String numPedido;
    private Date dtCriacao;

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
    
    
    
    
//    //Métodos
//    public String imprimirInfo(){
//        return String.format("", args)
//    }
}
