import java.util.Scanner;

public class FibonacciChecker {                     //class principal

    public static void main(String[] args) {
        // Objeto criado e inicializado
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para digitar um número
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        // Chama o método para verificar se o número pertence à sequência de Fibonacci
        if (pertenceAFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }

    // Método que verifica se um número pertence à sequência de Fibonacci
    public static boolean pertenceAFibonacci(int numero) {
        if (numero == 0 || numero == 1) {
            return true;
        }

        int a = 0;
        int b = 1;

        while (b < numero) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        return b == numero;
    }
}
