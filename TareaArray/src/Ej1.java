import java.util.Scanner;

public class Ej1 {
	
		int [] notas;
		Scanner sc;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		public void pedirNotas (int cantidad) {
			sc = new Scanner (System.in);
			notas = new int [cantidad];
			for (int i = 0; i < notas.length; i++) {
				System.out.printf("Introduzca la nota del alumno %d: ", i + 1);
				notas [i]= sc.nextInt();
			}
		}
		public void calcularDiferencia () {
			for(int i = 0; i < notas.length; i++)
			{
				if(min>notas[i])
				{
					min=notas[i];
				}
				if(max<notas[i])
				{
					max=notas[i];
				}
			}
			int diferencia = max - min;
			System.out.println("La diferencia es: " + diferencia);
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			Ej1 ejemplo = new Ej1();
			int elementos = Integer.parseInt(sc.nextLine());
			ejemplo.pedirNotas(elementos);
			ejemplo.calcularDiferencia();
	}
}
