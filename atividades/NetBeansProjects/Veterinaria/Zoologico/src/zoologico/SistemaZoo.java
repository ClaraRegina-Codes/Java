package zoologico;
public class SistemaZoo {
    public static void main(String[] args) {
        Bovino b = new Bovino(20, 6.3, 6.0, 
                new Expositor("Alex", "6239JT4", 
                        new Stand("Rural", 1, 
                                new Produto("856942", "Área de bois", 25.50))), 
                new Visitante("Juliana", 
                        new Ingresso(2, 51.0), 
                        new Stand("Rural", 5, 
                                new Produto("563297", "Área de felinos", 20.60))), 
                "exposição de bois", 
                new AnimalBovino("raça de boi", 17, 
                        new Racao("Ração de carne", 240)));
        
        System.out.println(b); 
        System.out.println("--------------------"); 
        
        Equino e = new Equino(200, 30.0, 20.0, 
                new Expositor("João", "756329", 
                        new Stand("Área de animais equinos", 3, 
                                new Produto("5632PHT86", "Produtos diversos", 50.0))), 
                new Visitante("Júlia", 
                        new Ingresso(3, 150.0), 
                        new Stand("Venda de animais equinos", 20, 
                                new Produto("5236EGT845", "Animais equinos pequenos", 63.0))), "exposição de animais diversos", 50, 
                new AnimalEquino("Raça do animal", "macho", 
                        new Racao("Carnes e legumes", 400)));
        
        System.out.println(e);
        System.out.println("--------------------"); 
        
        AnimalDiverso ad = new AnimalDiverso(600, 100.0, 80.0, 
                new Expositor("Fernanda", "54623THW5", 
                        new Stand("Venda de animais diversos", 5, 
                                new Produto("65823RT5", "Animais diversos", 36.0))), 
                new Visitante("Gabriele", 
                        new Ingresso(3, 45.0), 
                        new Stand("Animais felinos", 20, 
                                new Produto("4238HTF6", "Animais felinos pequenos", 12.0))), "Animais - zoo", 
                new Gato("siâmes","preto e bege"), 
                new Cachorro("Lili", "golden Retrivier", 
                        new Tratador("Rafael", "452369", 
                                new Racao("Legumes e carnes", 1500))), 
                new Ovelha("Raça de ovelha", "Preto", "fêmea", 
                        new Racao("cenouras cozidas", 450)));
        System.out.println(ad);
        
    }
    
}
