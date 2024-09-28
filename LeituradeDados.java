import java.util.Scanner;

public class LeituradeDados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome:\n");
        String nome = scan.nextLine();  // Corrigido para nextLine() com "L" maiúsculo
        System.out.println("Seu nome é: " + nome);
        
        scan.close();  // Feche o scanner após o uso
    }
}
