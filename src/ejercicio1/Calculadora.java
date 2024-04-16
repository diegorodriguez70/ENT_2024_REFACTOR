package ejercicio1;

public class Calculadora {
	public int sumar(int a, int b) {
		int suma = a + b;
		return suma;
	}

	public int restar(int a, int b) {
		int resta = a - b;
		return resta;
	}

	public int multiplicar(int a, int b) {
		int multiplicacion = a * b;
		return multiplicacion;
	}

	public int dividir(int a, int b) {
		try {
			int division = a / b;
			return division;

		} catch (Exception e) {

			System.out.println("No se puede dividir entre 0");
			return 0;
		}
	}

}
