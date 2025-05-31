package faculdade;
public class Endereco {
    private String rua;
    private Cep cep;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Cep getCep() {
        return cep;
    }

    public void setCep(Cep cep) {
        this.cep = cep;
    }
    public Endereco(String rua, Cep cep){
        this.rua=rua;
        this.cep=cep;
    }
    public String toString(){
        return"\n Rua: "+getRua()+
              "\n CEP: "+getCep();
    }
}
