public class ClienteCPF extends Cliente {
    private String cpf;

    //construtor ClienteCPF
    public ClienteCPF(String nome, String endereco, String cpf) {
        super(nome, endereco);
        this.cpf = cpf;
    }

    //get
    public String getCpf() {
        return cpf;
    }

    //set
    public void setCnpj(String cpf) {
        this.cpf = cpf;
    }

    public String toString(){
        return super.toString() + " CPF " + cpf;
    }
}