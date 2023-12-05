public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Abdul", "Rua Antonio Ontiveros", 31, "Nº8", 10, 9);
        aluno.calcularMedia();

        Professor professor = new Professor("Luiz", "Rua Raposo", 46, "Nº8", "Professor Senac/PR Programação");

        System.out.println("Nome do professor: " + professor.getNome());
        System.out.println("Endereço: " + professor.getEndereco());
        System.out.println("Idade: " + professor.getIdade());
        System.out.println("Títulação: " + professor.getTitulacao());
        System.out.println("Turma do professor: " + professor.getTurma()+ "\n");

        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Endereço: " + aluno.getEndereco());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Turma do aluno: " + aluno.getTurma());
        System.out.println("O aluno foi: " + aluno.verificarAprovacao());
        System.out.println("A média do aluno foi: " + aluno.getMedia());
    }

}