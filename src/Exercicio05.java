import java.util.Random;

public class Exercicio05 {
    public static void main(String[] args) {

    }

    public static void inverter(int[] v) {
        int aux;
        int j = v.length - 1;
        for(int i = 0; i < v.length / 2; i++) {
            aux = v[i];
            v[i] = v[j];
            v[j] = aux;
            j--;
        }
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

}
