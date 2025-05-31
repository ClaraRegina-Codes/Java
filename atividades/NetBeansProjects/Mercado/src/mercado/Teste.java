package mercado;
public class Teste {
    public static void main(String[] args) {
        DeSal PaoDeSal = new DeSal("20/08", "01/09", 123456, "2 dias", 10, 48.0);
        System.out.println(PaoDeSal);
        Recheado PaoDoceRecheado = new Recheado("18/02/2025", "21/02/2025", 69875, "12h", "pão careca", "chocolate");
        System.out.println(PaoDoceRecheado);
        Bolo bolo = new Bolo("20/01/2025", "02/02/2025", 456321, "bolo de cenoura", 10.0, 0.5);
        System.out.println(bolo);
        Assado assado = new Assado("19/02/2025", "21/02/2025", 75632, "assado de frango", 20.0, 24.0);
        System.out.println(assado);
        Frito frito =new Frito("05/02/2025", "15/2025", 741235, "coxinha", 5.0, "10 horas");
        System.out.println(frito);
   
    }    
}
