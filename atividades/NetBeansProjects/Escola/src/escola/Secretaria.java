package escola;
public class Secretaria extends Administracao {
    private String documentacao;

    public String getDocumentacao() {
        return documentacao;
    }

    public void setDocumentacao(String documentacao) {
        this.documentacao = documentacao;
    }
    public Secretaria(String nome, String cpf, String endereco, String cargo, Double salario, String descricaoCargo, String documentacao){
        super(nome, cpf, endereco, cargo, salario, descricaoCargo);
        this.documentacao=documentacao;
    }
     public String toString(){
        return "\n nome: "+getNome()+
                "\n CPF: "+getCpf()+
                "\n Endereço: "+getEndereco()+
                "\n Cargo: "+getCargo()+
                "\n Salario: "+getSalario()+
                "\n Descrição do cargo: "+getDescricaoCargo()+
                "\n Documentação: "+getDocumentacao();
    }
}
