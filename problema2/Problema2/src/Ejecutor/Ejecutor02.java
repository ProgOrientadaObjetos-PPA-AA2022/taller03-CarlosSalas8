
package Ejecutor;

import problema2.EquivalenteHora;

public class Ejecutor02 {
    
    public static void main(String[] args) {
        // Crear un objeto de tipo FacturaTelefono
        EquivalenteHora  hr = new EquivalenteHora();

        // uso de los métodos establecer para darle valores a los 
        // atributos del objeto.
        hr.establecerHoras(10);
        hr.establecerMinutos();
        hr.establecerSegundos();
        hr.establecerDias();
        
        // hasta aquí el objeto ya tiene valores para sus atributos:
        // número de telefono, número de minutos consumidos en el mes, 
        // valor de cada minuto.
        // LLamo al método calcularValorFactura, no se envía parámetros,
        // pues trabaja con los valores de los atributos: número de minutos 
        // consumidos en el mes, valor de cada minuto; que ya los tiene el 
        // objeto.

        // Se hace uso de los métodos obtener para presentar en pantalla lo 
        // requerido
        System.out.printf("Equivalente Horas\n\nHoras: %s\n"
                + "Minutos: %.2f\nSegundos: %.2f\n"
                + "Dias: %.2f\n", hr.obtenerHoras(),
                hr.obtenerMinutos(), hr.obtenerSegundos(),
                hr.obtenerDias());
    }
}

    

