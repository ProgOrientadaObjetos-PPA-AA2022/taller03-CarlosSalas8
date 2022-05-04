
package paquete1;

import paquete2.escuela;

public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        escuela e = new escuela();
        escuela f = new escuela();
        String cadena = "";
        String nombre = "Siglo XXI";
        String tipodeinstitucion = "Privada";
        int numalumnos = 100;
        int numdocentes = 20;
        int numsedes = 1;
        double gastosporestudiante = 100.00;

        String nombre2 = "Miguel Riofrio";
        String tipodeinstitucion2 = "Publica";
        int numalumnos2 = 500;
        int numdocentes2 = 50;
        int numsedes2 = 2;
        double gastosporestudiante2 = 50.00;

        double presupuesto = 0;

        e.establecernombre(nombre);
        e.establecertipo(tipodeinstitucion);
        e.establecernumalumnos(numalumnos);
        e.establecernumdocentes(numdocentes);
        e.establecernumsedes(numsedes);
        e.establecergastosestudiante(gastosporestudiante);
        e.establecerpresupuesto(presupuesto);

        f.establecernombre(nombre2);
        f.establecertipo(tipodeinstitucion2);
        f.establecernumalumnos(numalumnos2);
        f.establecernumdocentes(numdocentes2);
        f.establecernumsedes(numsedes2);
        f.establecergastosestudiante(gastosporestudiante2);
        f.establecerpresupuesto(presupuesto);

        cadena = String.format("Institucion 1\nNombre:%s\nTipo de institución:%s\n"
                + "Numero de alumnos:%d\nNumero de docentes:%d\nNumero de sedes:%d\n"
                + "Gastos por estudiante:%.2f\nPresupuesto:%.2f\n\n",
                e.obtenernombre(),
                e.obtenertipo(),
                e.obtenernumalumnos(),
                e.obtenernumdocentes(),
                e.obtenernumsedes(),
                e.obtenergastosestudiante(),
                e.obtenerpresupuesto());

        cadena = String.format("%sInstitucion 2\nNombre:%s\nTipo de institución:%s\n"
                + "Numero de alumnos:%d\nNumero de docentes:%d\nNumero de sedes:%d\n"
                + "Gastos por estudiante:%.2f\nPresupuesto:%.2f\n\n",
                cadena,
                f.obtenernombre(),
                f.obtenertipo(),
                f.obtenernumalumnos(),
                f.obtenernumdocentes(),
                f.obtenernumsedes(),
                f.obtenergastosestudiante(),
                f.obtenerpresupuesto());
        System.out.printf("%s", cadena);
    }

}
