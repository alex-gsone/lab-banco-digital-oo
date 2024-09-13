
public class Main {

    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.transferir(200, poupanca);
        
//      tentando sacar mais dinheiro do que há na conta poupança:
        poupanca.sacar(300);
        
/*      tentando sacar mais dinheiro do que há na conta corrente,
        o cliente entra no cheque especial: */
        cc.sacar(500);
        
        cc.transferir(200, poupanca);
        
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
