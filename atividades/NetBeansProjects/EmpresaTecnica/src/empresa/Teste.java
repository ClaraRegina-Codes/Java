package empresa;
public class Teste {
    public static void main(String[] args) {
       Tecnico t = new Tecnico("123.632.459-01", "Fernanda", 
               new Endereco(15, "Avenida Salvador"), "452369", 300.00, 
               new Equipamento("Windows", "Samsung"));
        System.out.println(t);
        System.out.println("-----------------------");
        
        Funcionario f = new Funcionario("456.321.963-02", "Juliano", 
                new Endereco(8, "Avenida Monjolo"), 7856341, 450.00);
        System.out.println(f);
        System.out.println("----------------------");
        
        Cliente c = new Cliente("785.963.123-02", "Gustavo", 
                new Endereco(6, "Samambaia"), 150, 320, 
                new Internet("Vivo", 20.00), 
                new Impressao("Impressão do livro", 2.50));
        System.out.println(c);
    }

}
