package disciplinaMatematica;
public class TesteSistema {
    public static void main(String[] args) {
       Matematica m = new Matematica("Matemática", 250.0, 
               new AplicacaoPratica("geometria", 
                       new Quadrado("quadrado", 6),
                       new Circulo("círculo", 4), 
                       new Retangulo("retângulo", 4, 8)));
        System.out.println(m);
    }

}
