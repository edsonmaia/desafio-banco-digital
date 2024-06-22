public abstract class Conta {

    private int numeroConta;
    protected double saldo;
    private Cliente cliente;

    public Conta(int numeroConta, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.saldo = 0;
        this.cliente = cliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public abstract void sacar(double valor);

    @Override
    public String toString() {
        return "\nConta: " + getNumeroConta() + "\n" +
               "Saldo: R$ " + String.format("%.2f", getSaldo()) + "\n" +
               "Cliente: " + getCliente().getNome() + "\n";
    }
    
}
