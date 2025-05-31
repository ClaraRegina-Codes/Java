package livraria;
public class Relatorio {
    public static void main(String[] args) {
        Livro livro = new Livro("Era uma vez", 263, 
            new Edicao(2025, 2, 
                new Patrocinador("Julia", 
                        new Editora("Alvorada", "1234JKE", 
                            new Endereco("Rua dos anjos", 45)), 
                        new Endereco("Avenida lagoas", 20))));   
      
        System.out.println(livro);
    }
    
}
