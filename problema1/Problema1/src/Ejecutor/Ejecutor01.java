
package Ejecutor;

import Terrreno.Terreno;

public class Ejecutor01 {
    
    public static void main(String[] args) {
        // Crear un objeto de tipo FacturaTelefono
        Terreno vt = new Terreno();
        // Valores de entrada
        double ancho = 50;
        double largo = 100;
        double valor_area = ancho * largo;
        double valorMetroCuadrado = 45 ;
        // uso de los métodos establecer para darle valores a los 
        // atributos del objeto.
        vt.establecerAncho(ancho);
        vt.establecerLargo(largo);
        vt.establecerArea(valor_area);
        vt.establecerValorMetroCuadrado(valorMetroCuadrado);
        vt.calcularCosto_Terreno();


        // hasta aquí el objeto ya tiene valores para sus atributos:
        // número de telefono, número de minutos consumidos en el mes, 
        // valor de cada minuto.
        // LLamo al método calcularValorFactura, no se envía parámetros,
        // pues trabaja con los valores de los atributos: número de minutos 
        // consumidos en el mes, valor de cada minuto; que ya los tiene el 
        // objeto.
                

        // Se hace uso de los métodos obtener para presentar en pantalla lo 
        // requerido
        System.out.printf("Costo Terreno Rectangular\n\nAncho: %s\n"
                + "Largo: %.2f\nArea: %.2f\n"
                + "Valor Metro Cuadrado: %.2f\nCosto Terreno: %.2f\n", vt.obtenerAncho(),
                vt.obtenerLargo(), vt.obtenerArea(),
                vt.obtenerValorMetroCuadrado(), vt.obtenerCosto_Terreno());
    }
}

    

