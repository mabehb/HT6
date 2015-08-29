/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja6;

import java.util.Comparator;

/**
 *
 * @author Ma. Belen
 */
public class ComparadorNombre implements Comparator<Desarrollador>{
    
    public int compare(Desarrollador primero, Desarrollador segundo){
        return primero.getNombre().compareTo(segundo.getNombre());
    }
}
