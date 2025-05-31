package veterinaria;
public class SistemaVeterinario {
    public static void main(String[] args) {
        Baleia b = new Baleia(30, "orca");
        Cachorro c = new Cachorro(2, "Mel", 
                new Fisica("Julia", 
                        new Telefone("998563742", 61), "263.846.234-01",
                        new Profissao("Veterinário", 2000.00)));
        Juridica j = new Juridica("Juliana", 
                new Telefone("9965371574", 55), 
                "623.854.762-02");
        
        System.out.println(b);
        System.out.println("----------");
        System.out.println(c);
        System.out.println("----------");
        System.out.println(j);
        
    }

}
