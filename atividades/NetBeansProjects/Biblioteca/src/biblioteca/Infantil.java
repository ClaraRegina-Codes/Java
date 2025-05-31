package biblioteca;
public class Infantil extends Livro{
   private String faixaEtaria;

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }
   public Infantil(String nome, Autor autor, Editora editora, String faixaEtaria){
       super(nome, autor,editora);
       this.faixaEtaria=faixaEtaria;
   }
   public String toString(){
        return"\n\n Informações do livro: "+
              "\n Nome: "+getNome()+
              "\n Faixa Etária: "+getFaixaEtaria()+
              "\n\n Informações do autor: "+getAutor()+
              "\n\n Informações da editora: "+getEditora();
    }
         
}
