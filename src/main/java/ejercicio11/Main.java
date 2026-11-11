/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author santi
 */
public class Main {

    public static void main(String[] args) {
        
        String archivoEntrada = "notas.csv";
        String archivoSalida = "reporte.csv";
        
        int procesados = 0;
        int errores = 0;
        int numLinea = 1;
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivoEntrada));
            PrintWriter pw = new PrintWriter(new FileWriter(archivoSalida));
            
            pw.println("codigo,nombre,promedio,estado");
            String linea = br.readLine();
            
            while ((linea = br.readLine()) != null) {
                numLinea++;
                
                try {
                    String[] datos = linea.split(",");
                    
                    String codigo = datos[0];
                    String nombre = datos[1];
                    double n1 = Double.parseDouble(datos[2]);
                    double n2 = Double.parseDouble(datos[3]);
                    double n3 = Double.parseDouble(datos[4]);
                    double promedio = (n1 + n2 + n3) / 3.0;       
                    double promRedondeado = Math.round(promedio * 100.0) / 100.0;
                    
                    String estado;
                    if (promedio >= 3.0) {
                        estado = "APROBADO";
                    } else {
                        estado = "REPROBADO";
                    }
                    
                    pw.println(codigo + "," + nombre + "," + promRedondeado + "," + estado);
                    procesados++;
                    
                } catch (NumberFormatException e) {
                    System.out.println("ERROR en linea " + numLinea + ": Nota no numerica (" + linea + ")");
                    errores++;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("ERROR en linea " + numLinea + ": Faltan columnas o notas (" + linea + ")");
                    errores++;
                }
            }
            
            br.close();
            pw.close();
            //
            System.out.println("----------------");
            System.out.println("Registros procesados correctamente: " + procesados);
            System.out.println("Registros con error: " + errores);
            System.out.println("----------------");
            
        } catch (IOException e) {
            System.out.println("ERROR: No se pudo encontrar o procesar el archivo " + archivoEntrada);
        }
    }
}