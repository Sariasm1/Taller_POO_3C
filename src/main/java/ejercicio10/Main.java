/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author santi
 */
public class Main {

    public static void main(String[] args) {
        
        Bitacora bitacora = new Bitacora();
        
        try {
            bitacora.registrar("TEST: Prueba bitacora #1");
            bitacora.registrar("ERROR: Bitacora no iniciada");
            bitacora.registrar("TEST: Prueba bitacora #2");
            bitacora.registrar("ERROR: Bitacora no encontrada");
            
            System.out.println("====== Contenido de la bitacora ======");
            List<String> eventos = bitacora.leer();
            for (String e : eventos) {
                System.out.println(e);
            }
            
            int totalErrores = bitacora.contar("ERROR");
            System.out.println("----------------");
            System.out.println("Total de errores: " + totalErrores);
            System.out.println("----------------");
            
        } catch (IOException e) {
            System.out.println("ERROR: No se pudo procesar el archivo bitacora.txt");
        }
        
        try {
            FileReader fr = new FileReader("noexiste.txt");
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: El archivo 'noexiste.txt' no fue encontrado.");
        }
    }
}