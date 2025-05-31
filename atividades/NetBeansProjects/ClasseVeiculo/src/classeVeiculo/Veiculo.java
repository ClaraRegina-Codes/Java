package classeVeiculo;
public abstract class Veiculo {
    protected String placa;
    protected String cor;
    protected int ano;
    protected Double preco;
    protected Proprietario proprietario;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }
    public Veiculo(String cor, String placa, int ano, Double preco, Proprietario proprietario){
        this.ano=ano;
        this.cor=cor;
        this.placa=placa;
        this.preco=preco;
        this.proprietario=proprietario;
    }
    public abstract String toString();
    public abstract Double ipva();
    public abstract Double seguro();
}
