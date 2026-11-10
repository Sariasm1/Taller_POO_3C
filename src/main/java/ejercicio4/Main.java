/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicio4;

/**
 *
 * @author santi
 */
public class Main {

    public static void main(String[] args) {
        int maxMegapixeles = 0;
        Dispositivo[] dispositivos = {
            new Smartphone("Samsung", "Galaxy S24", 3500000, 50),
            new Camara("Canon", "EOS R50", 4200000, 24),
            new Smartphone("iPhone", "18 PRO MAX", 5500000, 108)
        };
        for (Dispositivo d : dispositivos) {
            d.describir();
            
            if (d instanceof Fotografiable f) {
                f.tomarFoto();
                if (f.getMegapixeles() > maxMegapixeles) {
                    maxMegapixeles = f.getMegapixeles();
                }  
            }
            
            if (d instanceof Llamable l) {
                l.llamar("3001234567");
                l.colgar();
            }
            System.out.println("---");
        }
        System.out.println("Mayor resolucion: " + maxMegapixeles + " MP");     
    }
}
