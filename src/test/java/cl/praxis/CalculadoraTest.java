package cl.praxis;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest {
    private Calculadora calc = new Calculadora();

    @Test
    public void testSumar() {
        assertEquals(5, calc.sumar(2, 3), "La suma de 2 y 3 debe ser 5");
    }

    @Test
    public void testRestar() {
        assertEquals(-1, calc.restar(2, 3), "La resta de 2 y 3 debe ser -1");
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6, calc.multiplicar(2, 3), "El producto de 2 y 3 debe ser 6");
    }

    @Test
    public void testDividir() {
        assertEquals(2.0, calc.dividir(6, 3), 0.001, "La división de 6 por 3 debe ser 2.0");
    }

    @Test
    public void testDividirPorCero() {
        // Verifica que el método dividir lanza una excepción cuando el divisor es cero.
        // Es crucial para evitar que la aplicación se caiga por errores en tiempo de ejecución.
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(1, 0), "La división por cero debe lanzar una IllegalArgumentException");
    }
}

