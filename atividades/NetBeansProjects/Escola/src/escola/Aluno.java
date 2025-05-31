package escola;
public class Aluno extends Pessoa{
    private int matricula;
    private String turma;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
    public Aluno(String nome, String cpf, String endereco, int matricula, String turma){
        super(nome,cpf,endereco);
        this.matricula=matricula;
        this.turma=turma;
    }
    public String toString(){
        return "\n nome: "+getNome()+
                "\n CPF: "+getCpf()+
                "\n Endereço: "+getEndereco()+
                "\n Matricula: "+getMatricula()+
                "\n Turma: "+getTurma();
    }
                
}
