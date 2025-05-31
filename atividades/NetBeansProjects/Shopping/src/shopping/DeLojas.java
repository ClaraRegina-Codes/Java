package shopping;
public class DeLojas extends Setor{
    private String descricao;
    private DeUtilidades deUtilidades;
    private DeCalcados deCalcados;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public DeUtilidades getDeUtilidades() {
        return deUtilidades;
    }

    public void setDeUtilidades(DeUtilidades deUtilidades) {
        this.deUtilidades = deUtilidades;
    }

    public DeCalcados getDeCalcados() {
        return deCalcados;
    }

    public void setDeCalcados(DeCalcados deCalcados) {
        this.deCalcados = deCalcados;
    }
    public DeLojas(int numero, String descricao, DeCalcados deCalcados, DeUtilidades deUtilidades){
        super(numero);
        this.deCalcados=deCalcados;
        this.deUtilidades=deUtilidades;
        this.descricao=descricao;
    }
    public String toString(){
        return"\n Número do setor: "+getNumero()+
              "\n\n Lojas de utilidades: "+getDeUtilidades()+
              "\n\n Lojas de calçados: "+getDeCalcados();
    }
}
