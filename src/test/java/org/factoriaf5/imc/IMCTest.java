package org.factoriaf5.imc;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IMCTest
{
    

    IMC calculator = new IMC();

    @Test
    void testDelgadezSevera() {
        assertEquals("Delgadez severa", calculator.calcularIMC(45, 1.75));
    }

    @Test
    void testDelgadezModerada() {
        assertEquals("Delgadez moderada", calculator.calcularIMC(49.5, 1.75));
    }

    @Test
    void testDelgadezLeve() {
        assertEquals("Delgadez leve", calculator.calcularIMC(55, 1.75));
    }

    @Test
    void testPesoNormal() {
        assertEquals("Peso normal", calculator.calcularIMC(68, 1.75));
    }

    @Test
    void testSobrepeso() {
        assertEquals("Sobrepeso", calculator.calcularIMC(80, 1.75));
    }

    @Test
    void testObesidadLeve() {
        assertEquals("Obesidad leve", calculator.calcularIMC(95, 1.75));
    }

    @Test
    void testObesidadModerada() {
        assertEquals("Obesidad moderada", calculator.calcularIMC(110, 1.75));
    }

    @Test
    void testObesidadMorbida() {
        assertEquals("Obesidad mórbida", calculator.calcularIMC(125, 1.75));
    }

    @Test
    void testValorFueraDeRangoPesoCero() {
        assertEquals("Valor fuera de rango", calculator.calcularIMC(0, 1.75));
    }

    @Test
    void testValorFueraDeRangoEstaturaCero() {
        assertEquals("Valor fuera de rango", calculator.calcularIMC(68, 0));
    }

    @Test
    void testValorFueraDeRangoPesoNegativo() {
        assertEquals("Valor fuera de rango", calculator.calcularIMC(-68, 1.75));
    }

    @Test
    void testValorFueraDeRangoEstaturaNegativa() {
        assertEquals("Valor fuera de rango", calculator.calcularIMC(68, -1.75));
    }
}
    

    



