import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import java.util.Scanner;


public class MySQL {
    public static void main(String[] args) {
        /*System.out.println("===== USUÁRIOS CADASTRADOS =====");
        System.out.println("");
        buscarUsuarios();

        System.out.println("");
        System.out.println("===== INSERINDO NOVO USUÁRIO =====");
        System.out.println("");
        inserirUsuario();

        System.out.println("");
        System.out.println("===== USUÁRIOS CADASTRADOS =====");
        System.out.println("");
        buscarUsuarios();

        System.out.println("===== ATUALIZANDO DADOS =====");
        atualizarUsuario();

        System.out.println("");
        System.out.println("===== USUÁRIOS =====");*/
        System.out.println("===== DELETANDO USUÁRIO =====");
        deletarUsuario();

        System.out.println("");
        System.out.println("===== USUÁRIOS =====");
        buscarUsuarios();
    }

    public static void buscarUsuarios() {

        // Java DataBase Connection (JDBC)
        try {

            Driver driver = new Driver();
            DriverManager.registerDriver(driver);

            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306", "root", "senac@02");

            PreparedStatement stmt = c.prepareStatement("SELECT * FROM biblioteca.clientes");


            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("cliente_id");
                String clientes = rs.getString("nome_cliente");

                System.out.println("Id: " + id);
                System.out.println("Cliente: " + clientes);

            }

            stmt.close();
            c.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void inserirUsuario() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o CPF: ");
        String cpf = sc.nextLine();

        System.out.println("Digite o endereço: ");
        String endereco = sc.nextLine();

        System.out.println("Digite o telefone: ");
        String telefone = sc.nextLine();

        System.out.println("Digite o email: ");
        String email = sc.nextLine();

        try {
            Driver driver = new Driver();
            DriverManager.registerDriver(driver);

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "senac@02");

            PreparedStatement stmt = c.prepareStatement("INSERT INTO biblioteca.clientes (nome_cliente, cpf_cliente, endereco_cliente, telefone_cliente, email_cliente) VALUES (?, ?, ?, ?, ?)");

            stmt.setString(1, nome);
            stmt.setString(2, cpf);
            stmt.setString(3, endereco);
            stmt.setString(4, telefone);
            stmt.setString(5, email);

            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Usuário inserido com sucesso");
            } else {
                System.out.println("Erro ao cadastrar usuário. Tente novamente");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void atualizarUsuario() {
        Scanner sc = new Scanner(System.in);
        buscarUsuarios();
        System.out.println("Digite o id do usuário a ser atualizado");
        int id = sc.nextInt();
        sc.nextLine(); // Limpar o buffer

        System.out.println("Digite o novo nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o novo CPF: ");
        String cpf = sc.nextLine();



        try {
            Driver driver = new Driver();
            DriverManager.registerDriver(driver);
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "senac@02");
            PreparedStatement stmt = c.prepareStatement("UPDATE biblioteca.clientes SET nome_cliente = ?, cpf_cliente = ? WHERE cliente_id = ?");
            stmt.setString(1,nome);
            stmt.setString(2, cpf);
            stmt.setInt(3, id);

            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Dados foram atualizados com sucesso!");
            } else {
                System.out.println("Erro ao atualizar os dados.");
            }

        } catch(SQLException e){
            e.printStackTrace();

        }

    }

    public static void deletarUsuario() {
        Scanner sc = new Scanner(System.in);
        buscarUsuarios();

        System.out.println("Digite o id do usuário que deseja remover: ");
        int id = sc.nextInt();
        sc.nextLine();

        try {
            Driver driver = new Driver();
            DriverManager.registerDriver(driver);

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "senac@02");

            PreparedStatement stmt = c.prepareStatement("DELETE FROM biblioteca.clientes WHERE cliente_id = ?");

            stmt.setInt(1, id);

            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0 ){
                System.out.println("Usuário deletado com sucesso. ");
            } else {
                System.out.println("Erro ao deletar usuário. %n Tente Novamente");
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}




