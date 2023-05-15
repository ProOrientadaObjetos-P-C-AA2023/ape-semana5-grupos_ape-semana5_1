/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabajogrupal;

/**
 *
 * @author USUARIOPC
 */
import java.util.Scanner;

class VentaProducto {
    private double precio;
    private int cantidad;

    public VentaProducto() {
        this.precio = 0.0;
        this.cantidad = 0;
    }

    public VentaProducto(double precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double calcularDescuento() {
        double descuento = 0.0;

        if (precio >= 1000 && cantidad >= 10) {
            descuento = precio * 0.1;
        } else {
            descuento = precio * 0.05;
        }

        return descuento;
    }

    public double calcularPrecioFinal() {
        double descuento = calcularDescuento();
        return precio - descuento;
    }
}