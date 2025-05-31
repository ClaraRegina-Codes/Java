package empresa;
public class Teste {
    public static void main(String[] args) {
        Fornecedor f = new Fornecedor("Julia", "Samambaia", "623.452.789.01", "Brasil");
        System.out.println(f);
        Vendedor v = new Vendedor("João", "Águas Claras", 123456, 1000.38, "produtos artesanais", 50.0, 100.0);
        System.out.println(v);
        Diretor d = new Diretor("Fernanda", "Asa Sul", 785239, 6000.00, 500.00);
        System.out.println(d);
        PessoaFisica pf = new PessoaFisica("Gabriel", "Taguatinga", 25, "258.963.745.03");
        System.out.println(pf);
        PessoaJuridica pj = new PessoaJuridica("Lilian", "Ceilândia", 38, "456.789.357.07");
        System.out.println(pj);
    }
    
}
