package ctracaAcademia;

public class Aluno {
    String nome;
    int id;
    int senha;
    boolean mensalidadePaga;

    public Aluno(String nome, int id, int senha, boolean mensalidadePaga) {
        this.nome = nome;
        this.id = id;
        this.senha = senha;
        this.mensalidadePaga = mensalidadePaga;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", senha=" + senha +
                '}';
    }
}
