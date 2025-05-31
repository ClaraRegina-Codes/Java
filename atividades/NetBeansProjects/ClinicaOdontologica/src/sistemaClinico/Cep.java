package sistemaClinico;
public class Cep {
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public Cep(int numero){
        this.numero=numero;
    }
    public String toString(){
        return"\n Número: "+getNumero();
    }
}
