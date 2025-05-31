package sistema;
public class Marca {
    private String cnpj;
    private String nome;
    private String modelo;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Marca(String cnpj, String nome, String modelo){
        this.cnpj=cnpj;
        this.nome=nome;
        this.modelo=modelo;
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n CNPJ: "+getCnpj()+
              "\n Modelo: "+getModelo();
    }
}
