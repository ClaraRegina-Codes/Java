package livraria;
public class Editora {
    private String nome;
    private String codigo;
    private Endereco endereco;

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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Editora (String nome, String codigo, Endereco endereco){
        this.nome=nome;
        this.codigo=codigo;
        this.endereco=endereco;
    }
    public String toString(){
        return"\nnome da editora: "+getNome()+
               "\ncódigo da editora: "+getCodigo()+
               "\nEndereço da editora: "+getEndereco();
    }
}
