
import java.util.Scanner;

public class triangulos {

    private int size;
    private int[][] matriz;
    private Scanner sc;

    public triangulos(int size) {
        this.size = size;
        this.matriz = new int[size][size];
        this.sc = new Scanner(System.in);
    }

    public void insertaMatriz(int valor) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matriz[i][j] = valor;
            }
        }
    }

    public void imprimirMatriz() {
        System.out.println("Matriz ingresada:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void imprimirTrianguloA() {
        System.out.println("Triángulo a):");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void imprimirTrianguloB() {
        System.out.println("Triángulo b):");
        for (int i = size - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(matriz[size - i - 1][j] + " ");
            }
            System.out.println();
        }
    }
}
