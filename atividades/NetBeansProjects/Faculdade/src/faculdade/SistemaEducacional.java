package faculdade;
public class SistemaEducacional {
    public static void main(String[] args) {
        Aluno a = new Aluno("Clara", 156239, 
                new Endereco("Avenida mendes", 
                        new Cep("72642-300")), 
                new Curso("Informática", 364037, 
                        new Area("Tecnologia"), 
                        new Disciplina("Redes", 56239, 
                                new GradeCurricular("14:00", "terça"), 
                                new Sala(37))));
        
        System.out.println(a);
        System.out.println("_________________");
        
        Professor p = new Professor("Jessiel", "362.523.789-02", 
                new Salario(3500.00), 
                new Endereco("Avenida dos anjos", 
                        new Cep("72698-210")), "Professor de redes", 
                new Disciplina("Redes", 56239, 
                        new GradeCurricular("14:00", "terça"), 
                        new Sala(37)));
        
        System.out.println(p);
        System.out.println("_________________");
        
        Diretor d = new Diretor("Jackes", "789.653.246-00", 
                new Salario(6000.00), 
                new Endereco("Avenida das lagoas", 
                        new Cep("72654-300")), "diretor da escola técnica", "Ciência da computação");
        
        System.out.println(d);
        System.out.println("_________________");
    }

}
