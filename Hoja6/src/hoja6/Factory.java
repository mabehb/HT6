/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja6;

import java.util.AbstractSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 *
 * @author Ma. Belen
 */
public class Factory {
    /*recibe un numero correspondiente a la eleccion de la implementacion*/
    public AbstractSet implementacion(int eleccion){
        AbstractSet implementacion = null;
        if (eleccion ==1){
            implementacion= new HashSet<Desarrollador>();
        }
        if (eleccion ==2){
            implementacion= new LinkedHashSet<Desarrollador>();
        }
        if (eleccion ==3){
            implementacion= new TreeSet<Desarrollador>(new ComparadorNombre());
        }
        return implementacion;
    }
    
}
