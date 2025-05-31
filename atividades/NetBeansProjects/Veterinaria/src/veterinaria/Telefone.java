package veterinaria;
public class Telefone {
    private String numero;
    private int ddd;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }
    public Telefone(String numero, int ddd){
        this.ddd=ddd;
        this.numero=numero;
    }
    public String toString(){
        return"\n DDD: "+getDdd()+
              "\n Número: "+getNumero();
    }
}
