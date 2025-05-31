package classeVeiculo;
public class SistemaVeiculo {
    public static void main(String[] args) {
        DePasseio dp = new DePasseio("cinza", "F0F0", 2020, 1300.00, 
                new Proprietario("Jucelino", "123.654.985-02", 
                        new Endereco("Avenida Salvador", "12345-300")), "ford", "carro para passeio", 
                new Montadora("452.368.623-01", "tech ford", 
                        new Endereco("Avenida tech", "52639-200")));
        
        System.out.println(dp);
        System.out.println("-------------------");
        
        Moto m = new Moto("amarela", "1NF3", 2023, 2000.00, 
                new Proprietario("Gabriel", "856.965.741-02", 
                        new Endereco("Avenida dark", "45236-620")), 300);
        
        System.out.println(m);
        System.out.println("--------------------");
        
        Onibus o = new Onibus("azul", "HJ09K", 2019, 3000.00, 
                new Proprietario("Caren", "456.214.987-05", 
                        new Endereco("Beco do bebâdo", "52378-400")), 40, 
                new Montadora("456.985.321-85", "Marechal", 
                        new Endereco("Avenida dos anjos", "52369-420")));
        
        System.out.println(o);
    }

}
