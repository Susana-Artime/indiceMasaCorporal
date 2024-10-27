package org.factoriaf5.imc;

public class IMC

{
    public double calcularIMC(double peso, double estatura){
        
        double imc= peso/Math.pow(estatura, 2);
        return imc;

    }

    public String clasificarIMC(double imc) {

        if (imc < 0) {
            return "Valor fuera de rango"; 
        } else if (imc < 16) {
            return "Delgadez severa";
        } else if (imc >= 16 && imc < 17) {
            return "Delgadez moderada";
        } else if (imc >= 17 && imc < 18.5) {
            return "Delgadez leve";
        } else if (imc >= 18.5 && imc < 25) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 30) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc < 35) {
            return "Obesidad leve";
        } else if (imc >= 35 && imc < 40) {
            return "Obesidad moderada";
        } else {
            return "Obesidad mórbida"; 
        }

    }
}