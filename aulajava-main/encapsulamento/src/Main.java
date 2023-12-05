public class Main {
    public static void main(String[] args) {
        //criar objeto, usamos a classe car como "modelo"
        Car Car = new Car("BMW", "X6", 2023, 120000);
        //saida
        Car.setModelo("X5");
        System.out.println(Car.getMarca());
        System.out.println(Car.getModelo());
        System.out.println(Car.getAno());
        System.out.println(Car.getValor() * 1.1);
        }
    }
