import java.util.Scanner;

public class LeituradeDados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scan.nextLine();  // Lê o nome

        System.out.println("Digite sua idade:");
        int idade = scan.nextInt();  // Lê a idade

        System.out.println("Digite sua altura:");
        float altura = scan.nextFloat();  // Lê a altura

        // Consumir a nova linha restante antes de ler a próxima string ou boolean
        scan.nextLine();  // Limpa o buffer

        System.out.println("Você tem animal de estimação? (true/false)");
        boolean temPet = scan.nextBoolean();  // Lê o boolean

        // Exibir os dados coletados
        System.out.println("\nSeu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Sua altura é: " + altura);
        System.out.println("Tem pet: " + temPet);

        scan.close();  // Fechar o Scanner após o uso
    }
}
