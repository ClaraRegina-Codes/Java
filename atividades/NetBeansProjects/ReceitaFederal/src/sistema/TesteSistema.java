package sistema;
public class TesteSistema {
    public static void main(String[] args) {
       Auditor aud = new Auditor("Jucelino", 45236, 2600.00, 
               new Endereco("Samambaia", 15), 300.00, 
               new Auditoria(5, "05/06/2025"));
       
        System.out.println(aud);
        System.out.println("--------------------------");
        
       Atendente a = new Atendente("Gabrielly", 78561, 2300.00, 
               new Endereco("Taguatinga", 4), "vendas", 
               new Fisica("Gabrielly Medeiros", "456.321.963-02", 
                       new ParaPessoaFisica(2006, 785631, 3200.00, 
                               new Deducao(7856, "dedução", 1800.00), 
                               new Bens(2365, "bens", 2700.00), 
                               new Pagamento(36952, "pagamento", 4500), 200, 
                               new Dependente("Julia", 10, 45621))));
       
        System.out.println(a);
        System.out.println("--------------------------");
        
       Juridica jud = new Juridica("Fernando", "963.785.321-02", 
               new ParaPessoaJuridica(2023, 45230, 900.00, 
                       new Deducao(74586, "dedução", 600.00), 
                       new Bens(96851, "bens", 4000.00), 
                       new Pagamento(65423, "pagamento", 700.00), "pessoa jurídica devidamente registrada"));
       
        System.out.println(jud);
    }

}
