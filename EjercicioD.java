package ejercicio2;

import java.util.Scanner;

public class EjercicioD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tabla = new int[10];
        int contador = 0;

        // Solicitar 5 números y almacenarlos en la tabla
        System.out.println("Ingrese 5 números en orden creciente:");
        while (contador < 5) {
            int num = scanner.nextInt();
            if (contador == 0 || num >= tabla[contador - 1]) {
                tabla[contador] = num;
                contador++;
            } else {
                System.out.println("El número debe ser mayor o igual al anterior. Intente de nuevo:");
            }
        }

        // Mostrar la tabla antes de la inserción
        System.out.print("Tabla antes de la inserción: ");
        for (int i = 0; i < contador; i++) {
            System.out.print(tabla[i] + " ");
        }
        System.out.println();

        // Solicitar un número N para insertar
        System.out.print("Ingrese un número N para insertar en la tabla: ");
        int N = scanner.nextInt();

        // Insertar N en la tabla en el lugar adecuado
        int pos = 0;
        while (pos < contador && tabla[pos] < N) {
            pos++;
        }
        // Mover elementos a la derecha para hacer espacio
        for (int i = contador; i > pos; i--) {
            tabla[i] = tabla[i - 1];
        }
        // Insertar el número N
        tabla[pos] = N;
        contador++;

        // Mostrar la tabla después de la inserción
        System.out.print("Tabla después de la inserción: ");
        for (int i = 0; i < contador; i++) {
            System.out.print(tabla[i] + " ");
        }
    }
}

