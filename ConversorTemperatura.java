import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String continuar = "s";
        while (continuar.equals("s")) {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer
            
            double fahrenheit = (celsius * 9/5) + 32; 
            double kelvin = celsius + 273.15;

            System.out.println(celsius + "°c equivale a:");
            System.out.println( fahrenheit + "°F");
            System.out.println( kelvin + "K");

            System.out.print("Converter outra temperatura? (s/n): ");
            continuar = scanner.nextLine();
        }
    }
}
