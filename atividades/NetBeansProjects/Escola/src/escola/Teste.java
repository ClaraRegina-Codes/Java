package escola;
public class Teste {
    public static void main(String[] args) {
        Aluno a = new Aluno("Clara", "123.156.456-04", "Recanto", 123654, "3D");
        System.out.println(a);
        Professor p = new Professor("Fernanda", "156.456.789-05", "Samambaia", "professora de física", 1500.54);
        System.out.println(p);
        Secretaria s = new Secretaria("Juliana", "156.741.895-01", "Taguatinga", "coordenadora", 1200.20, "organiza eventos escolares", "relatórios");
        System.out.println(s);
        Eventos e = new Eventos("João", "156.423.753-03", "Águas Claras", 800, "Passeios escolares");
        System.out.println(e);
        Livros l = new Livros("Gabriel", "159.423.759-00", "Asa Sul", 960, "Apostilas", 100, "Matemática");
        System.out.println(l);
    
    
    }
    
}
