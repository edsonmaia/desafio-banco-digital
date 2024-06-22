public class ContaPoupanca extends Conta {

    private double taxaDeRendimento;

    public ContaPoupanca(int numeroConta, Cliente cliente, double taxaDeRendimento) {
        super(numeroConta, cliente);
        this.taxaDeRendimento = taxaDeRendimento;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        }
    }

    public double getSaldoComRendimento() {
        double saldoComJuros = saldo + (saldo * taxaDeRendimento);
        return saldoComJuros;
    }

    @Override
    public String toString() {
        return "\nConta: " + getNumeroConta() + "\n" +
               "Saldo: R$ " + String.format("%.2f", getSaldo()) + "\n" +
               "Saldo com rendimento: R$ " + String.format("%.2f", getSaldoComRendimento()) + "\n" +
               "Cliente: " + getCliente().getNome() + "\n";
    }

}
