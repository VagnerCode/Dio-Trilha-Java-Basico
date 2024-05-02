import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {
        // Declaração das variáveis para armazenar os dados da conta
        int numero;
        String agencia, nomeCliente;
        double saldo;

        // Criação do objeto Scanner para receber entrada do terminal
        Scanner scanner = new Scanner(System.in);

        // Solicita e recebe os dados da conta do usuário
        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        numero = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner

        System.out.println("Por favor, digite o nome do Cliente:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta:");
        saldo = scanner.nextDouble();

        // Fecha o scanner para liberar os recursos
        scanner.close();

        // Exibe a mensagem com as informações da conta
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }


}
