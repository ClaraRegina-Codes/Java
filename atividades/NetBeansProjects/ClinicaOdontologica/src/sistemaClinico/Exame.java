package sistemaClinico;
public class Exame {
    private String nome;
    private int codigo;
    private Agendamento agendamento;
    private Consultorio consultorio;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
    public Exame(String nome, int codigo, Agendamento agendamento, Consultorio consultorio){
        this.nome=nome;
        this.codigo=codigo;
        this.agendamento=agendamento;
        this.consultorio=consultorio;
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n Código: "+getCodigo()+
              "\n Agendamento do exame: "+getAgendamento()+
              "\n Consultório: "+getConsultorio();
    }
}
