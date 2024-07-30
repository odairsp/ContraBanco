import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta:");
        int number =  scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, digite o número da Agência:");
        String agency =  scanner.nextLine();
        System.out.println("Por favor, digite seu nome:");
        String name =  scanner.nextLine();
        System.out.println("Por favor, digite seu saldo:");
        float balance =  scanner.nextFloat();
        scanner.close();
        System.out.printf("\nOlá "+name+", obrigado por criar uma conta em nosso banco,\nsua agência é "+agency+", conta "+number+" e seu saldo de %.2f de reais, já está disponível para saque.", balance);
        
    }
}
