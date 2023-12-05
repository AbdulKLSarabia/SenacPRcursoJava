public class Professor extends Pessoa {
    private String turma;
    private String titulacao;

    public Professor(String nome, String endereco, int idade, String turma, String titulacao) {
        super(nome, endereco, idade);
        this.turma = turma;
        this.titulacao = titulacao;
    }

    public String getTurma() {
        return turma;
    }

    public String getTitulacao() {
        return titulacao;
    }

}