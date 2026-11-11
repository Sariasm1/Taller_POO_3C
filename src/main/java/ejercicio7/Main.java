package ejercicio7;
import java.util.Scanner;

public class Main {

    public static double promedio(double[] notas) {
        if (notas.length == 0) {
            throw new IllegalArgumentException("No hay notas para promediar.");
        }
        double suma = 0;
        
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return suma / notas.length;
    }

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("¿Cuántas notas? ");
            int n = Integer.parseInt(scanner.nextLine());

            if (n <= 0) {
                throw new IllegalArgumentException("Las cantidad de notas debe ser un número entero positivo.");
            }
            double[] notas = new double[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Ingrese la siguiente nota: ");
                double nt = Double.parseDouble(scanner.nextLine());
                //
                if (nt < 0.0 || nt > 5.0) { 
                    throw new IllegalArgumentException("La nota digitada debe estar entre 0 - 5.");
                }
                notas[i] = nt;
            }

            System.out.println("Promedio: " + promedio(notas));

        } catch (NumberFormatException e) {
            System.out.println("El numero o formato ingresado no es valido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Las notas digitadas no son validas: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error general: " + e.getMessage());
        }
    }
}