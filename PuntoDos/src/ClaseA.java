public class ClaseA {
	public static void PuntoA() {
		String resultado = "";
		String letra = "a";

		for (int i = 0; i < 7; i++) {
			letra = obtenerLetra(i);
			resultado = letra + resultado + letra;

		}
		System.out.println(resultado);
	}

	public static void PuntoB() {
		String letra = "";
		String resultado = "";

		for (int i = 0; i < 3; i++) {
			letra = obtenerLetra(i);

			for (int a = 0; a < 5; a++) {
				resultado = resultado + letra;
			}
		}

		System.out.println(resultado);
	}

	public static void PuntoC() {
		for (int i = 1; i < 7; i++) {
			System.out.print(i);
		}
		System.out.println("");
		for (int i = 7; i < 13; i++) {
			System.out.print(i);
		}
		System.out.println("");
		for (int a = 1; a < 11; a++) {
			System.out.print(a);
		}
		System.out.println("");
		for (int a = 11; a < 21; a++) {
			System.out.print(a);

		}
		System.out.println("");
	}

	public static void PuntoD() {

		int fibo1, fibo2;
		fibo1 = 1;
		fibo2 = 1;
		System.out.println("a");
		for (int i = 2; i <= 7; i++) {
			fibo2 = fibo1 + fibo2;
			fibo1 = fibo2 - fibo1;
			for (int j = 0; j < fibo2; j++) {
				System.out.print("a");
			}
			System.out.println();
		}
	}

	private static String obtenerLetra(int i) {
		String letra = "";

		if (i == 0)
			letra = "a";
		else if (i == 1)
			letra = "b";
		else if (i == 2)
			letra = "c";
		else if (i == 3)
			letra = "d";
		else if (i == 4)
			letra = "e";
		else if (i == 5)
			letra = "f";

		return letra;
	}

}