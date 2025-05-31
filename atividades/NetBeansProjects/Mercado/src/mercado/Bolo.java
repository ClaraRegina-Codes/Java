package mercado;
public class Bolo extends Produto{
    private String nome;
    private Double preco;
    private Double peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
    public Bolo (String dataFabricacao, String dataValidade, int codigo, String nome, Double preco, Double peso){
        super(dataFabricacao, dataValidade, codigo);
        this.nome=nome;
        this.preco=preco;
        this.peso=peso;
    }
    public String toString(){
        return"\n nome: "+getNome()+
                "\n código: "+getCodigo()+
                "\n preço: "+getPreco()+
                "\n peso: "+getPeso()+
                "\n data de fabricação: "+getDataFabricacao()+
                "\n data de validade: "+getDataValidade();
    }
}
