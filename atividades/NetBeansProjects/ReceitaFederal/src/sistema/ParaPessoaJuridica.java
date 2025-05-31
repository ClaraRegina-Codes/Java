package sistema;
public class ParaPessoaJuridica extends DeclaracaoImposto{
    private String observacao;

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    public ParaPessoaJuridica(int ano, int numero, double valorDeclarado, Deducao deducao, Bens bens, Pagamento pagamento, String observacao){
        super(ano, numero, valorDeclarado, deducao, bens, pagamento);
        this.observacao=observacao;
    }
    public String toString(){
        return "\n Ano: "+getAno()+
               "\n Número: "+getNumero()+
               "\n Valor declarado: "+getValorDeclarado()+
               "\n Observação: "+getObservacao()+
               "\n Cálculo parcial: "+CalculaParcial()+
               "\n Cálculo de imposto de pessoa jurídica: "+CalculaImpostoPessoaJuridica()+
               "\n\n Informações da dedução: "+getDeducao()+
               "\n\n Informações de pagamento: "+getPagamento()+
               "\n\n Informações de bens: "+getBens();
    }
    public static double CalculaParcial(){
        return(valorDeclarado+(Bens.valor*2)+Bens.Tarifacao());
    }
    public static double CalculaImpostoPessoaJuridica(){
        return(CalculaParcial()- Deducao.CalculaDeducao()+Pagamento.valor+valorDeclarado);
    }
}
