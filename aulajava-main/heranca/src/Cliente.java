public class Cliente {
    private String nome;
    private String endereco;

    //método construtor
    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;

    }
    //para cada atributo crir um get e um set

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    //exemplo para polimorfismo
    //criando um método chamado toString
    public String toString(){
        return "Nome; " + nome + "Endereço: " + endereco;
    }
}
