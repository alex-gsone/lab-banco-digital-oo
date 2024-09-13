
public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupanca ===");
        super.imprimirInfosComuns();
    }

    @Override
    public void sacar(double valor) {

        if (saldo < valor) {
            System.out.println("Erro! saldo insuficiente para realizar o saque solicitado!");
        } else {
            saldo -= valor;
        }
    }
}
