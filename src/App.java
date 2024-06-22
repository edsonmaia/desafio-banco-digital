public class App {
    public static void main(String[] args) throws Exception {

        // criacao dos objetos
        Banco meuBanco = new Banco("Maia Digital Bank");
        System.out.println(meuBanco.getNome());

        Cliente cliente1 = new Cliente("Edson Maia", "12345678900", "Av. da Cidade, 100 - Central");
        Cliente cliente2 = new Cliente("Maria Maia", "32165497800", "Av. da Cidade, 150 - Central");

        ContaCorrente conta1 = new ContaCorrente(1, cliente1);
        ContaPoupanca conta2 = new ContaPoupanca(2, cliente2, 0.05);

        conta1.depositar(150);
        conta2.depositar(100);
        
        conta1.sacar(40);
        
        meuBanco.adicionarConta(conta1);
        meuBanco.adicionarConta(conta2);

        System.out.println("Seja bem-vindo(a) " + cliente1.getNome());

        System.out.println(conta1.toString());
        System.out.println(conta2.toString());
        
        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());

        System.out.println("Contas " + meuBanco.getContas());

        System.out.println("Saldo com rendimento " + conta2.getSaldoComRendimento());

    }
}
