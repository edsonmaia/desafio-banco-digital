public class ContaCorrente extends Conta {

    public ContaCorrente(int numeroConta, Cliente cliente) {
        super(numeroConta, cliente);
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        }
    }

}
