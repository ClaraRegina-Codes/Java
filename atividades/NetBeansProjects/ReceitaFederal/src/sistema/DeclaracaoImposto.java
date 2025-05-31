package sistema;
public abstract class DeclaracaoImposto {
    private int numero;
    private int ano;
    protected static double valorDeclarado;
    private Pagamento pagamento;
    private Bens bens;
    private Deducao deducao;

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

    public double getValorDeclarado() {
        return valorDeclarado;
    }

    public void setValorDeclarado(double valorDeclarado) {
        this.valorDeclarado = valorDeclarado;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Bens getBens() {
        return bens;
    }

    public void setBens(Bens bens) {
        this.bens = bens;
    }

    public Deducao getDeducao() {
        return deducao;
    }

    public void setDeducao(Deducao deducao) {
        this.deducao = deducao;
    }
    public DeclaracaoImposto(int ano, int numero, double valorDeclarado, Deducao deducao, Bens bens, Pagamento pagamento){
       this.ano=ano;
       this.bens=bens;
       this.deducao=deducao;
       this.numero=numero;
       this.pagamento=pagamento;
       this.valorDeclarado=valorDeclarado;
    }
    public abstract String toString();
    
}
