package modeloAbstratoFuncionario;
public class Empresa {
    private String nome;
    private String cnpj;

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
    public Empresa(String nome, String cnpj){
        this.cnpj=cnpj;
        this.nome=nome;
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n CNPJ: "+getCnpj();
    }
}
