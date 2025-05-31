package exemploClasseAbstrataPessoa;
public class Filiacao {
    private String nomePai;
    private String nomeMae;

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }
    public Filiacao (String nomePai, String nomeMae){
        this.nomeMae=nomeMae;
        this.nomePai=nomePai;
    }
    public String toString(){
        return"\n Nome da mãe: "+getNomeMae()+
              "\n Nome do pai: "+getNomePai();
    }
}
