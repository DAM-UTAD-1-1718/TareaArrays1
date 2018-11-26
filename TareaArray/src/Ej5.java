import java.util.Scanner;

public class Ej5 {
	public static boolean casoDePrueba(Scanner in) {
		// Variable que controla si el caso hay que analizarlo o finaliar
		boolean continuar = true;
		// Se lee la candidad de piezas o el caso especial que es 0
		int cantidad = in.nextInt();
		// Si es el caso especial, no se ejecuta nada y continuar = false
		if (cantidad == 0)
			continuar = false;
		else {
			// Declaraci�n del array con las alturas de las monta�as
			int[] alturas = new int[cantidad];
			// Lectura de las cotas (diferentes alturas)
			for (int i = 0; i < alturas.length; i++) {
				alturas[i] = in.nextInt();
			}
			// Proceso -> B�squeda de picos
			int picos = 0;
			// Caso cicular 1: El primero debe ser mayor que el �ltimo y mayor que el
			// segundo
			if (alturas[0] > alturas[1] && alturas[0] > alturas[alturas.length - 1]) {
				picos = 1;
			}
			// Caso ciruclar 2: El �ltimo debe ser mayor que el anterior y mayor que el
			// primero
			else if (alturas[alturas.length - 1] > alturas[alturas.length - 2]
					&& alturas[alturas.length - 1] > alturas[0]) {
				picos = 1;
			}
			// Casos intermedios
		
			
			for (int i = 1; i < alturas.length-1; i++) {
				if (alturas[i+1]<alturas[i] && alturas[i-1]<alturas[i]) {
					picos++;
				}
			}
			
			// Salida
			System.out.println(picos);
		}
		return continuar;

	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		// Casos de prueba limitado por un caso especial
		while (casoDePrueba(in))
			;
	}

}
