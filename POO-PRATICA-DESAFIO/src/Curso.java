public class Curso {
    private String nome;
    private String descricao;
    private String instrutor;
    private int duracao; // em horas

    public Curso(String nome, String descricao, String instrutor, int duracao) {
        this.nome = nome;
        this.descricao = descricao;
        this.instrutor = instrutor;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public int getDuracao() {
        return duracao;
    }
    public String getInfo() {
        return "Curso: " + nome + "\nDescrição: " + descricao + "\nInstrutor: " + instrutor + "\nDuração: " + duracao + " horas";
    }
}
