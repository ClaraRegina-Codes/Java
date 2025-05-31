package shopping;
public class Loja {
    private String descricao;
    private int numero;
    private Atendente atendente;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }
    public Loja (String descricao, int numero, Atendente atendente){
        this.atendente=atendente;
        this.descricao=descricao;
        this.numero=numero;
    }
    public String toString(){
        return"\n Descrição: "+getDescricao()+
              "\n Número: "+getNumero()+
              "\n Atendente: "+getAtendente();
    }
}
