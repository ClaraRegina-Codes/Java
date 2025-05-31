package sistema;
public class Professor {
    private String matr;
    private String nome; 
    private Endereco endereco;
    private Aluno aluno;

    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    public Professor(String nome, String matr, Endereco endereco, Aluno aluno){
        this.aluno=aluno;
        this.endereco=endereco;
        this.matr=matr;
        this.nome=nome;
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n Matrícula: "+getMatr()+
              "\n\n Endereço do professor: "+getEndereco()+
              "\n\n Informações do aluno: "+getAluno();
    }
}
