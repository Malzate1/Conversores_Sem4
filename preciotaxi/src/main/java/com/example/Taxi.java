package com.example;

import java.util.Scanner;

public class Taxi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tiempo que espera pasar en tráfico:");
        double tiempoEspera = scanner.nextDouble();


        double distancia = 8.2;
        double tarifaBase = 4000.0;
        double valorKm = 900.0;
        double valorMin = 150.0;

        double valorTotalDistancia= (distancia*valorKm);
        double valorTotalTiempoViaje= (tiempoEspera*valorMin);
        double precioTotal= tarifaBase+valorTotalDistancia+valorTotalTiempoViaje; 


        System.out.printf("El precio total del viaje es: $%.2f",precioTotal);

        scanner.close();

    }
}