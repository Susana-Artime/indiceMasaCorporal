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
        
        String resultado=imc.calcularIMC(peso,estatura);

        System.out.println("Clasificación segun su IMC: " + resultado);
       
        sc.close();
        
    }

}


    
