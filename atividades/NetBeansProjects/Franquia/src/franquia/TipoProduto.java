package franquia;
public class TipoProduto {
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public TipoProduto(String descricao){
        this.descricao=descricao;
    }
    public String toString(){
        return"\n descrição: "+getDescricao();
    }
                
}
