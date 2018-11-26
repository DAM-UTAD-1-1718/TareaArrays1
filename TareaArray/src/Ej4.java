import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {
	public static boolean casoDePrueba(Scanner in) {
		boolean continuar = true;
		int cantidad = in.nextInt();
		if (cantidad == 0)
			continuar = false;
		else {
			int[] puzzle = new int[cantidad - 1];
			for (int i = 0; i < puzzle.length; i++) {
				puzzle[i] = in.nextInt();
			}
			Arrays.sort(puzzle);
			int pieza = 0;
			for (int i = 0; i < puzzle.length; i++) {
				if (puzzle[i] == i+1) {
					pieza = puzzle[i]+1;
				}
				if (puzzle[0] != 1) {
					pieza = 1;
				}
		
			}
			System.out.println(pieza);
		}
		return continuar;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (casoDePrueba(in))
			;
	}
}
