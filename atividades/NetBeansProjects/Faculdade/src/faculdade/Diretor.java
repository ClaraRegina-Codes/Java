package faculdade;
public class Diretor extends Funcionario{
    private String descricao;
    private String diploma;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDiploma() {
        return diploma;
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma;
    }
    public Diretor(String nome, String cnpj, Salario salario, Endereco endereco, String descricao, String diploma){
        super(nome, cnpj, salario, endereco);
        this.descricao=descricao;
        this.diploma=diploma;
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n CNPJ: "+getCnpj()+
              "\n Descrição: "+getDescricao()+
              "\n Diploma: "+getDiploma()+
              "\n Salário: "+getSalario()+
              "\n Endereço: "+getEndereco();
    }
}
