package zoologico;
public class Visitante {
    private String nome;
    private Ingresso ingresso;
    private Stand stand;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Ingresso getIngresso() {
        return ingresso;
    }

    public void setIngresso(Ingresso ingresso) {
        this.ingresso = ingresso;
    }

    public Stand getStand() {
        return stand;
    }

    public void setStand(Stand stand) {
        this.stand = stand;
    }
    public Visitante(String nome, Ingresso ingresso, Stand stand){
        this.ingresso=ingresso;
        this.nome=nome;
        this.stand=stand;
    }
    public String toString(){
        return"\n Nome do visitante: "+getNome()+
              "\n Ingresso do visitante: "+getIngresso()+
              "\n Stand: "+getStand();
    }
}
