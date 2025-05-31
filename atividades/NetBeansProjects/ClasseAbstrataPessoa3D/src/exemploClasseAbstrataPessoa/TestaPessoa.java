package exemploClasseAbstrataPessoa;
public class TestaPessoa {
    public static void main(String[] args) {
        
        Professor p = new Professor("Amanda", 1000, 6000, 
                new Filiacao("Francisco", "Fernanda"), 
                "Mestre", "Ensino médio");
        
        System.out.println(p);
        System.out.println("----------------");
        
        Empregado e = new Empregado("Juliana", 500, 1500, 
                new Filiacao("Fernando", "Jéssica"),
                "152369", "Vendas");
        
        System.out.println(e);
        
    }

}
