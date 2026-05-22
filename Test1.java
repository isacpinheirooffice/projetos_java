package Tests_java;
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {

        // Scanner para receber dados
        Scanner scanner = new Scanner(System.in);

        // Login correto
        String loginCorreto = "admin";

        // Senha correta
        String senhaCorreta = "1234";

        // idade correta
        String idadeCorreta = "18";

        // Entrada do usuário
        String login;
        String senha;
        String idade;

        // Pedir login
        System.out.println("Digite seu login:");
        login = scanner.nextLine();

        // Pedir senha
        System.out.println("Digite sua senha:");
        senha = scanner.nextLine();

        // Pedir idade
        System.out.println("Digite sua idade:");
        idade = scanner.nextLine();

        // Verificação
        if(login.equals(loginCorreto) && senha.equals(senhaCorreta) && idade.equals(idadeCorreta)) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Login não encontrado. Tente novamente.");   
            
        }
        scanner.close();
    }
}
