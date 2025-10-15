import java.util.Random;

public class Exemplo03 {
    public static void main(String[] args) {
        int[] v = new int[10];

        preencher(v);
        System.out.println("Dados do vetor");
        imprimir(v);
        System.out.println("\nsoma dos valores " + somar(v));
        System.out.println("média dos valores " + calcularMedia(v));
        System.out.println("maior valor armazenado " + maiorValor(v));

    }

    public static int somar(int[] v) {
        int soma = 0;
        for(int i : v) {
            soma += i;
        }
        return soma;
    }

    public static void imprimir(int[] v) {
        for(int i : v) {
            System.out.print(i + " ");
        }
    }

    public static void preencher(int[] v) {
        Random rd = new Random();
        for(int i = 0; i < v.length; i++) {
            v[i] = rd.nextInt(50);
        }
    }

    public static int maiorValor(int[] v) {
        int maior = Integer.MIN_VALUE;
        for(int i : v) {
            if(i > maior) {
                maior = i;
            }
        }
        return maior;
    }

    public static double calcularMedia(int[] v) {
        return (double) somar(v) / v.length;
    }
}
