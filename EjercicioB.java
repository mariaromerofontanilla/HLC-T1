package ejercicio1;

import java.util.Scanner;

class FechaIncorrectaException extends Exception {
	public FechaIncorrectaException(String message) {
		super(message);
	}
}

public class EjercicioB {

	// Método para calcular la diferencia en días entre dos fechas
	public static int calcularDiferenciaDias(String fecha1, String fecha2) throws FechaIncorrectaException {
		// Validar y convertir fechas
		int dias1 = convertirADias(fecha1);
		int dias2 = convertirADias(fecha2);

		// Retornar la diferencia absoluta en días
		return Math.abs(dias1 - dias2);
	}

	// Método para convertir una fecha en días desde una fecha base
	private static int convertirADias(String fecha) throws FechaIncorrectaException {
		// Comprobar si la fecha es válida
		if (!fecha.matches("\\d{2}/\\d{2}/\\d{4}")) {
			throw new FechaIncorrectaException("Formato de fecha incorrecto: " + fecha);
		}

		// Separar la fecha en día, mes y año
		String[] partes = fecha.split("/");
		int dia = Integer.parseInt(partes[0]);
		int mes = Integer.parseInt(partes[1]);
		int anio = Integer.parseInt(partes[2]);

		// Lanza una excepción si la fecha es la de nacimiento
		if (dia == 1 && mes == 1 && anio == 2000) { // Cambia esto por tu fecha de nacimiento
			throw new FechaIncorrectaException("Esta es tu fecha de nacimiento: " + fecha);
		}

		// Calcular días totales (suponiendo 30 días por mes y 365 días por año)
		return dia + (mes - 1) * 30 + anio * 365;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido al restador de fechas. El formato de una fecha es: dd/MM/yyyy");

		// Pedir las fechas al usuario
		System.out.print("Escriba la primera fecha: ");
		String fecha1 = sc.nextLine();
		System.out.print("Escriba la segunda fecha: ");
		String fecha2 = sc.nextLine();

		// Elegir el orden de las fechas
		System.out.print("¿Cuál de las 2 fechas será la primera? (Elija 1 o 2): ");
		int orden = sc.nextInt();

		try {
			// Calcular la diferencia en días
			int diferenciaDias = calcularDiferenciaDias(fecha1, fecha2);

			// Mostrar las fechas en el orden correcto
			if (orden == 1) {
				System.out.println("La primera fecha es entonces: " + fecha1);
				System.out.println("La segunda fecha es entonces: " + fecha2);
			} else {
				System.out.println("La primera fecha es entonces: " + fecha2);
				System.out.println("La segunda fecha es entonces: " + fecha1);
			}

			// Mostrar la diferencia
			System.out.println("La diferencia de días es: " + diferenciaDias);
		} catch (FechaIncorrectaException e) {
			System.out.println("Se ha producido el siguiente error: " + e.getMessage());
			System.out.println("Formato de fechas incorrectas. Cerrando la aplicación.");
		}

		sc.close();
	}
}
