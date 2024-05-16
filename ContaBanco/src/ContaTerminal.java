import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o usuário: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o número da Agência: ");
        String agencia = scanner.next();
        scanner.nextLine();
        
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá " + nomeCliente + ", " + "obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", " + "conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
