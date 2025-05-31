package modeloBanco;
public abstract class Pessoa {
    protected static Double saldo;
    private Double limite;
    protected static Double valorGasto;
    private String nome;
    private String telefone;
    private Endereco endereco;
    private Conta conta;
    private CartaoCredito cartaoCredito;

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public Double getValorGasto() {
        return valorGasto;
    }

    public void setValorGasto(Double valorGasto) {
        this.valorGasto = valorGasto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public CartaoCredito getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(CartaoCredito cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }
    public Pessoa(String nome,String telefone, Double valorGasto, Double limite, Double saldo, Endereco endereco, Conta conta, CartaoCredito cartaoCredito ){
        this.cartaoCredito=cartaoCredito;
        this.conta=conta;
        this.endereco=endereco;
        this.limite=limite;
        this.nome=nome;
        this.saldo=saldo;
        this.telefone=telefone;
        this.valorGasto=valorGasto;
    }
    public abstract String toString();
    
}
