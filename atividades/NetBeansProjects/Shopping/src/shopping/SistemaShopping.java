package shopping;
public class SistemaShopping {
    public static void main(String[] args) {
        DeLojas dj = new DeLojas(12, "Lojas especializadas", 
                new DeCalcados(150, "Calçados infantis",
                        new Atendente(35629, "Juliana", 1500.00), "Numeração 23 a 34", 
                        new Cliente("Julia", "456.123.753-02", 
                                new Endereco("Avenida dos doces", "12365-200", 0), 
                                new Produto("Calçados marisas", 1, 120.50, 
                                        new Fornecedor("Gabriel", "456.321.963-02", 
                                                new Endereco("Avenida dos anjos", "45236-320", 98))))), 
                new DeUtilidades(9, "Utilidades para casa", 
                        new Atendente(623845, "Fernanda", 1520.00), 10, 
                        new Box("Utilidades para a cozinha", 5, 
                                new Produto("Panela",632586, 30.00, 
                                        new Fornecedor("André", "45236-500", 
                                                new Endereco("Avenida Salvador", "72563-000", 2))), 
                                new Locatario("856329", "Karen", 
                                        new Contrato(3, 800.00), 
                                        new Endereco("Samambaia", "72621-400", 221))), 
                        new Cliente("Clara", "562.753.642-01", 
                                new Endereco("Avenida Salvador", "72530-000", 11), 
                                new Produto("Taleheres", 123695, 25.00, 
                                        new Fornecedor("João", "753.652.856-00", 
                                                new Endereco("Recanto das Emas", "72652-852", 303))))));
        
        System.out.println(dj);
        System.out.println("_____________________________________");
        
        
        Alimentacao a = new Alimentacao(10, 23, 
                new DeAlimentacao(2365, "Salgados", 
                        new Atendente(623584, "Kaio", 1600.00), "Brasil", 
                        new Cliente("Karina", "853.741.923-02", 
                                new Endereco("Ceilândia", "72652-420", 13), 
                                new Produto("Pastelão de carne", 1623754, 5.00, 
                                        new Fornecedor("Luiz", "654.785.329-03", 
                                                new Endereco("Taguatinga","72956-300", 34))))));
        
        System.out.println(a);
    }

}
