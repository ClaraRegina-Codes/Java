package faculdade;
public class GradeCurricular {
    private String hora;
    private String diaSemana;

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }
    public GradeCurricular(String hora, String diaSemana){
        this.hora=hora;
        this.diaSemana=diaSemana;
    }
    public String toString(){
        return"\n Dia da semana: "+getDiaSemana()+
              "\n Horário: "+getHora();
    }
}
