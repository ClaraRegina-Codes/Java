package associacaoVeiculo;
public class TestaVeiculo {
    public static void main(String[] args) {
        //define os valores dos atributos da classe todo
        //cria construtor dos fragmentos dentro dos parâmetros do objeto da classe todo
        //construtor dos fragmentos: new Classe(atributos da classe fragmento)
        
        Veiculo v = new Veiculo("JJ129I","vermelho", 
                new Motor(67.0, "diesel"), //pula uma linha para manter organizado
                new Roda(15, 100), 
                new Porta("direita"));
        
        System.out.println(v);
    }
    
}
