package sistema;
public class Fornecedor {
    private String nome;
    private String descricao;
    private Endereco endereco;
    private DoFornecedor doFornecedor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public DoFornecedor getDoFornecedor() {
        return doFornecedor;
    }

    public void setDoFornecedor(DoFornecedor doFornecedor) {
        this.doFornecedor = doFornecedor;
    }
    public Fornecedor(String nome, String descricao, Endereco endereco, DoFornecedor doFornecedor){
        this.descricao=descricao;
        this.doFornecedor=doFornecedor;
        this.endereco=endereco;
        this.nome=nome;
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n Descrição: "+getDescricao()+
              "\n\n  Informações do endereço: "+getEndereco()+
              "\n\n Informações da nota fiscal: "+getDoFornecedor();
    }
}
