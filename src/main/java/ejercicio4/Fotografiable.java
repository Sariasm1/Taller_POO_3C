/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author santi
 */
public interface Fotografiable {
    void tomarFoto();
    int getMegapixeles();
    default String funcion() {
        return "Fotografia";
    }
}
