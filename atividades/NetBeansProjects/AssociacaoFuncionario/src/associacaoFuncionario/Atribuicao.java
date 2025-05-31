package associacaoFuncionario;
public class Atribuicao {
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Atribuicao(String descricao){
        this.descricao=descricao;
    }
    public String toString(){
        return"\n Descrição: "+getDescricao();
    }
}
