import java.util.ArrayList;

public class Equipamentos {
    //atributo colecaoEquipamento
    private ArrayList colecaoEquipamento = null;
    //declaramos um atributo privado que é uma instância de Arraylist.
    //Esta lista será usada para armazenar objetos da classe Equipamento

    //criando construtor
    public Equipamentos() {
        colecaoEquipamento = new ArrayList();
        /* O construtor da classe "Equipamentos" é responsável por instanciar o objeto Arraylist quando o objeto Equipamentos é criado...
         ...Arraylist quando o objeto Equipamentos for criado*/
    }

    // Método "adicionar"
    public void adicionar(Equipamento eq) {
        colecaoEquipamento.add(eq);
        /* Método adicionar recebe um objeto da classe equipamento
        e como parâmetro e adiciona esse objeto a lista colecaoEquipamento */
    }

    // Método exibirObjetos
    public void exibirObjetos() {
        for (int i = 0; i < colecaoEquipamento.size(); i++) {
            Equipamento eqaux = (Equipamento) colecaoEquipamento.get(i);
            System.out.println("Os dados " + eqaux.toString());
            /* Este método itera sobre a lista  colecaoEquipamento, converte cada objeto para a classe "Equipamento"
             * e imprime os dados desses objetos usando método toString da classe Equipamento */
        }
    }
}
