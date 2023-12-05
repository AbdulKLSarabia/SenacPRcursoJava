import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner senhas1 = new Scanner(System.in);
        System.out.println("Digite uma senha");
        String senha = senhas1.next();
        System.out.println(senha);

        Scanner senhas2 = new Scanner(System.in);
        System.out.println("Confirme sua senha");
        String confirmaSenha = senhas2.next();
        System.out.println(confirmaSenha);

        if (senha.equals(confirmaSenha)) {
            System.out.println("As senhas são iguais");

        } else {
            System.out.println("As senhas são diferentes");
        }
    }
}