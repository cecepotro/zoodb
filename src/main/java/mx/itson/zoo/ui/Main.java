/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.zoo.ui;

import mx.itson.zoo.entidades.Animal;
import mx.itson.zoo.entidades.Jaula;
import mx.itson.zoo.persistence.AnimalDAO;

/**
 *
 * @author janto
 */
public class Main {
    
    public static void main(String[] args) {
        AnimalDAO.obtenerTodos();
        
        /*Animal a = new Animal();
        a.setNombre("Luna");
        a.setEspecie("Gata salvaje");
        a.setColor("Negra");
        a.setAltura(0.3);
        
        Jaula j = new Jaula();
        j.setNumero("Jaula de nieve 5");
        j.setUbicación("Zona desértica");
        
        a.setJaula(j);
        AnimalDAO.guardar(a);*/
    }
}
