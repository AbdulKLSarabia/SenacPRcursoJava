public class Aluno extends Pessoa implements situacaoAcademica{
    private double nota1, nota2, media;

    public Aluno(String nome, String endereco, double nota1, double nota2){
        super (nome, endereco);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = media;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }



    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }


    public String verificarAprovacao(){
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
}