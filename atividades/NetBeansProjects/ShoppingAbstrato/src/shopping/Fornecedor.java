package shopping;
public class Fornecedor {
    private String nome;
    private String cnpj;
    protected static double taxaDesconto;
    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getTaxaDesconto() {
        return taxaDesconto;
    }

    public void setTaxaDesconto(double taxaDesconto) {
        this.taxaDesconto = taxaDesconto;
    }
    
     public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public Fornecedor(String nome, String cnpj, double taxaDesconto, Endereco endereco){
        this.cnpj=cnpj;
        this.nome=nome;
        this.taxaDesconto=taxaDesconto;
        this.endereco=endereco;
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n CNPJ: "+getCnpj()+
              "\n Taxa de desconto: "+getTaxaDesconto()+
              "\n Preço básico: "+calculaPrecoBasico()+
              "\\n\n Informações do Endereço do fornecedor: "+getEndereco();
    }
    public static double calculaPrecoBasico(){
        return Produto.calculaPrecoFinal()-taxaDesconto;
    }
}
