public class Main {
    public static void main(String[] args) {
        ClienteCPF clienteCPF1 = new ClienteCPF("Luiz", "Rua Rio de Janeiro", "031.333.333-33");
        ClientePJ clientePJ1 = new ClientePJ("Fernando", "Rua Raposo Tavares", "123456/0001-01");

        System.out.println("Cliente CPF dados: " + clienteCPF1.getNome() + ". Morador na " + clienteCPF1.getEndereco());

        ContaCorrente contaComum = new ContaCorrente(98841, 3712);
        ContaCorrente contaEspecial = new ContaCorrente(98874, 3715, 50_000f);

        System.out.println(clienteCPF1.toString());
        System.out.println(clientePJ1.toString());

        Aluno aluno1 = new Aluno("Abdul", "Rua raposo, 32", 10, 7.5);
        aluno1.calcularMedia();

        System.out.println("O aluno foi: " + aluno1.verificarAprovacao());

    }
}