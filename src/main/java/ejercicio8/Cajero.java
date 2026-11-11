/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicio8;
import java.util.Scanner;

/**
 *
 * @author santi
 */
public class Cajero {

    public static void main(String[] args) {
        
        int opc;
        double monto;
        Scanner scanner = new Scanner(System.in);
        CuentaBancaria cuenta = new CuentaBancaria("Santiago", 500000);
        
        try {
            for (;;){
                System.out.println("1. Consultar  2. Depositar  3. Retirar  4. Salir");
                System.out.print("Opcion: ");
                
                try {
                    opc = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Error: debe ingresar un numero.");
                    System.out.println("----------------");
                    continue;
                }
                
                if (opc == 4) {
                    System.out.println("CIERRE: Saliendo del programa.");
                    System.out.println("----------------");
                    break;
                }
                
                switch (opc) {
                    case 1 -> {
                        System.out.println("Saldo disponible: $" + cuenta.getSaldo());
                        System.out.println("----------------");
                    }
                    case 2 -> {
                        try {
                            System.out.print("Monto a depositar: ");
                            monto = Double.parseDouble(scanner.nextLine());
                            cuenta.depositar(monto);
                            System.out.println("- Deposito realizado con exito");
                            System.out.println("* Nuevo saldo: $" + cuenta.getSaldo());
                        } catch (NumberFormatException e) {
                            System.out.println("Error: debe ingresar un numero.");
                        } catch (MontoInvalidoException e) {
                            System.out.println(e.getMessage());
                        }
                        System.out.println("----------------");
                    }
                    case 3 -> {
                        try {
                            System.out.print("Monto a retirar: ");
                            monto = Double.parseDouble(scanner.nextLine());
                            cuenta.retirar(monto);
                            System.out.println("- Retiro realizado con exito.");
                            System.out.println("* Nuevo saldo: $" + cuenta.getSaldo());
                        } catch (NumberFormatException e) {
                            System.out.println("Error: debe ingresar un numero.");
                        } catch (MontoInvalidoException e) {
                            System.out.println(e.getMessage());
                        } catch (SaldoInsuficienteException e) {
                            System.out.println(e.getMessage());
                        }
                        System.out.println("----------------");
                    }
                    default -> {
                        System.out.println("Error: Opción no valida");
                        System.out.println("----------------");
                    }
                }
            }
        } finally {
            scanner.close();
        }
    }
}