/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja6;

/**
 *
 * @author Ma. Belen
 */
public class Desarrollador{
    /*esta clase guarda la informacion de cada desarrollador*/
    String nombre;
    int[] conjuntos= new int[3];
    
    public Desarrollador(String nombre, int conjunto1, int conjunto2, int conjunto3){
        this.nombre=nombre;
        conjuntos[0]=conjunto1;
        conjuntos[1]=conjunto2;
        conjuntos[2]=conjunto3;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setConjuntos (int[] conjuntos){
        this.conjuntos=conjuntos;
    }
    public String getNombre(){
        return nombre;
    }
    public int getJava(){
        return conjuntos[0];
    }
    public int getWeb(){
        return conjuntos[0];
    }
    public int getCelulares(){
        return conjuntos[0];
    }
}
