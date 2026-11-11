/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author santi
 */
public class MontoInvalidoException extends Exception{
    
    public MontoInvalidoException(double monto) {
        super("El monto debe ser mayor que 0. Se obtuvo: " + monto);
    }
}
