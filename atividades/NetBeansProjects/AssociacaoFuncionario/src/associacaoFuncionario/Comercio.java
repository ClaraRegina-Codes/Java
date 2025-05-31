package associacaoFuncionario;
public class Comercio {
    public static void main(String[] args) {
        Cliente c = new Cliente("Juliana", "645.321.953-02", 
                new Venda(15.0, 
                        new Produto(12358, "pratos", 13.0), 
                        new Funcionario("João", 58763, 
                                new Cargo("Vendendor", 
                                        new Gratificacao(200.0, 15, "12/04/2026"), 
                                        new Atribuicao("vidro azul")), 
                                new Salario(1500.00), 
                                new Formacao("gerenciamento", 
                                        new InstituicaoEnsino("FGV", 
                                                new Endereco("Avenida dos anjos", 2, 
                                                        new Cep(12235420)))), 
                                new Endereco("Avenida lagoas", 84, 
                                        new Cep(45200653)), 
                                new Dependente(20))));
        System.out.println(c);
    }
    
}
