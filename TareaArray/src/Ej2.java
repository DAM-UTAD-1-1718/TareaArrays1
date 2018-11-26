import java.util.Arrays;

public class Ej2 {
	public static void main (String[] args) {
		int [] numeros = {1,4,9,7,3,2,5,11,0,9};
		for (int i = 0; i < numeros.length/2; i++) {
			int numeros2 = numeros[i];
			numeros[i] = numeros [numeros.length/2+i];
			numeros[(numeros.length/2)+i] = numeros2;
		}
		System.out.println(Arrays.toString(numeros));
	}
}
