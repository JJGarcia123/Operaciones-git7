import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc = 0;
		int sum1 = 0, sum2 = 0;
		int mult1 = 0, mult2 = 0, res_mult = 0;
		Scanner sn = new Scanner(System.in);

		do {
			menu();
			opc = sn.nextInt();
			switch (opc) {
			case 1:
				System.out.print("Sumar dos números: \n" + "Introduce el primer número: ");
				sum1 = sn.nextInt();
				System.out.print("Introduce el segundo número: ");
				sum2 = sn.nextInt();
				System.out.println(suma2(sum1, sum2));
				break;

			case 2:
				System.out.print("Multiplicar dos números: \n" + "Introduce el primer número: ");
				mult1 = sn.nextInt();
				System.out.print("Introduce el segundo número: ");
				mult2 = sn.nextInt();
				System.out.println(multiplicar2(mult1, mult2));
				break;

			case 3:
				System.out.println("Has salido del sistema.");
				break;

			default:
				System.out.println("Opción incorrecta.");
				break;
			}
		} while (opc != 3);
	}

	public static void menu() {
		System.out.println("1. Suma. \n" + "2. Multiplicación. \n" + "3. Salir." + "Seleccione una opción: ");
	}

	public static int suma2(int sum1, int sum2) {
		int res_sum = 0;
		res_sum = sum1 + sum2;
		return res_sum;
	}

	public static int multiplicar2(int mult1, int mult2) {
		int res_mult = 0;
		res_mult = mult1 * mult2;
		return res_mult;
	}

}
