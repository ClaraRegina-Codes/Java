package biblioteca;
public class Suspense extends Livro{
    private int qtdePaginas;

    public int getQtdePaginas() {
        return qtdePaginas;
    }

    public void setQtdePaginas(int qtdePaginas) {
        this.qtdePaginas = qtdePaginas;
    }
    public Suspense(String nome, Autor autor, Editora editora, int qtdePaginas){
        super(nome,autor,editora);
        this.qtdePaginas=qtdePaginas;
    }
   public String toString(){
        return"\n\n Informações do livro: "+
              "\n Nome: "+getNome()+
              "\n Quantidade de páginas: "+getQtdePaginas()+
              "\n\n Informações do autor: "+getAutor()+
              "\n\n Informações da editora: "+getEditora();
    }
}
