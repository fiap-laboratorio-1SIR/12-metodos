import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;
        System.out.print("Informe um valor --> ");
        valor = sc.nextInt();
        if(valor < 0) {
            System.out.println("o valor deve ser positivo");
        }
        else {
            imprimir(valor);
        }
    }

    public static void imprimir(int valor) {
        for(int cont = 1; cont <= valor; cont++) {
            if(valor % cont == 0) {
                System.out.println(-cont + " " + cont);
            }
        }
    }
}
