import java.util.Scanner;

public class Fibonacci {
    public static int[] gerarFibonacci(int n) {
        int[] serie = new int[n];

        if (n >= 1) serie[0] = 0;
        if (n >= 2) serie[1] = 1;

        for (int i = 2; i < n; i++) {
            serie[i] = serie[i - 1] + serie[i - 2];
        }

        return serie;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números da série de Fibonacci a exibir: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, digite um número maior que zero.");
            return;
        }

        int[] fibonacciSerie = gerarFibonacci(n);

        System.out.print("Série de Fibonacci com " + n + " termos: [");
        for (int i = 0; i < fibonacciSerie.length; i++) {
            System.out.print(fibonacciSerie[i]);
            if (i < fibonacciSerie.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
