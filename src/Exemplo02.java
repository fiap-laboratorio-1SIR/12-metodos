/* programa em java para ler dois valores no método main. Em seguida, um
método deverá somar e imprimir os dois valores.
 */

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1, valor2, resultado;

        System.out.print("Valor 1 --> ");
        valor1 = sc.nextInt();
        System.out.print("Valor 2 --> ");
        valor2 = sc.nextInt();

        somar(valor1, valor2);

    }

    public static void somar(int valor1, int valor2) {
        int resultado;
        resultado = valor1 + valor2;
        System.out.println(resultado);
    }
}
