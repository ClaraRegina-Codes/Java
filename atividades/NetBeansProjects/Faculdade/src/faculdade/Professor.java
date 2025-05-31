package faculdade;
public class Professor extends Funcionario{
    private String descricao;
    private Disciplina disciplina;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    public Professor(String nome, String cnpj, Salario salario, Endereco endereco, String descricao, Disciplina disciplina){
        super(nome, cnpj, salario, endereco);
        this.descricao=descricao;
        this.disciplina=disciplina;
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n CNPJ: "+getCnpj()+
              "\n Descrição: "+getDescricao()+
              "\n Disciplina: "+getDisciplina()+
              "\n Salário: "+getSalario()+
              "\n Endereço: "+getEndereco();
    }
}
