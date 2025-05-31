package modeloAbstratoFuncionario;
public abstract class Curso {
    protected int codigo;
    protected String nome;
    protected Double valorHoraAula;
    protected Professor professor;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(Double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public Curso(int codigo, String nome, Double valorHoraAula, Professor professor){
        this.codigo=codigo;
        this.nome=nome;
        this.professor=professor;
        this.valorHoraAula=valorHoraAula;
    }
    public abstract String toString();
    public abstract Double valorTotalDoCurso();
    
}
