package biblioteca;
public class Drama extends Livro{
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Drama(String nome, Autor autor, Editora editora, String descricao){
        super(nome, autor, editora);
        this.descricao=descricao;
    }
     public String toString(){
        return"\n\n Informações do livro: "+
              "\n Nome: "+getNome()+
              "\n Descrição: "+getDescricao()+
              "\n\n Informações do autor: "+getAutor()+
              "\n\n Informações da editora: "+getEditora();
    }

}
