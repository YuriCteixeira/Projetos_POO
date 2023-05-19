package bancobrasil;

public class Conta_bancaria {

    //atributos da classe//
    private String agencia;
    private String conta;
    private double saldo;
    private usuario proprietario;

    //Construtor
    public Conta_bancaria() {
    }

    public Conta_bancaria(String agencia, String conta, double saldo, usuario proprietario) {
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
        this.proprietario = proprietario;
    }

    //Métodos getters e setters
    public String getagencia() {
        return this.agencia;
    }

    public void setagencia(String agencia) {
        this.agencia = agencia;
    }

    public String getconta() {
        return this.conta;
    }

    public void setconta(String conta) {
        this.conta = conta;
    }

    public double getsaldo() {
        return this.saldo;
    }

    public void setsaldo(double saldo) {
        this.saldo = saldo;
    }

    public usuario getproprietario() {
        return this.proprietario;
    }

    public void setproprietario(usuario proprietario) {
        this.proprietario = proprietario;
    }

    //métodos 
    void depositar(double valor) { //Método com parâmetro
        this.saldo += valor;
    }

    void sacar(double valor) {
        if (valor < saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Fundos insuficientes para realizar operação");
        }
    }

    void transferir(Conta_bancaria contabancaria, double valor) {//Método c/ parâmetrothis
        if (valor <= saldo) {
            this.sacar(valor);
            contabancaria.saldo += valor;
        } else {
            System.out.println("Fundos insuficientes para realizar a operação");
        }
    }

    String consultar_saldo() {
        //String.format da classe String para utilizar formatação com indicadores %d, %f, %s)
        return String.format("Seu saldo é: R$ %.2f", this.saldo);
    }
}
