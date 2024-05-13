package com.alura.conversordemonedas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ConsultaConversion consulta = new ConsultaConversion();
        Conversion conversion;
        int opcion;
        double base;
        double convertido;
        double cantidad;
        String menu = """
                ====================================================================
                Por favor selecciona el tipo de conversión y la cantidad deseada:
                1.- Dolar USD - Peso Mexicano.
                2.- Peso Mexicano - Dolar USD.
                3.- Euro - Peso Mexicano.
                4.- Peso Mexicano - Euro.
                5.- Peso Mexicano - Peso Argentino.
                6.- Peso Argentino - Peso Mexicano.
                0.- Salir.
                =====================================================================
                """;


        try {
            Scanner lectura = new Scanner(System.in);
            do {
                System.out.println(menu);
                System.out.print("Ingresa una opción: ");
                opcion = lectura.nextInt();
                switch (opcion) {

                    case 1:
                        System.out.print("Ingresa la cantidad: ");
                        cantidad = lectura.nextDouble();
                        conversion = consulta.consultaConversion("USD", "MXN", cantidad);
                        base = conversion.conversion_rate();
                        System.out.println("El tipo de cambio Dolar (USD) a Peso Mexicano (MXN) es: " + base);
                        convertido = conversion.conversion_result();
                        System.out.println("La conversión total Dolar (USD) a Peso Mexicano (MXN) es: " + convertido);
                        break;
                    case 2:
                        System.out.print("Ingresa la cantidad: ");
                        cantidad = lectura.nextDouble();
                        conversion = consulta.consultaConversion("MXN", "USD", cantidad);
                        base = conversion.conversion_rate();
                        System.out.println("El tipo de cambio Peso Mexicano (MXN) a Dolar (USD) es: " + base);
                        convertido = conversion.conversion_result();
                        System.out.println("La conversión total Peso Mexicano (MXN) a Dolar (USD) es: " + convertido);
                        break;
                    case 3:
                        System.out.print("Ingresa la cantidad: ");
                        cantidad = lectura.nextDouble();
                        conversion = consulta.consultaConversion("EUR", "MXN", cantidad);
                        base = conversion.conversion_rate();
                        System.out.println("El tipo de cambio Euro (EUR) a Peso Mexicano (MXN) es: " + base);
                        convertido = conversion.conversion_result();
                        System.out.println("La conversión total Euro (EUR) a Peso Mexicano (MXN) es: " + convertido);
                        break;
                    case 4:
                        System.out.print("Ingresa la cantidad: ");
                        cantidad = lectura.nextDouble();
                        conversion = consulta.consultaConversion("MXN", "EUR", cantidad);
                        base = conversion.conversion_rate();
                        System.out.println("El tipo de cambio Peso Mexicano (MXN) a Euro (EUR) es: " + base);
                        convertido = conversion.conversion_result();
                        System.out.println("La conversión total Peso Mexicano (MXN) a Euro (EUR) es: " + convertido);
                        break;
                    case 5:
                        System.out.print("Ingresa la cantidad: ");
                        cantidad = lectura.nextDouble();
                        conversion = consulta.consultaConversion("MXN", "ARS", cantidad);
                        base = conversion.conversion_rate();
                        System.out.println("El tipo de cambio Peso Mexicano (MXN) a Peso Argentino (ARS) es: " + base);
                        convertido = conversion.conversion_result();
                        System.out.println("La conversión total Peso Mexicano (MXN) a Peso Argentino (ARS) es: " + convertido);
                        break;
                    case 6:
                        System.out.print("Ingresa la cantidad: ");
                        cantidad = lectura.nextDouble();
                        conversion = consulta.consultaConversion("ARS", "MXN", cantidad);
                        base = conversion.conversion_rate();
                        System.out.println("El tipo de cambio Peso Argentino (ARS) a Peso Mexicano (MXN) es: " + base);
                        convertido = conversion.conversion_result();
                        System.out.println("La conversión total Peso Argentino (ARS) a Peso Mexicano (MXN) es: " + convertido);
                        break;
                    case 0:
                        System.out.println("Saliendo del sistema.");
                        break;
                    default:
                        System.out.println("\nIngrese una opción válida");
                }
            } while (opcion != 0);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
