public class ReservaAPP {
    public static void main(String[] args) {
        //Instanciar objetos
        Computador computador1 = new Computador(1, "Não", 1);
        Computador computador2 = new Computador(2, "Não", 2);

        //Instancia objetos datashow
        DataShow datashow1 = new DataShow(3, "Não", true);
        DataShow datashow2 = new DataShow(4, "Sim", true);

        /*  Criamos acima os objetos das classes "Computador" e "DataShow"
        com valores específicos passadas como argumentos para os construtores */

        //Objeto Equipamentos
        Equipamentos equipamentos = new Equipamentos();
        //Classe Equipamentos representa uma coleção de equipamentos


        //adiciona os objetos à coleção de equipamentos usando o método "adicionar" da classe "Equipamentos"
        equipamentos.adicionar(computador1);
        equipamentos.adicionar(computador2);

        equipamentos.adicionar(datashow1);
        equipamentos.adicionar(datashow2);

        //Chama o método "exibirObjetos" da classe "Equipamentos"
        equipamentos.exibirObjetos();
    }
}
