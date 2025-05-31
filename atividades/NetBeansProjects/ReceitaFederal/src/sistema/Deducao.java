package sistema;
public class Deducao {
    private int codigo;
    private String descricao;
    protected static double valor;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public Deducao(int codigo, String descricao, double valor){
        this.codigo=codigo;
        this.descricao=descricao;
        this.valor=valor;
    }
    public static double CalculaDeducao(){
        return (valor*0.012);
    }
    public String toString(){
        return"\n Descrição: "+getDescricao()+
              "\n Código: "+getCodigo()+
              "\n Valor: "+getValor()+
              "\n Cálculo da dedução: "+CalculaDeducao();
    }
}
