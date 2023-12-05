public class Aluno extends Pessoa implements Avaliavel {
    private String turma;
    private double nota1, nota2, media;

    public Aluno(String nome, String endereco, int idade, String turma, double nota1, double nota2) {
        super(nome, endereco, idade);
        this.turma = turma;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = media;
    }

    public String getTurma() {
        return turma;
    }

    public String verificarAprovacao() {
        if (this.media >=7){
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    }

    public double calcularMedia() {
        this.media = ((this.nota1 + this.nota2) / 2);
        return this.media;
    }

    public double getMedia() {
        this.media = ((this.nota1 + this.nota2) / 2);
        return this.media;
    }
}

