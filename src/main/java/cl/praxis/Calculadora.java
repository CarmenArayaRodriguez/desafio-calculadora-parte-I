package cl.praxis;

public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(int a, int b) {
        if (b == 0) {
            // Lanzar una excepción ayuda a evitar errores de división por cero durante la ejecución.
            throw new IllegalArgumentException("El divisor no puede ser cero.");
        }

        // Conversión explícita para obtener un resultado decimal.
        return (double) a / b;
    }
}
