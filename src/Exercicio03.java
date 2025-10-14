import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1, valor2, valor3, resultado;

        System.out.print("Valor 1 --> ");
        valor1 = sc.nextInt();
        System.out.print("Valor 2 --> ");
        valor2 = sc.nextInt();
        System.out.print("Valor 3 --> ");
        valor3 = sc.nextInt();

        System.out.println("maior valor = " + acharMaior(valor1, valor2, valor3));

    }

    public static int acharMaior(int x, int y, int z) {
        if(x > y && x > z) {
            return x;
        }
        else if(y > z) {
            return y;
        }
        return z;
    }
}
