package associacaoFuncionario;
public class Formacao {
    private String descricao;
    private InstituicaoEnsino instituicaoEnsino;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public InstituicaoEnsino getInstituicaoEnsino() {
        return instituicaoEnsino;
    }

    public void setInstituicaoEnsino(InstituicaoEnsino instituicaoEnsino) {
        this.instituicaoEnsino = instituicaoEnsino;
    }
    public Formacao(String descricao, InstituicaoEnsino instituicaoEnsino){
        this.descricao=descricao;
        this.instituicaoEnsino=instituicaoEnsino;
    }
    public String toString(){
        return"\n Descrição da formação: "+getDescricao()+
              "\n\n Instituição de ensino da formação: "+getInstituicaoEnsino();
    }
}
