public class Car {
    //criar nossos atributos (variáveis)
    private String marca;
    private String modelo;
    private int ano;

    private double valor;
    //vamos criar nosso constructor para associar e criar objetos
    Car(String marca, String modelo, int ano, double valor){
        this.marca = marca; //Apontamento de um parametro a um atributo usando this
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }
    //getter
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
     return modelo;
    }
    public Integer getAno(){
        return ano;
    }
    public double getValor(){
        return valor;
    }
    //setter
   public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
