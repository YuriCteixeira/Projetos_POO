package projetogaleteriaonline;

import java.sql.Time;
import java.util.Date;

public class Entrega {

    private String numEntrega;
    private Funcionario funcionario;
    private Pedido pedido;
    private Date dataEntrega;
    private Time horaEntrega;
    private String endereco;

    public Entrega() {
    }

    public Entrega(String numEntrega, Funcionario funcionario, Pedido pedido, Date dataEntrega, Time horaEntrega, String endereco) {
        this.numEntrega = numEntrega;
        this.funcionario = funcionario;
        this.pedido = pedido;
        this.dataEntrega = dataEntrega;
        this.horaEntrega = horaEntrega;
        this.endereco = endereco;
    }

    public String getNumEntrega() {
        return numEntrega;
    }

    public void setNumEntrega(String numEntrega) {
        this.numEntrega = numEntrega;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Time getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(Time horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void entregarPedido() {

    }
}
