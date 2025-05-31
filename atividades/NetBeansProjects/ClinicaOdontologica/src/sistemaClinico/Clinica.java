package sistemaClinico;
public class Clinica {
    public static void main(String[] args) {
        Paciente p=new Paciente("Julia", "452.365.782-02", 
                new Endereco("Avenida Salvador", 12, 
                        new Cep(72152620)), 
                new Consulta("limpeza dentária", 
                        new Agendamento("14/04/2025","08:00"), 
                        new Consultorio(03)), 
                new Exame("Raio-X", 45239, 
                        new Agendamento("18/03/2025", "14:00"), 
                        new Consultorio(01)), 
                new Funcionario("João", 
                        new Endereco("Avenida dos anjos", 15, 
                                new Cep(72456300)), 
                        new Cargo("Dentista", 
                                new Salario(1500.00))));
        System.out.println(p);
    }

}
