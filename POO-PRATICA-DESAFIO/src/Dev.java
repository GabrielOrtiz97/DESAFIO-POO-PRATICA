public class Dev {
    private String nome;
    private String email;
    private String nivelExperiencia;

    public Dev(String nome, String email, String nivelExperiencia) {
        this.nome = nome;
        this.email = email;
        this.nivelExperiencia = nivelExperiencia;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getNivelExperiencia() {
        return nivelExperiencia;
    }
    public String getInfo() {
        return "Dev: " + nome + "\nEmail: " + email + "\nNível de Experiência: " + nivelExperiencia;
    }
}
