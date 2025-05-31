package sistema;
public abstract class Veiculo {
    private int ano;
    private String cor;
    private String placa; 
    private Double preco;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

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

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public Veiculo(int ano, String cor, String placa, Double preco){
        this.ano=ano;
        this.cor=cor;
        this.placa=placa;
        this.preco=preco;
    }
    public abstract String toString();
}
