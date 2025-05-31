package sistema;
public abstract class Veiculo {
    protected String cor;
    protected String placa;
    protected int ano;
    protected double preco;
    protected Proprietario proprietario;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setPropritario(Proprietario proprietario) {
        this.proprietario=proprietario;
    }
    public Veiculo(String placa, String cor, int ano, double preco, Proprietario proprietario){
        this.ano=ano;
        this.cor=cor;
        this.placa=placa;
        this.preco=preco;
        this.proprietario=proprietario;
    }
    public abstract double ipva();
    public abstract double seguro();
    public abstract String toString();
    
}
