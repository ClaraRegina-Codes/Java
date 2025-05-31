package modeloAbstratoFuncionario;
public class QualidadeTotal extends Curso {
    private String turno;
    private int qtdAula;

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getQtdAula() {
        return qtdAula;
    }

    public void setQtdAula(int qtdAula) {
        this.qtdAula = qtdAula;
    }
    public QualidadeTotal(int codigo, String nome, Double valorHoraAula, Professor professor, String turno, int qtdAula){
        super(codigo, nome, valorHoraAula, professor);
        this.qtdAula=qtdAula;
        this.turno=turno;
    }
    
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n Código: "+getCodigo()+
              "\n Turno: "+getTurno()+
              "\n Quantidade de aulas: "+getQtdAula()+
              "\n Valor de horas de aulas: "+getValorHoraAula()+
              "\n\n Dados do professor: "+getProfessor();
}
    public Double valorTotalDoCurso(){
        return(qtdAula*valorHoraAula);
    }
    
}
