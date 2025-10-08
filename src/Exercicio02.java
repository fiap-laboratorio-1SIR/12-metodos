// escopo de variável --> local ou global
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lado1, lado2, lado3;

        System.out.print("Lado 1 --> ");
        lado1 = sc.nextDouble();
        System.out.print("Lado 2 --> ");
        lado2 = sc.nextDouble();
        System.out.print("Lado 3 --> ");
        lado3 = sc.nextDouble();
        if(lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            classificar(lado1, lado2, lado3); // argumentos --> valor passado para o método
        }
        else {
            System.out.println("Os valores não formam um triângulo");
        }

    }
    public static void classificar(double l1, double l2, double l3) { // parâmetros
        if(l1 == l2 && l2 == l3) {
            System.out.println("Triângulo equilátero");
        }
        else if(l1 == l2 || l1 == l3 || l2 == l3) {
            System.out.println("Triângulo isósceles");
        }
        else {
            System.out.println("Triângulo escaleno");
        }
    }
}
