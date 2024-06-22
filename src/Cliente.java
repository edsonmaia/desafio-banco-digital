public class Cliente {

    private String nome;
    private String CPF;
    private String endereço;

    public Cliente(String nome, String CPF, String endereço) {
        this.nome = nome;
        this.CPF = CPF;
        this.endereço = endereço;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getEndereco() {
        return endereço;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\n" +
               "CPF: " + getCPF() + "\n" +
               "Endereço: " + getEndereco() + "\n";
    }

}
