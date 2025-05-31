package sistema;
public class Medicamento implements PrecoVenda, Icms {
    private String nome;
    private String codigo;
    private double precoFornecedor;
    private Fornecedor fornecedor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecoFornecedor() {
        return precoFornecedor;
    }

    public void setPrecoFornecedor(double precoFornecedor) {
        this.precoFornecedor = precoFornecedor;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    public Medicamento(String nome, String codigo, double precoFornecedor, Fornecedor fornecedor){
        this.codigo=codigo;
        this.fornecedor=fornecedor;
        this.nome=nome;
        this.precoFornecedor=precoFornecedor;
    }
    public double calculaIcms(){
        return(precoFornecedor * ALIQUOTA);
    }
    public double precoFinal(){
        return( precoFornecedor + calculaIcms());
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n Código: "+getCodigo()+
              "\n Cálculo ICMS: "+calculaIcms()+
              "\n Preço final: "+precoFinal()+
              "\n Preço do fornecedor: "+getPrecoFornecedor()+
              "\n\n Informações do fornecedor: "+getFornecedor();
    }
}
