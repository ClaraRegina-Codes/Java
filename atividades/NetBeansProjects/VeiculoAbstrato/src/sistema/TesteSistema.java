package sistema;
public class TesteSistema {
    public static void main(String[] args) {
        DePasseio passeio = new DePasseio("45236", "amarelo", 2024, 3500.00, 
                new Proprietario("456.321.963-02", "Andressa", 
                        new Endereco("72420-600", "Avenida Salvador")), "ford", "carro para passeio", 
                new Montadora("Núbia", "896.321.654-00", 
                        new Endereco("72653-200", "Avenida tech")));
        
        System.out.println(passeio);
        System.out.println("-----------------------");
        
        Onibus onibus = new Onibus("45236", "azul", 2019, 6000.00, 
                new Proprietario("852.698.321-02", "José", 
                        new Endereco("72851-000", "Avenida monjolo")), 
                new Montadora("João", "963.789.456-03", 
                        new Endereco("72654-210", "Samambaia")), 26);
        System.out.println(onibus);
        System.out.println("-----------------------");
        
        Moto moto = new Moto("78541", "vermelha", 2025, 3500.00, 
                new Proprietario("785.321.965-02", "Felipe", 
                        new Endereco("72450-200", "Avenida doce")), 300);
        System.out.println(moto);
    }

}
