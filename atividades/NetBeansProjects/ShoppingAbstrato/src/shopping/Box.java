package shopping;
public class Box {
    private int numero;
    private String descricao;
    protected static double valorAluguel;
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

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
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
    public Box(String descricao, int numero, double valorAluguel, Produto produto, Locatario locatario){
        this.descricao=descricao;
        this.locatario=locatario;
        this.numero=numero;
        this.produto=produto;
    }
    public static double calculaDesconto(){
        return(valorAluguel*0.01);
    }
    public static double calculaValorFinal(){
        return(valorAluguel-calculaDesconto());
    }
}
