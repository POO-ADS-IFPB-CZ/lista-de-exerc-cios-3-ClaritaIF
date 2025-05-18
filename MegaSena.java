import java.util.Arrays;
import java.util.Scanner;

public class MegaSena {

    public static void main(String[] args) {
        int[] numeros = lerNumerosDoUsuario();
        Arrays.sort(numeros);
        exibirNumeros(numeros);
    }

    private static int[] lerNumerosDoUsuario() {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];
        int contador = 0;

        System.out.println("Digite 6 números distintos entre 1 e 60:");

        while (contador < 6) {
            System.out.printf("Número %d: ", contador + 1);
            int numero = scanner.nextInt();

            if (!numeroValido(numero)) {
                System.out.println("Número inválido. Digite um número entre 1 e 60.");
                continue;
            }

            if (numeroDuplicado(numeros, contador, numero)) {
                System.out.println("Número já inserido. Digite um número diferente.");
                continue;
            }

            numeros[contador++] = numero;
        }

        return numeros;
    }

    private static boolean numeroValido(int numero) {
        return numero >= 1 && numero <= 60;
    }

    private static boolean numeroDuplicado(int[] numeros, int tamanhoAtual, int numero) {
        for (int i = 0; i < tamanhoAtual; i++) {
            if (numeros[i] == numero) {
                return true;
            }
        }
        return false;
    }

    private static void exibirNumeros(int[] numeros) {
        System.out.println("Números escolhidos em ordem crescente:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
