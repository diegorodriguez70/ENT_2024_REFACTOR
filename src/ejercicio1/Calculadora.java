package ejercicio1;

public class Calculadora {
	public int sumar(int sumando1, int sumando2) {
		int suma = sumando1 + sumando2;
		return suma;
	}

	public int restar(int minuendo, int sustraendo) {
		int resta = minuendo - sustraendo;
		return resta;
	}

	public int multiplicar(int factor1, int factor2) {
		int multiplicacion = factor1 * factor2;
		return multiplicacion;
	}

	public int dividir(int dividendo, int divisor) {
		try {
			int division = dividendo / divisor;
			return division;

		} catch (Exception e) {

			System.out.print(e.getMessage());
			return 0;
		}
	}

}
