import java.util.Scanner;

public class LeituradeDados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scan.nextLine();  

        System.out.println("Digite sua idade:");
        int idade = scan.nextInt();  

        System.out.println("Digite sua altura:");
        float altura = scan.nextFloat();  

        scan.nextLine();  

        System.out.println("Você tem animal de estimação? (true/false)");
        boolean temPet = scan.nextBoolean();  

        System.out.println("\nSeu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Sua altura é: " + altura);
        System.out.println("Tem pet: " + temPet);

        scan.close();  
    }
}
