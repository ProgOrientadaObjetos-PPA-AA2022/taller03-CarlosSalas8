
package paquete1;

import java.util.Locale;
import paquete2.celular;

public class Ejecutor {

    public static void main(String[] args) {
        // TODO code application logic here
        celular e = new celular();
        celular f = new celular();
        String cadena = "";
        String sistemaoperativo = "Android";
        double tamañopantalla = 5.7;
        double costoinicial = 400.50;
        String direccionMAC = "183.233.123.32";
        int imei = 1123982304;

        String sistemaoperativo2 = "IOS";
        double tamañopantalla2 = 5;
        double costoinicial2 = 650.23;
        String direccionMAC2 = "123.56.23.43";
        int imei2 = 1394302489;

        int iva = 12;
        double porcentajedeiva = 0;
        double costofinal = 1;

        e.establecersistemaoperativo(sistemaoperativo);
        e.establecertamañopantalla(tamañopantalla);
        e.establecercostoinicial(costoinicial);
        e.estableceriva(iva);
        e.establecerporcentajedeiva(porcentajedeiva);
        e.establecercostofinal(costofinal);
        e.establecerdireccionmac(direccionMAC);
        e.establecerimei(imei);

        f.establecersistemaoperativo(sistemaoperativo2);
        f.establecertamañopantalla(tamañopantalla2);
        f.establecercostoinicial(costoinicial2);
        f.estableceriva(iva);
        f.establecerporcentajedeiva(porcentajedeiva);
        f.establecercostofinal(costofinal);
        f.establecerdireccionmac(direccionMAC2);
        f.establecerimei(imei2);

        cadena = String.format("Dispositivo 1\nSistema Operativo:%s\nTamaño de "
                + "Pantalla:%.2f\nDireccion MAC:%s\nIMEI:%d\nCosto Inicial:%.2f\n"
                + "IVA:%d\nValor del IVA:%.2f\nCosto Final:%.2f\n\n", 
                e.obtenersistemaoperativo(), 
                e.obtenertamañopantalla(), 
                e.obtenerdireccionMAC(), 
                e.establecerimei(), 
                e.obtenercostoinicial(), 
                e.obteneriva(), 
                e.obtenerporcentajedeiva(), 
                e.obtenercostofinal());
        cadena = String.format("%sDispositivo 2\nSistema Operativo:%s\nTamaño de"
                + " Pantalla:%.2f\nDireccion MAC:%s\nIMEI:%d\nCosto Inicial:%.2f\n"
                + "IVA:%d\nValor del IVA:%.2f\nCosto Final:%.2f\n", 
                cadena, 
                f.obtenersistemaoperativo(), 
                f.obtenertamañopantalla(), 
                f.obtenerdireccionMAC(), 
                f.establecerimei(), 
                f.obtenercostoinicial(), 
                f.obteneriva(), 
                f.obtenerporcentajedeiva(), 
                f.obtenercostofinal());
        System.out.printf("%s", cadena);
    }

}
