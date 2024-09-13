
public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }

    @Override
    public void sacar(double valor) {

        if (saldo < valor) {
            saldo -= valor;
            System.out.println("O saque foi realizado, mas você entrou no cheque especial, seu saldo é: R$" + saldo);
        }else{
            saldo -= valor;
        }
    }
}
