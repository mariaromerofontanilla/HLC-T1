package ejercicio2;

import java.util.Scanner;

public class EjercicioC {

    public static void main(String[] args) {
    	// Creacion de Scanner
        Scanner sc = new Scanner(System.in);
        
        // Atributos
        int filas;
        int columnas;
        
        // Pedir las dimensiones de la matriz
        System.out.print("Introduce el número de filas: ");
        filas = sc.nextInt();
        System.out.print("Introduce el número de columnas: ");
        columnas = sc.nextInt();
        
        // Crear la matriz
        // Se crea la matriz bidimensional (int[][] array) con las dimensiones especificadas por el usuario.
        int[][] array = new int[filas][columnas];
        
        // Rellenar la matriz con 0s y 1s para formar el marco
        // Se utiliza un bucle anidado para recorrer cada posición de la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                // Colocar 1 en los bordes
                if (i == 0 || i == filas - 1 || j == 0 || j == columnas - 1) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }
        
        // Mostrar la matriz
        // Se imprimen los elementos de la matriz en la consola, mostrando el marco de 1s y 0s.
        System.out.println("Matriz marco:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        
        // Cierre del Scanner
        sc.close();
    }
}

