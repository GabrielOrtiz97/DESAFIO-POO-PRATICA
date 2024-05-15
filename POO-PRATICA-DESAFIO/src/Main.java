public class Main {
    public static void main(String[] args) {

        Bootcamp bootcamp = new Bootcamp("Bootcamp de Desenvolvimento");

        Curso curso1 = new Curso("Java Fundamentals", "Curso introdutório de Java", "João Silva", 40);
        Curso curso2 = new Curso("Web Development", "Curso de desenvolvimento web", "Maria Oliveira", 60);

        bootcamp.adicionarCurso(curso1);
        bootcamp.adicionarCurso(curso2);

        Mentoria mentoria1 = new Mentoria("Dicas de Carreira", "Mentoria sobre desenvolvimento de carreira", "Carlos Santos", "Segunda-feira, 10:00");
        Mentoria mentoria2 = new Mentoria("Code Review", "Sessão de revisão de código", "Ana Souza", "Quarta-feira, 15:00");

        bootcamp.adicionarMentoria(mentoria1);
        bootcamp.adicionarMentoria(mentoria2);

        Dev dev1 = new Dev("Pedro", "pedro@email.com", "Intermediário");
        Dev dev2 = new Dev("Juliana", "juliana@email.com", "Avançado");

        bootcamp.adicionarDev(dev1);
        bootcamp.adicionarDev(dev2);

        System.out.println("Informações do Bootcamp:");
        System.out.println("Nome: " + bootcamp.getNome());
        System.out.println("\nCursos:");
        for (Curso curso : bootcamp.getCursos()) {
            System.out.println(curso.getInfo());
        }
        System.out.println("\nMentorias:");
        for (Mentoria mentoria : bootcamp.getMentorias()) {
            System.out.println(mentoria.getInfo());
        }
        System.out.println("\nDevs:");
        for (Dev dev : bootcamp.getDevs()) {
            System.out.println(dev.getInfo());
        }
    }
}
