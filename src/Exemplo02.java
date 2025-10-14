/* programa em java para ler dois valores no método main. Em seguida, um
método deverá somar e imprimir os dois valores.
 */

// escopo de variável --> local onde a variável pode ser acessada
// escopo local --> variáveis declaradas no método
// escopo global --> a variável pode ser acessada em todo o programa

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1, valor2, resultado;

        System.out.print("Valor 1 --> ");
        valor1 = sc.nextInt();
        System.out.print("Valor 2 --> ");
        valor2 = sc.nextInt();

        resultado = somar(valor1, valor2); // argumentos --> valores enviaados para o método
        System.out.println("resultado = " + resultado);

    }

    public static int somar(int valor1, int valor2) {
        int resultado;
        resultado = valor1 + valor2;
        return resultado;
    }
}
