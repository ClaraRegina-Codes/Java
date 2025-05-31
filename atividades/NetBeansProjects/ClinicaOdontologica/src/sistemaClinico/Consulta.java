package sistemaClinico;
public class Consulta {
    private String descricao;
    private Agendamento agendamento;
    private Consultorio consultorio;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Agendamento getAgendamento() {
        return agendamento;
    }

    public void setAgendamento(Agendamento agendamento) {
        this.agendamento = agendamento;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }
    public Consulta(String descricao, Agendamento agendamento, Consultorio consultorio){
        this.descricao=descricao;
        this.agendamento=agendamento;
        this.consultorio=consultorio;
    }
    public String toString(){
        return"\n Descrição da consulta: "+getDescricao()+
              "\n Agendamento da consulta: "+getAgendamento()+
              "\n Consultório: "+getConsultorio();
    }
}
