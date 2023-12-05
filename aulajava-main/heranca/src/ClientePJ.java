public class ClientePJ extends Cliente {
    private String cnpj;

    //construtor ClientePJ
    public ClientePJ(String nome, String endereco, String cnpj) {
        super(nome, endereco);
        this.cnpj = cnpj;
    }

    //get
    public String getCnpj() {
        return cnpj;
    }

    //set
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String toString(){
        return super.toString() + " CNPJ " + cnpj;
    }
}
