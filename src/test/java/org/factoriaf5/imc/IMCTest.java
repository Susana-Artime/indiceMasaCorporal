package org.factoriaf5.imc;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IMCTest
{
    

    IMC calculator = new IMC();

    @Test
    public void testCalcularIMCNormal() {
        
        double imc = calculator.calcularIMC(70, 1.75);
        assertEquals(22.86, imc, 0.01);
    
    }

    @Test
    public void testCalcularIMCBajo() {

        double imc = calculator.calcularIMC(50, 1.80);
        assertEquals(15.43, imc, 0.01);

    }

    @Test
    public void testCalcularIMCAlto() {

        double imc = calculator.calcularIMC(90, 1.60);
        assertEquals(35.16, imc, 0.01);

    }

    @Test
    public void testClasificarIMCDS() {
                
        assertEquals("Delgadez severa", calculator.clasificarIMC(15.0));
        assertEquals("Delgadez severa", calculator.clasificarIMC(14.99));
    }

    
    @Test
    public void testClasificarIMCDM() {

        assertEquals("Delgadez moderada", calculator.clasificarIMC(16.0));
        assertEquals("Delgadez moderada", calculator.clasificarIMC(16.99));
        
        
    }


    @Test
    public void testClasificarIMCDL() {

        assertEquals("Delgadez leve", calculator.clasificarIMC(17.0)); 
        assertEquals("Delgadez leve", calculator.clasificarIMC(18.49));
        assertEquals("Delgadez leve", calculator.clasificarIMC(17.5));

    }

    @Test
    public void testClasificarIMCPN() {

        assertEquals("Peso normal", calculator.clasificarIMC(18.5));
        assertEquals("Peso normal", calculator.clasificarIMC(24.99));  
        assertEquals("Peso normal", calculator.clasificarIMC(22.5));
        assertEquals("Peso normal", calculator.clasificarIMC(24.9));
    }

    @Test
    public void testClasificarIMCS() {

        assertEquals("Sobrepeso", calculator.clasificarIMC(25.0));
        assertEquals("Sobrepeso", calculator.clasificarIMC(29.99));
        assertEquals("Sobrepeso", calculator.clasificarIMC(27.0));
        
    }

    @Test
    public void testClasificarIMCOL() {

        
        assertEquals("Obesidad leve", calculator.clasificarIMC(30.0));
        assertEquals("Obesidad leve", calculator.clasificarIMC(34.99));
        assertEquals("Obesidad leve", calculator.clasificarIMC(33));

        
    }

    @Test
    public void testClasificarIMCOMod() {

        assertEquals("Obesidad moderada", calculator.clasificarIMC(35.0));
        assertEquals("Obesidad moderada", calculator.clasificarIMC(37));        
        assertEquals("Obesidad moderada", calculator.clasificarIMC(39.99)); 

    }

    @Test
    public void testClasificarIMCOMor() {

        assertEquals("Obesidad mórbida", calculator.clasificarIMC(40.0));
        assertEquals("Obesidad mórbida", calculator.clasificarIMC(100.0));
    }
    
}
        



