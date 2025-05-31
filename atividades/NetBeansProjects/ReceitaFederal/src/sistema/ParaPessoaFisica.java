package sistema;
public class ParaPessoaFisica extends DeclaracaoImposto{
    private double multa;
    private Dependente dependente;

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public Dependente getDependente() {
        return dependente;
    }

    public void setDependente(Dependente dependente) {
        this.dependente = dependente;
    }
    public ParaPessoaFisica(int ano, int numero, double valorDeclarado, Deducao deducao, Bens bens, Pagamento pagamento, double multa, Dependente dependente){
        super(ano, numero, valorDeclarado, deducao, bens, pagamento);
        this.dependente=dependente;
        this.multa=multa;
    }
    public static double calculaParcial(){
        return(valorDeclarado+Bens.valor+Bens.Tarifacao());
    }
    public static double calculaDesconto(){
        return(valorDeclarado-Pagamento.CalculaTaxa()-Deducao.CalculaDeducao());
    }
    public static double calculaImpostoPessoaFisica(){
        return(valorDeclarado+calculaParcial()-calculaDesconto());
    }
    public String toString(){
        return"\n Ano: "+getAno()+
              "\n Número: "+getNumero()+
              "\n Valor declarado: "+getValorDeclarado()+
              "\n Multa: "+getMulta()+
              "\n\n Informações de dependente: "+getDependente()+
              "\n\n Informações da dedução: "+getDeducao()+
              "\n\n Informações de bens: "+getBens()+
              "\n\n Informações de pagamento: "+getPagamento();
              
    }
}
