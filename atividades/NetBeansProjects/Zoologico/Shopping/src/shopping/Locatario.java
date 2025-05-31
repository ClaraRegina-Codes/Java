package shopping;
public class Locatario {
    private String nome;
    private String codigo;
    private Endereco endereco;
    private Contrato contrato;

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
       public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }
    public Locatario(String nome, String codigo, Endereco endereco, Contrato contrato){
        this.nome=nome;
        this.codigo=codigo;
        this.endereco=endereco;
        this.contrato=contrato;
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n Código: "+getCodigo()+
              "\n Endereço do locatário: "+getEndereco()+
              "\n Contrato do locatário: "+getContrato();  
    }

}
