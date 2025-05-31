package shopping;
public class Box {
    private int numero;
    private String descricao;
    private Produto produto;
    private Locatario locatario;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Locatario getLocatario() {
        return locatario;
    }

    public void setLocatario(Locatario locatario) {
        this.locatario = locatario;
    }
    public Box(String descricao, int numero, Produto produto, Locatario locatario){
        this.descricao=descricao;
        this.locatario=locatario;
        this.numero=numero;
        this.produto=produto;
    }
    public String toString(){
        return"\n Descrição: "+getDescricao()+
              "\n Número: "+getNumero()+
              "\n\n Locatário do box: "+getLocatario()+
              "\n\n Produto do box: "+getProduto();
    }
    
}
