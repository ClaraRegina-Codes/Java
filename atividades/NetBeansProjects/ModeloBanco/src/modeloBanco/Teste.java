package modeloBanco;
public class Teste {
    public static void main(String[] args) {
       Fisica f = new Fisica("Julia", "3336-5896", 200.00, 2000.00, 1500.00, 
               new Endereco("Avenida doce", 5, 
                       new Cep("12365-200")), 
               new Conta(65239, 950.00, 
                       new Transacao("nacional", 500.00), 
                       new Agencia(5289, "BRB")), 
               new CartaoCredito(89653, "18/02/2020", 600.00, 
                       new TransacaoCartao(1569, 1500.00)), "123.659.856-02");
       
       System.out.println(f);
    }

}
