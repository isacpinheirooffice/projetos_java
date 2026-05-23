import java.util.Scanner;

public class CadastroAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dados do aluno
        String continuar = "s";
            while (continuar.equals("s")) {

        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();
        System.out.println("Digite a nota do aluno:");
        double nota = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer


        // Verificação da nota
        if (nota >= 7.0) {
            System.out.println(nome + " foi APROVADO!");
        } else {
            System.out.println(nome + " foi REPROVADO!");   
        }
        System.out.println("Cadastrar outro aluno? (s/n)");
        continuar = scanner.nextLine();
     }
     System.out.println("Sistema encerrado.");
    }
}