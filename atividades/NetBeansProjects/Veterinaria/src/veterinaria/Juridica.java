package veterinaria;
public class Juridica extends Pessoa{
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public Juridica(String nome, Telefone telefone, String cnpj){
        super(nome, telefone);
        this.cnpj=cnpj;
        
    }
     public String toString(){
        return"\n Informações da pessoa Jurídica: "+
              "\n Nome: "+getNome()+
              "\n CNPJ: "+getCnpj()+
              "\n Informações de contato: "+getTelefone();
    }
}
