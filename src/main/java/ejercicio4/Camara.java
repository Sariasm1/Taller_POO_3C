/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author santi
 */
public class Camara extends Dispositivo implements Fotografiable{
    private final int megapixeles;

    public Camara(String marca, String modelo, double precio, int megaPixeles) {
        super(marca, modelo, precio);
        this.megapixeles = megaPixeles;
    }

    @Override
    public void describir() {
        System.out.println("Camara " + marca + " " + modelo + " - $" + precio + " - " + funcion());
    }
    
    @Override
    public void tomarFoto() {
        System.out.println(marca + " tomo una foto profesional de " + megapixeles);
    }

    @Override
    public int getMegapixeles() {
        return megapixeles;
    }
    
    
    
}
