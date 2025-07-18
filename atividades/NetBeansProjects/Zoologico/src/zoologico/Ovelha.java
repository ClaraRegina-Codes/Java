package zoologico;
public class Ovelha {
    private String cor;
    private String sexo;
    private String raca;
    private Racao racao;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Racao getRacao() {
        return racao;
    }

    public void setRacao(Racao racao) {
        this.racao = racao;
    }
    public Ovelha (String raca, String cor, String sexo, Racao racao){
        this.cor=cor;
        this.raca=raca;
        this.sexo=sexo;
        this.racao=racao;
    }
    public String toString(){
        return"\n Raça: "+getRaca()+
              "\n Cor: "+getCor()+
              "\n Sexo: "+getSexo()+
              "\n Ração: "+getRacao();
    }
}
