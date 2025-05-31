package shopping;
public class Cliente {
    private String nome;
    private String cpf;
    protected static double tarifa;
    private Endereco endereco;
    private Produto produto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public Cliente(String nome, String cpf, double tarifa, Endereco endereco, Produto produto){
        this.cpf=cpf;
        this.endereco=endereco;
        this.nome=nome;
        this.produto=produto;
        this.tarifa=tarifa;
    }
    public static double calculaPrecoCliente(){
        return(Produto.calculaPrecoFinal()+tarifa);
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n CPF: "+getCpf()+
              "\n Tarifa: "+getTarifa()+
              "\n Preço do cliente: "+calculaPrecoCliente()+
              "\n\n Endereço do cliente: "+getEndereco()+
              "\n\n Produto do cliente: "+getProduto();
    }
}
