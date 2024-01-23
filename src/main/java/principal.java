
import java.util.Scanner;


public class principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de la matriz cuadrada MxM: ");
        int M = scanner.nextInt();

        System.out.println("Ingrese el valor entero para la matriz cuadrada MxM: ");
        int valor = scanner.nextInt();

        triangulos triangulos = new triangulos(M);

        triangulos.insertaMatriz(valor);

        triangulos.imprimirMatriz();

        triangulos.imprimirTrianguloA();

        System.out.println();

        triangulos.imprimirTrianguloB();
        
        System.out.println("El programa se subio a GitHub");
    }
}

