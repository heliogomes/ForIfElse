import groovy.console.ui.SystemOutputInterceptor;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int maior = 0;
        int soma = 0;
        int somaPares = 0;

        int[] array = new int[10];

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira 10 valores inteiros:");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            soma = soma + array[i];

            if (array[i] > maior) {
                maior = array[i];
            }
            if (array[i] % 2 == 0) {
                somaPares += array[i];
            }

        }

        System.out.println("Maior número: " + maior);
        System.out.println("A soma de todos os número é: " + soma);
        System.out.println("Soma números pares: " + somaPares);
    }
}
