package sistema;
public class TesteSistema {
    public static void main(String[] args) {
        Professor p = new Professor("Vinícius", "45263", 
                new Endereco("Avenida Salvador", 15), 
                new Aluno("Fernanda", "45398", 
                        new Endereco("Samambaia", 2), 
                        new DeRadiologia("Profissionalizante", 1200, 5.60, 8.0, 8.0, "anatomia")));
        System.out.println(p);
        System.out.println("---------------------");
        
        Vendedor v = new Vendedor("Juliano", "56239", 1500.00, 50.0, 
                new Endereco("Avenida tech", 5), 
                new Carro(2012, "preto", "456KF8", 5800.00, "4 portas", 200.0, 
                        new Marca("789.325.410-02", "Toyota", "Toyota Corolla Altis 2.0 Flex")), 
                new Moto(2025, "vermelha", "45TKL02", 4000.00, 300, "Street", 
                        new Marca("632.123.741-01", "Honda", "Honda CG 160 Fan")));
        System.out.println(v);
    }

}
