/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajogrupal.problema2;

/**
 *
 * @author USUARIOPC
 */

import java.util.ArrayList;
import java.util.Scanner;

// Clase Empleado
class Empleado {
    private String nombre;
    private double salario;
    private int edad;

    // Constructor de la clase Empleado
    public Empleado(String nombre, double salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }

    // Método para mostrar la información del empleado
    public String mostrarInformacion() {
        return "Nombre: " + nombre + ", Salario: $" + salario + ", Edad: " + edad;
    }

    // Métodos getters y setters para el nombre, salario y edad del empleado
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}