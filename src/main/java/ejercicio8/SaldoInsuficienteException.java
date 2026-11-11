/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author santi
 */
public class SaldoInsuficienteException extends Exception{
    
    private final double faltante;
    
    public SaldoInsuficienteException(double saldo, double monto) {
        super("Saldo insuficiente. Saldo: $" + (int)saldo + " - Faltan: $" + (int)(monto - saldo));
        this.faltante = monto - saldo;
    }
    
    public double getFaltante() {
        return faltante;
    }
}