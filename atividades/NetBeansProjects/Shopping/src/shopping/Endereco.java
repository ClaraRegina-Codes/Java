package shopping;
public class Endereco {
    private String rua;
    private String cep;
    private int numero;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public Endereco(String rua, String cep, int numero){
        this.numero=numero;
        this.cep=cep;
        this.rua=rua;
    }
    public String toString(){
        return"\n Rua: "+getRua()+
              "\n Número: "+getNumero()+
              "\n CEP: "+getCep();
    }
}
