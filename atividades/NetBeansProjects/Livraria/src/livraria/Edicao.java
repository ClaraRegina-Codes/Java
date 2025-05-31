package livraria;
public class Edicao {
    private int numero;
    private int ano;
    private Patrocinador patrocinador;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Patrocinador getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(Patrocinador patrocinador) {
        this.patrocinador = patrocinador;
    }
    public Edicao(int ano, int numero, Patrocinador patrocinador){
        this.ano=ano;
        this.numero=numero;
        this.patrocinador=patrocinador;
    }
    public String toString(){
        return"\nAno da edição: "+getAno()+
              "\nNúmero da edição: "+getNumero()+
              "\nPatrocinador: "+getPatrocinador();
    }
}
