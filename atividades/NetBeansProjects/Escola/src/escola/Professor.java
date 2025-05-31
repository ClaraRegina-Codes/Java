package escola;
public class Professor extends Funcionario{
    private String disciplina;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public Professor(String nome, String cpf, String endereco, String cargo, Double salario){
        super(nome, cpf, endereco, cargo,salario);
        this.disciplina=disciplina;
    }
    public String toString(){
        return "\n nome: "+getNome()+
                "\n CPF: "+getCpf()+
                "\n Endereço: "+getEndereco()+
                "\n Cargo: "+getCargo()+
                "\n Salario: "+getSalario();
    }
}
