/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.InstitucionEducativa;

/**
 *
 * @author ASUS
 */
public class Principal {
    public static void main (String[] args){
        InstitucionEducativa edu1 = new InstitucionEducativa();
        
        edu1.establecerNombre("Eloy Alfaro");
        edu1.establecerTInstitucion("Colegio");
        edu1.establecerNumeroAlumnos(2500);
        edu1.establecerNumeroDocentes(175);
        edu1.establecerNumeroSedes(10);
        
        System.out.printf("%s - %s - %d - %d- %d \n" ,edu1.obtenerNombre(), 
                edu1.obtenerTInstitucion(), edu1.obtenerNumeroAlumnos(), 
                edu1.obtenerNumeroDocentes(), edu1.obtenerNumeroSedes());
    }
}
