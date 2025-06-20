package empresa;
public class Fornecedor extends Pessoa {
    private String cnpj;
    private String pais;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    public Fornecedor(String nome, String endereco, String cnpj, String pais){
        super(nome, endereco);
        this.cnpj=cnpj;
        this.pais=pais;
    }
    public String toString(){
        return"\n nome: "+getNome()+
              "\n endereço: "+getEndereco()+
              "\n país: "+getPais()+
              "\n CNPJ: "+getCnpj();
    }
}
