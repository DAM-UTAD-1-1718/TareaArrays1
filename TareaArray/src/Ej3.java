import java.util.Scanner;

public class Ej3 {
	public static void casoDePrueba (Scanner in) {
		int DaysMonth [] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int day = in.nextInt();
		int month = in.nextInt();
		int total = 0;
		int total2 = 0;
		int total3 = 0;
		total = DaysMonth [month-1] -day;
		total2 = 12 - month;
		System.out.print("Faltan " + total + " dias para que termine el mes");
		System.out.println(" y " + total2 + " meses para que termine el año.");
		total3 = total3 + total ;
		for (int i = 0; i < DaysMonth.length; i++) {
			if (month-1 < i) {
				total3 = total3 + DaysMonth[i];
			}
		}
		System.out.print(total3 + " dias para que termine el año.");
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numCasos = Integer.parseInt(in.nextLine());
		for (int i = 0; i < numCasos; i++) {
			casoDePrueba(in);
		}
	}
}
