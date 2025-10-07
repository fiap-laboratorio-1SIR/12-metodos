
/* programa em Java contendo um método. O método deverá fazer a entrada
de um valor inteiro e, em seguida, fazer a impressão da tabuada do valor
fornecido.
 */

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        calcular();
    }

    public static void calcular() {
        Scanner sc = new Scanner(System.in);
        int valor, resultado;
        System.out.print("Informe um valor inteiro --> ");
        valor = sc.nextInt();
        for(int cont = 0; cont <= 10; cont++) {
            resultado = valor * cont;
            System.out.println(valor + " x " + cont + " = " + resultado);
        }
    }
}
