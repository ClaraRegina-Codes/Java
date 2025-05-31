package biblioteca;
public class SistemaBiblioteca {
    public static void main(String[] args) {
        Infantil i =new Infantil("Doce infância", 
                new Autor("Robert", "254.123.785-02"), 
                new Editora("Collin", "Avenida Salvador"), 
                "7");
        Drama d = new Drama("Impossível", 
                new Autor("Colleen Hover", "452.123.456.01"), 
                new Editora("Happer", "Avenida dos anjos"), 
                "uma história emocionante");
        Suspense s = new Suspense("Ninguém vai te ouvir gritar", 
                new Autor("Mark", "452.786.243-00"), 
                new Editora("Moriarty", "Avenida das lagoas"), 
                320);
        
        System.out.println(i);
        System.out.println("------------------");
        System.out.println(d);
        System.out.println("------------------");
        System.out.println(s);
        
        
    }

}
