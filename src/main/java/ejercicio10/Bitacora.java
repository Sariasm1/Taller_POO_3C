/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 *
 * @author santi
 */
public class Bitacora {
    
    private final String archivo = "src/main/java/ejercicio10/bitacora.txt";
    
    public void registrar(String mensaje) throws IOException {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String fecha = LocalDateTime.now().format(formato);
        
        FileWriter fw = new FileWriter(archivo, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("[" + fecha + "] " + mensaje);
        pw.close();
    }
    
    public List<String> leer() throws IOException {
        return Files.readAllLines(Path.of(archivo));
    }
    
    public int contar(String palabra) throws IOException {
        List<String> lineas = leer();
        int contador = 0;
        
        for (String linea : lineas) {
            if (linea.toLowerCase().contains(palabra.toLowerCase())) {
                contador++;
            }
        }
        return contador;
    }
}