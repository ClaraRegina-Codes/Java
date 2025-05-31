package faculdade;
public class Aluno {
    private String nome;
    private int matricula;
    private Endereco endereco;
    private Curso curso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public Aluno(String nome, int matricula, Endereco endereco, Curso curso){
        this.curso=curso;
        this.endereco=endereco;
        this.matricula=matricula;
        this.nome=nome;
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n Matrícula: "+getMatricula()+
              "\n Endereço: "+getEndereco()+
              "\n Curso: "+getCurso();  
    }
    
}
