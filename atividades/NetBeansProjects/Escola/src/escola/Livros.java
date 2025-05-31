package escola;
public class Livros extends Materiais{
    private String disciplina;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public Livros(String nome, String cpf, String endereco, int investimento, String material, int quantidade, String disciplina){
        super(nome,cpf,endereco, investimento,material, quantidade);
        this.disciplina=disciplina;
    }
    public String toString(){
        return "\n Nome: "+getNome()+
                "\n CPF: "+getCpf()+
                "\n Endereço: "+getEndereco()+
                "\n Investimento: "+getInvestimento()+
                "\n Material: "+getMaterial()+
                "\n Quantidade: "+getQuantidade()+
                "\n Disciplina: "+getDisciplina();
    }
}
