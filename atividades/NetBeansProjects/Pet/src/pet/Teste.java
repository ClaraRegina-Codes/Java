package pet;
public class Teste {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro("123456", "fofo", "golden", 
                new Proprietario("Julia", "Samambaia", 
                        new Filiacao("Fernanda", "João")) , 
                new Filiacao("Jujuba", "Ricardão"));
        System.out.println(dog);
    }
    
}
