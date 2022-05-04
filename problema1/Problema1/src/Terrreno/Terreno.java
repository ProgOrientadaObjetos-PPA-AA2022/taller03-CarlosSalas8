
package Terrreno;

public class Terreno {
    private double ancho;
    private double largo;
    private double valor_area;
    private double valorMetroCuadrado;
    private double costo_Terreno;
    
    
    public void establecerAncho(double c){
        ancho = c;
    }
    
    public void establecerLargo(double c){
        largo = c;
    }
    public void establecerArea(double c){
        valor_area = ancho * largo;
    }
    public void establecerValorMetroCuadrado(double c){
        valorMetroCuadrado = c;
    }
    // public void establecerValorFactura(){
    public void calcularCosto_Terreno(){
        costo_Terreno = valor_area * valorMetroCuadrado;
    }
    
    
    public double obtenerAncho(){
        return ancho;
    }
    
    public double obtenerLargo(){
        return largo;
    }
    public double obtenerArea(){
        return valor_area;
    }
    public double obtenerValorMetroCuadrado(){
        return valorMetroCuadrado;
    }
    
    public double obtenerCosto_Terreno(){
        return costo_Terreno;
    }
        
}