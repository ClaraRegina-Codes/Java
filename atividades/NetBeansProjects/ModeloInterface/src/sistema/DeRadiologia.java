package sistema;
public class DeRadiologia extends Curso {
     private String disciplina;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public DeRadiologia(String tipo, int cargaHoraria, Double nota1, Double nota2, Double nota3, String disciplina){
        super(tipo, cargaHoraria, nota1, nota2, nota3);
        this.disciplina=disciplina;
    }
    public String toString(){
        return"\n Tipo: "+getTipo()+
              "\n Carga horária: "+getCargaHoraria()+
              "\n Disciplina: "+getDisciplina()+
              "\n Nota 1: "+getNota1()+
              "\n Nota 2: "+getNota2()+
              "\n Nota 3: "+getNota3();
    } 
}
