import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[] args){
        double saldo = 237.48;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem Vindo ao Banco Sintaxe!!");

        System.out.println("Digite o seu nome:");
        String nomeDoCliente = scanner.nextLine();

        System.out.println("Digite o número da agência: ");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Digite o número da conta: ");
        int numeroDaConta = scanner.nextInt();


        System.out.println("Olá " + nomeDoCliente +", obrigado por cirar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroDaConta + " e seu saldo " + saldo + "R$ já está disponivel para saque.");


    }
}
