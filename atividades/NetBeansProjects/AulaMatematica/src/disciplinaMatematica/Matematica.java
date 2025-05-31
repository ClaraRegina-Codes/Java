package disciplinaMatematica;
public class Matematica extends Disciplina{
    private double cargaHoraria;
    private AplicacaoPratica aplicacaoPratica;

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public AplicacaoPratica getAplicacaoPratica() {
        return aplicacaoPratica;
    }

    public void setAplicacaoPratica(AplicacaoPratica aplicacaoPratica) {
        this.aplicacaoPratica = aplicacaoPratica;
    }
    public Matematica(String nome, double cargaHoraria, AplicacaoPratica aplicacaoPratica){
        super(nome);
        this.aplicacaoPratica=aplicacaoPratica;
        this.cargaHoraria=cargaHoraria;
    }
    public String toString(){
        return"\n Carga Horária: "+getCargaHoraria()+
              "\n\n Informações de aplicação prática: "+getAplicacaoPratica();
    }
}
