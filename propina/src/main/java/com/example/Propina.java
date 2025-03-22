package com.example;

import java.util.Scanner;

public class Propina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de la cuenta:");
        double valorCuenta = scanner.nextDouble();

        System.out.println("Ingrese el porcentaje de propina:");
        double porcentajePropina = scanner.nextDouble();

        double valorPropina = valorCuenta * (porcentajePropina/100 );
        double valorTotal = (valorCuenta+valorPropina);
        

        System.out.printf("El valor de la cuenta es: $%.2f%n" ,valorCuenta  );
        System.out.printf("El porcentaje de propina es: %.1f%%%n" ,porcentajePropina  );
        System.out.printf("El valor de la propina es: $%.2f%n" ,valorPropina  );
        System.out.printf("El valor total a pagar es: $%.2f%n" , valorTotal  );

        scanner.close();

    }
}