/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajogrupal;

import java.util.Scanner;

/**
 *
 * @author USUARIOPC
 */
public class EjecutorVentaProducto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        VentaProducto venta = new VentaProducto();

        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        venta.setPrecio(precio);

        System.out.print("Ingrese la cantidad de productos: ");
        int cantidad = sc.nextInt();
        venta.setCantidad(cantidad);

        double descuento = venta.calcularDescuento();
        double precioFinal = venta.calcularPrecioFinal();

        System.out.println("Descuento aplicado: " + descuento);
        System.out.println("Precio final de la compra: " + precioFinal);

        sc.close();
    }
}