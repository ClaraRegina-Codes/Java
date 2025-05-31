package franquia;
public class Teste {
    public static void main(String[] args) {
     Padaria p = new Padaria("Trigopão", "726523-020", "3335-9853", 
             new Cliente("Julia", "753.654.986-00", 25, 
                     new Produto("Donuts", "547GR", 5, 
                             new TipoProduto("recheio de chocolate"),    
                             new Fornecedor("965.423.851.03", "Ricardo", "9975-3201", 
                                     new Endereco("Avenida salvador", 23, 
                                             new Cep("78654-200"))))), 
             new Endereco("Avenida Monjolo", 6, 
                     new Cep("72658-800")), 
             new Produto("Pão", "45L2D", 2.5, 
                     new TipoProduto("salgado"),            
                     new Fornecedor("756.245.368-01", "Gabrielly", "9865-0417", 
                             new Endereco("Rua doce", 4, 
                                     new Cep("72621-420")))));
        System.out.println(p);
    }
    
    
}
