public class Computador extends Equipamento {
    //atributos desta classe
    private int tamanho_hd;


    //construtor
    public Computador(int codigo, String reservado, int tamanho_hd) {
        //chamando o construtor da superclasse Equipamento
        super(codigo, reservado);
        this.tamanho_hd = tamanho_hd;
    }

    public int getTamanho_hd() {
        return tamanho_hd;
    }

    public void setTamanho_hd(int tamanho_hd) {
        this.tamanho_hd = tamanho_hd;
    }

    public String getReservado() {
        return super.getReservado();
    }
    //o método acima chama o método correspondente da superclasse "Equipamento"

    //método toString
    public String toString() {
        return super.toString();
    }
}

