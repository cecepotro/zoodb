/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.zoo.ui;

import mx.itson.zoo.entidades.Animal;
import mx.itson.zoo.persistence.AnimalDAO;

/**
 *
 * @author janto
 */
public class Main {
    
    public static void main(String[] args) {
        //AnimalDAO.obtenerTodos();
        
        Animal a = new Animal();
        a.setNombre("Nickardo");
        a.setEspecie("Capibara");
        a.setColor("Café");
        a.setAltura(0.5);
        AnimalDAO.guardar(a);
    }
}
