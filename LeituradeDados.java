import java.util.Scanner;

public class LeituradeDados {
    
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite seu nome:");
            String nome = scan.nextLine();
            
            System.out.println("Digite sua idade:");
            int idade = scan.nextInt();
            
            System.out.println("Digite sua altura:");
            float altura = scan.nextFloat();
            
            System.out.println("Voce tem animal de estimacao? (true/false)");
            boolean temPet = scan.nextBoolean();
            
            System.out.println("\nSeu nome e: " + nome);
            System.out.println("Sua idade e: " + idade);
            System.out.println("Sua altura e: " + altura);
            System.out.println("Tem pet: " + temPet);
        }  
    }
}
