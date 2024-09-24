package ejercicio2;

import java.util.Random;
import java.util.Scanner;

public class EjercicioA {

	// Función auxiliar para generar un número aleatorio entre 0 y 10
	public static int generarNumeroAleatorio() {
		Random random = new Random();
		return random.nextInt(11); // Genera un número entre 0 y 10
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Pedir el número de columnas al usuario
		System.out.print("Introduce el número de columnas para la matriz: ");
		int columnas = sc.nextInt();

		// Crear la matriz con 5 filas y 'columnas' columnas
		int[][] matriz = new int[5][columnas];

		// Rellenar la matriz con números aleatorios
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < columnas; j++) {
				matriz[i][j] = generarNumeroAleatorio();
			}
		}

		// Mostrar la matriz
		System.out.println("Matriz generada:");
		for (int i = 0; i < 5 ; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}
}
