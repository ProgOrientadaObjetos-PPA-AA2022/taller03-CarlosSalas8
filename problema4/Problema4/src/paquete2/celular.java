
package paquete2;

public class celular {

    private String sistemaoperativo;
    private double tamaño;
    private double costoinicial;
    private int iva;
    private double porcentajedeiva;
    private double costofinal;
    private String direccionMAC;
    private int imei;
    

    public void establecersistemaoperativo(String c) {
        sistemaoperativo = c;
    }

    public void establecertamañopantalla(double d) {
        tamaño = d;
    }

    public void establecercostoinicial(double e) {
        costoinicial = e;
    }

    public void estableceriva(int f) {
        iva = f;
    }

    public void establecerporcentajedeiva(double g) {
        porcentajedeiva = (costoinicial*12)/100;
    }

    public void establecercostofinal(double h) {
        costofinal = costoinicial + porcentajedeiva;
    }

    public void establecerdireccionmac(String i) {
        direccionMAC=i;
    }
    public void establecerimei(int j) {
        imei=j;
    }

    public String obtenersistemaoperativo() {
        return sistemaoperativo;
    }

    public double obtenertamañopantalla() {
        return tamaño;
    }

    public double obtenercostoinicial() {
        return costoinicial;
    }

    public int obteneriva() {
        return iva;
    }

    public double obtenerporcentajedeiva() {
        return porcentajedeiva;
    }

    public double obtenercostofinal() {
        return costofinal;
    }

    public String obtenerdireccionMAC() {
        return direccionMAC;
    }
    public int establecerimei() {
        return imei;
    }

}
