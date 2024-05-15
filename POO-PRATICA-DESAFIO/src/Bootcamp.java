import java.util.ArrayList;
import java.util.List;

public class Bootcamp {
    private String nome;
    private List<Curso> cursos;
    private List<Mentoria> mentorias;
    private List<Dev> devs;

    public Bootcamp(String nome) {
        this.nome = nome;
        this.cursos = new ArrayList<>();
        this.mentorias = new ArrayList<>();
        this.devs = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public List<Mentoria> getMentorias() {
        return mentorias;
    }

    public List<Dev> getDevs() {
        return devs;
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void removerCurso(Curso curso) {
        cursos.remove(curso);
    }

    public void adicionarMentoria(Mentoria mentoria) {
        mentorias.add(mentoria);
    }

    public void removerMentoria(Mentoria mentoria) {
        mentorias.remove(mentoria);
    }

    public void adicionarDev(Dev dev) {
        devs.add(dev);
    }

    public void removerDev(Dev dev) {
        devs.remove(dev);
    }
}
