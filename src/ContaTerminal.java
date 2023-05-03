import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("11Por favor, digite o número da sua conta:");
        int numero = sc.nextInt();

        sc.nextLine(); // necessário para "escapar" o \n vindo do nextInt, já que não é consumido
        System.out.println("Por favor, digite o número da agência:");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o nome do seu cliente:");
        String nomeCliente = sc.nextLine();
        
        System.out.println("Por favor, digite o saldo:");
        double saldo = Double.parseDouble(sc.nextLine());

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
        sc.close();
    }
}
