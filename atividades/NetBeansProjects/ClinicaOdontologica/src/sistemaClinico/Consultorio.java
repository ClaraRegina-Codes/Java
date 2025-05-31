package sistemaClinico;
public class Consultorio {
    private int sala;

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }
    public Consultorio(int sala){
        this.sala=sala;
    }
    public String toString(){
        return"\n Sala: "+getSala();
    }
}
