package modeloAbstratoFuncionario;
public class AtendimentoEficaz extends Curso{
    private int qtdAula;
    private int qtdProfessor;
    private int duracaoMeses;

    public int getQtdAula() {
        return qtdAula;
    }

    public void setQtdAula(int qtdAula) {
        this.qtdAula = qtdAula;
    }

    public int getQtdProfessor() {
        return qtdProfessor;
    }

    public void setQtdProfessor(int qtdProfessor) {
        this.qtdProfessor = qtdProfessor;
    }

    public int getDuracaoMeses() {
        return duracaoMeses;
    }

    public void setDuracaoMeses(int duracaoMeses) {
        this.duracaoMeses = duracaoMeses;
    }
    public AtendimentoEficaz(int codigo, String nome, Double valorHoraAula, Professor professor, int qtdAula, int duracaoMeses, int qtdProfessor){
        super(codigo, nome, valorHoraAula, professor);
        this.qtdAula=qtdAula;
        this.qtdProfessor=qtdProfessor;
        this.duracaoMeses=duracaoMeses;
    }
        public String toString(){
        return"\n Nome: "+getNome()+
              "\n Código: "+getCodigo()+
              "\n Quantidade de professores: "+getQtdProfessor()+
              "\n Duração em meses: "+getDuracaoMeses()+
              "\n Quantidade de aulas: "+getQtdAula()+
              "\n Valor de horas de aulas: "+getValorHoraAula()+
              "\n\n Dados do professor: "+getProfessor();
}
    public Double valorTotalDoCurso(){
        return(qtdAula*valorHoraAula);
    }
}
