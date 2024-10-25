package org.factoriaf5.imc;
import java.util.Scanner;

public class App {
   
    public static void main(String[] args) {

        IMC imc=new IMC();
        Scanner sc= new Scanner(System.in);
        System.out.println("Vamos a calcular tu IMC(Indice de masa corporal)");
        System.out.println("Dime tu peso");
        double peso=sc.nextDouble();
        System.out.println("Dime tu estatura");
        double estatura=sc.nextDouble();
        
        double resultado=imc.calcularIMC(peso,estatura);
        String categoria=imc.clasificarIMC(resultado);


        System.out.printf("Su IMC es: %.2f%n", resultado);
        System.out.println("Clasificación: " + categoria);

        sc.close();

    }


    
}
