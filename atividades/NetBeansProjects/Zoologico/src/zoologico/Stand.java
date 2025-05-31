package zoologico;
public class Stand {
    private String nome;
    private int numero;
    private Produto produto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public Stand(String nome, int numero, Produto produto){
        this.nome=nome;
        this.numero=numero;
        this.produto=produto;
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n Número: "+getNumero()+
              "\n Produto: "+getProduto();
    }
}
