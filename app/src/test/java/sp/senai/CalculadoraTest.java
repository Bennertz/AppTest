package sp.senai;

import junit.framework.TestCase;

public class CalculadoraTest extends TestCase {
    public void testSomar() {
        Calculadora c = new Calculadora();
        int resultado = c.somar(2,4);
        assertEquals(6, resultado);
    }
    public void testSubtrair() {
        Calculadora c = new Calculadora();
        int resultado = c.subtrair(6,4);
        assertEquals(2, resultado);
    }
    public void testMultiplicar() {
        Calculadora c = new Calculadora();
        int resultado = c.multiplicar(10,4);
        assertEquals(40, resultado);
    }
    public void testDividir() {
        Calculadora c = new Calculadora();
        int resultado = c.dividir(10,2);
        assertEquals(5, resultado);
    }
}
