/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author santi
 */
public interface Llamable {
    
    void llamar(String numero);
    void colgar();
    default String funcion() {
        return "Llamadas";
    }
}
