/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajogrupal.problema2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USUARIOPC
 */
public class EjecutorEmpleado {
    public static void main(String[] args) {
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar un empleado");
            System.out.println("2. Mostrar información de los empleados");
            System.out.println("3. Calcular aumento de salario");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1: // Agregar un empleado
                    System.out.println("Ingrese el nombre del empleado:");
                    String nombre = scanner.next();
                    System.out.println("Ingrese el salario del empleado:");
                    double salario = scanner.nextDouble();
                    System.out.println("Ingrese la edad del empleado:");
                    int edad = scanner.nextInt();
                    Empleado empleado = new Empleado(nombre, salario, edad);
                    listaEmpleados.add(empleado);
                    break;

                case 2: // Mostrar información de los empleados
                    System.out.println("Información de los empleados:");
                    for (Empleado emp : listaEmpleados) {
                        System.out.println(emp.mostrarInformacion());
                    }
                    break;

                case 3: // Calcular aumento de salario
                    System.out.println("Ingrese el porcentaje de aumento de salario:");
                    double porcentajeAumento = scanner.nextDouble();
                    double salarioPromedio = 0.0;
                    for (Empleado emp : listaEmpleados) {
                        salarioPromedio += emp.getSalario();
                    }
                    salarioPromedio /= listaEmpleados.size();
                    for (Empleado emp : listaEmpleados) {
                        if (emp.getSalario() < salarioPromedio) {
                            double aumento = emp.getSalario() * (porcentajeAumento / 100);
                            emp.setSalario(emp.getSalario() + aumento);
                            System.out.println("El salario de " + emp.getNombre() + " ha aumentado a $" + emp.getSalario());
                        }
                    }
                    break;

                case 4: // Salir
                    System.out.println("¡Hasta luego!");
                    System.exit(0);

                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
