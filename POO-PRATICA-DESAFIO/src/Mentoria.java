public class Mentoria {
    private String titulo;
    private String descricao;
    private String mentor;
    private String horario;

    public Mentoria(String titulo, String descricao, String mentor, String horario) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.mentor = mentor;
        this.horario = horario;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getMentor() {
        return mentor;
    }

    public String getHorario() {
        return horario;
    }
    public String getInfo() {
        return "Mentoria: " + titulo + "\nDescrição: " + descricao + "\nMentor: " + mentor + "\nHorário: " + horario;
    }
}
