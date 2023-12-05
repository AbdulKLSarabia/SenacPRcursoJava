public abstract class Equipamento {
    //atributos da classe
    private int codigo; //cod do equipamento
    private String reservado;//se está ou não reservado

    //Métodos da classe
    //Contrutor

    public Equipamento(int codigo, String reservado) {
        this.codigo = codigo;
        this.reservado = reservado;
    }

    //métodos para a leitura e escrita dos atributos
    //gets e setters
    public int getCodigo() {
        return codigo;
    }

    public String getReservado() {
        return reservado;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setReservado(String reservado) {
        this.reservado = reservado;
    }

    //método toString que escreve os atributos do equipamento na saída padrão
    @Override
    public String toString() {
        return ("\n" + "Código: " + codigo + " " + reservado + "\n");
    }
}
