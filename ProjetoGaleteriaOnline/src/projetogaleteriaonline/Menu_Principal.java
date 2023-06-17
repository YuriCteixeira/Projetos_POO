package projetogaleteriaonline;

public class Menu_Principal {

    public static void main(String[] args) {
        // Criando objetos
        Cliente cliente = new Cliente("Yuri", "Rua 3", "cliente@pedido.com", "123456789", "yuri03", "123456");
        Funcionario funcionario = new Funcionario("funcionario", "456789");
        Produto produto = new Produto("001", "Frango Assado", 25);
        ItensPedido itensPedido = new ItensPedido(produto, 2);
        Pedido pedido = new Pedido("001", itensPedido, 50, null, cliente);
        Entrega entrega = new Entrega("001", funcionario, pedido, null, null, "Rua 3");

        // Exemplo de uso
        cliente.cadastrar();
        cliente.fazerLogin();
        cliente.consultarMenu();
        cliente.avaliar();
        String reclamacao = cliente.reclamar();
        cliente.cadastrarCartao();
        cliente.efetuarPagamento();

        funcionario.fazerLogin();
        funcionario.atenderReclamacoes();

        entrega.entregarPedido();

        produto.informarProduto();
        produto.atualizarProduto();

    }
}
