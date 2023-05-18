package bancobrasil;

public class Conta_bancaria {

    //atributos da classe//
    String agencia;
    String conta;
    double saldo;
    usuario proprietario;

    //métodos da
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
         }else{
        System.out.println("Fundos insuficientes para realizar a operação");
         }
    }

    String consultar_saldo() {
        //String.format da classe String para utilizar formatação com indicadores %d, %f, %s)
        return String.format("Seu saldo é: R$ %.2f", this.saldo);
    }
}
