package shopping;
public class SistemaShopp {
    public static void main(String[] args) {
       DeLojas loja = new DeLojas(5, "Lojas diversas", 
               new DeCalcados(3, "Calçados infantis",
                       new Atendente("Juliana", 1500.00, 85236), "tênis", 
                       new Cliente("Julia", "456.321.985-02", 15.00, 
                               new Endereco(23, "Avenida doce", "12365-500"), 
                               new Produto("tênis rosa infantil", 52398, 230.00, 
                                       new Fornecedor("Gabriel", "785.632.123-01", 50.00, 
                                               new Endereco(2, "avenida salvador","752.654.321-00"))))), 
               new DeUtilidades(5, "Utilidades para casa", 
                       new Atendente("Fernando", 1200.00, 41257), 500, 
                       new Cliente("Livia", "632.951.456-02", 20.00, 
                               new Endereco(4, "Avenida dos anjos", "78590-200"), 
                               new Produto("Panelas", 15628, 100.00, 
                                       new Fornecedor("Allan", "752.654.123-01", 30.00, 
                                               new Endereco(6, "Ceilândia", "72412-000")))), 
                       new Box("eletrônicos para o lar", 5, 800.00, 
                               new Produto("aspirador de pó", 52369, 600.00, 
                                       new Fornecedor("Giulia", "456.321.965-02", 50.00, 
                                               new Endereco(5, "Samambaia", "72423-000"))), 
                               new Locatario("Yuki", "956327", 200.00, 
                                       new Endereco(5, "Avenida das sakuras", "456.985.328-02"), 
                                       new Contrato(56327, 600.00)))));
       
        System.out.println(loja);
        System.out.println("-------------------------------");
        
        Alimentacao a = new Alimentacao(15, 5, 
                new DeAlimentacao(3, "Salgados e doces", 
                        new Atendente("Amanda", 1600.00, 785631), "Brasil", 
                            new Cliente("Andressa", "453.219.123-02", 2.00, 
                                    new Endereco(25, "Recanto das Emas", "72620-420"), 
                                    new Produto("Coxinha", 78562, 5.00, 
                                            new Fornecedor("Danillo", "963.852.987-01", 3.00, 
                                                    new Endereco(8, "Taguatinga", "65300-200"))))));
        System.out.println(a);
    }

}
