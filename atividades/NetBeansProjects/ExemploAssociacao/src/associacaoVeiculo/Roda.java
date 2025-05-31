package associacaoVeiculo;
public class Roda {
    private int aro;
    private int qtdParafuso;

    public int getAro() {
        return aro;
    }

    public void setAro(int aro) {
        this.aro = aro;
    }

    public int getQtdParafuso() {
        return qtdParafuso;
    }

    public void setQtdParafuso(int qtdParafuso) {
        this.qtdParafuso = qtdParafuso;
    }
    public Roda(int aro, int qtdParafuso){
        this.aro=aro;
        this.qtdParafuso=qtdParafuso;
    }
    public String toString(){
        return"\n aro: "+getAro()+
              "\n quantidade de parafusos: "+getQtdParafuso();
    }
}
