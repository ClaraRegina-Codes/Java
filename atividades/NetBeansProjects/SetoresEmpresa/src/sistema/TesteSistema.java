package sistema;
public class TesteSistema {
    public static void main(String[] args) {
       Cliente c = new Cliente("Gabrielly", "632.563.853-00", 
               new Vendedor("Juliano", "452310", "vendas"), 
               new Tenis("esportivo", "021365", "all star", 36, 230.00, 
                       new DeSapatoFeminino("Tênis casual", 460.00, "16 anos"), 
                       new DeSapatoMasculino("Tênis casual masculino", 920.00, "casual", "3336-1236")), 
               new Sandalia("rasteirinha", "123652", "verde", "borracha", 200.00, 
                       new DeSapatoFeminino("sapato feminino", 1200.00, "12 anos")));
        System.out.println(c);
    }

}
