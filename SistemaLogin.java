import java.util.Scanner;

public class SistemaLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";

        int tentativas = 0;
        int maxTentativas = 3;
        
        while (tentativas < maxTentativas) {
            System.out.print("Digite o nome de usuário: ");
            String usuario = scanner.nextLine();
            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();

            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                System.out.println("Login realizado com sucesso!");
                break;
            } else {
                System.out.println("Usuário ou senha incorretos. Tente novamente.");
                tentativas++;
            }       
        }
            if (tentativas == maxTentativas) {
            System.out.println("Conta bloqueada! Número máximo de tentativas atingido.");
        }
    }
}    
